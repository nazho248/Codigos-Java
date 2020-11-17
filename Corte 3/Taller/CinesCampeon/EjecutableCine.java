package CinesCampeon;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import cine.Boleto;



public class EjecutableCine {
	/* La empresa de cines El Campeón desea un sistema que le permita a sus clientes poder
    comprar entradas por medio de un software. El cliente debe seleccionar entre 3 películas
    disponibles y luego puede seleccionar sus asientos. Las salas solo tienen una localidad y
    todas tienen 20 sillas. El sistema solo debe permitir reservar un asiento a la vez si no está
    ocupado y también debe permitir ver cuáles y cuántos asientos están vacíos y reservados.
    El programa debe tener como mínimo una función/método adicional al main. */
	
	
	public static void main(String[] args) {
		
		int serial = 0;
		Scanner sc =new Scanner(System.in);
		String xd[]= {"Batman","Superman","Amongo"};
		ArrayList<Sala> salas = new ArrayList<Sala>();
		ArrayList<Entrada>entradas = new ArrayList<Entrada>();
		int opcion =0, opcionpelicula =0;
		
		//cartelera 
		
		for (int i = 0; i < 3; i++) {
			Sala sala = new Sala();
			sala.setNumSala((i+1));
			sala.setPelicula(xd[i]);
			salas.add(sala);
		}
		System.out.println("La cartelera: ");
		for (Sala sala : salas) {
			System.out.println(sala.Sala());

		}
		
		
		do {
			System.out.println("Que accion deseas realizar ");
			System.out.println("1-Registrar Entrada");
			System.out.println("2- Imprimir Boletos ");
			System.out.println("3- Finalizar programa");
			System.out.println("Digite la opcion");
			opcion = sc.nextInt();
			
			
			switch (opcion) {
			case 1:
				Entrada entrada = new Entrada();             //Boleto
				System.out.println("Registrando Entrada");
				System.out.println("Escoja la pelicula");
				int asdasf=1;
				for (Sala  pelicula : salas) {
					
					System.out.println(asdasf+".  "+pelicula.getPelicula());
					asdasf++;
				}
				
				do {
					opcionpelicula = sc.nextInt();
					if ((opcionpelicula<1)||(opcionpelicula>3)) {
						System.out.println("Dato invalido, vuelve a realizarlo");
					}
				} while ((opcionpelicula<1)||(opcionpelicula>3) );
				
				System.out.println("Cuantas sillas desea apartar");
				int sillasapartadas = sc.nextInt();
				
				//sillas disponibles -------------------------------
				System.out.println("Sillas disponibles:");
				for (int i = 0; i <20; i++) {
					if (salas.get(opcionpelicula).getSillas().get(i).isOcupado()) {
					}
					else {
						System.out.println(salas.get(opcionpelicula).getSillas().get(i).toDisponible());
					}
				}

				
				ArrayList<Silla>sillasocupadas = new ArrayList<>();
				for (int i = 0; i < sillasapartadas; i++) {
					Silla silla = new Silla();
					System.out.println("Digite el numero de la silla que desea apartar ");
					int asd = sc.nextInt();
					silla = salas.get(opcionpelicula).getSillas().get((asd-1));
					salas.get(opcionpelicula).getSillas().get((asd-1)).setOcupado(true);
					sillasocupadas.add(silla);
				}
				entrada.setSillasO(sillasocupadas);
				entrada.setSerial(serial);
				serial++;
				System.out.println("Impresion de boleto");
				System.out.println(entrada.toString());

			break;
			case 2 :
				
				for (Entrada  listaEn : entradas) {
					System.out.println(listaEn.toString());
				}
			break;
				
				
				
				}
				
		} while (opcion!=3);
		
}
}
	
