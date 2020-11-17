package cine;
import java.util.ArrayList;
import java.util.Scanner;

public class Cinecito {
	
	/* La empresa de cines El Campeón desea un sistema que le permita a sus clientes poder
    comprar entradas por medio de un software. El cliente debe seleccionar entre 3 películas
    disponibles y luego puede seleccionar sus asientos. Las salas solo tienen una localidad y
    todas tienen 20 sillas. El sistema solo debe permitir reservar un asiento a la vez si no está
    ocupado y también debe permitir ver cuáles y cuántos asientos están vacíos y reservados.
    El programa debe tener como mínimo una función/método adicional al main. */
	
	
	static int  contsillas = 0;
	static int IDboleto=0;
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Sala> salas = new ArrayList<Sala>(); 
	static ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>(); 
	static ArrayList<Boleto> clientes = new ArrayList<Boleto>();
	
	public static void main(String[] args) {
		
		int opcion=0;
		LLenarDatosSala();
		System.out.println("Bienvenido a Cine Master, A continuacion la lista de peliculas en cartelera :3");
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------");
		//imprimir titulos de peliculas
		for (Sala salas : salas) {
			System.out.println(salas.toSala());
		}
		System.out.println("");
		System.out.println("|--------------------------Menu del programa--------------------------|");
		do {
			
		System.out.print("¿Que opcion deseas realizar?\n"
				+ "1- Visualizar las salas y sus sillas disponibles\n"
				+ "2- Crear boleto\n"
				+ "3-Ver Boletos \n"
				+ "4- Finalizar programa\n"
				+ "->");
		opcion = sc.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.println("Visualizar salas y sillas");
			for (Sala salitas : salas) {
				System.out.println(salitas.toString());
				mostrarsillas(salas.lastIndexOf(salitas));

			}
			
			break;
		
		case 2:
			if (contsillas<60) {
				añadirBoleto();
			}
			else {
				System.out.println("<-----------------------------------------Cine lleno, Vuelva para la proxima :3--------------------------------------------------->");

			}
			
			break;
			
		case 3 :
			for (Boleto  boleticos : clientes) {
				System.out.println(boleticos.toString());
			}
			break;

		default:
			System.out.println("Opcion invalida, vuelve a intentarlo");
			break;
		}
		
		
		} while (opcion!=4);
		System.out.println("Fin del programa");

		
	}
	
	
	//añadir boleto :3 
	public static void añadirBoleto(){
		ArrayList<Silla> ocups = new ArrayList<Silla>();//lista sillas ocupadas para boleto
		
		int puestos=0;
		int opcionSala=0;
		Boleto boleto = new Boleto();
			do {
				

		System.out.println("Que pelicula desesas ver (elige la sala del 1 al 3)");
		opcionSala=ScannerInt(0, 4, "Digite un numero->"); //escanear sala, 1 2 o 3 nada mas
		opcionSala=opcionSala-1;
		
		if (salas.get(opcionSala).getSillasdisponibles()==0) {
			System.out.println("---------------Sala llena, por favor seleccione otra--------------------");
		}
			} while (salas.get(opcionSala).getSillasdisponibles()==0);
		System.out.println("Estas en la sala "+ salas.get((opcionSala)).getNumero() +" con la pelicula "+salas.get((opcionSala)).getPelicula());
		//Recoger datos para el boleto
		System.out.println("Digite su nombre ");
		boleto.setNombre(sc.next());
		boleto.setID(IDboleto);
		IDboleto++;
		System.out.println("Cuantos puestos desea asignar");
		//preguntar cuantas sillas quiere
		do {
			puestos = sc.nextInt();
			if (puestos<1) {
				System.out.println("Dato invalido, vuelve a introducirlo");
			}
			if ((salas.get(opcionSala).getSillasdisponibles()-puestos)<0) {
				System.out.println("Se ha excedido el limite de sillas. vuelve a intentarlo introduciendo un valor menor");
			}
		} while ((puestos <1)||(salas.get(opcionSala).getSillasdisponibles()-puestos<0));
		contsillas=contsillas+puestos;
		
		salas.get(opcionSala).setSillasdisponibles((salas.get(opcionSala).getSillasdisponibles()-puestos));
		System.out.println("Sillas disponibles para ver "+salas.get(opcionSala).getPelicula());
		int posicionx =0;
		int numsillaxd=0;
		for (int i = 0; i < puestos; i++) { //sacar sillas que quiere el usuario
			Silla ocupacion = new Silla(); //silla ocupada
			mostrarsillas(opcionSala);
			System.out.println("Digite la silla  "+(i+1));
			System.out.print("Digite el numero de silla:  ");
			do {
				do {
					posicionx = sc.nextInt();
					if ((posicionx<=0)||(posicionx>20)) {
						System.out.print("Ese numero de silla no existe, vuelva a digitarlo \n"
								+ "->");
					}
				} while ((posicionx<=0)||(posicionx>20));
				
				
				posicionx = posicionx-1;
				if (((salas.get(opcionSala).getSillas()).get(posicionx).getOcupado()==true)) {
					System.out.println("XXXXSilla ocupada, porfavor digite otra XXXX");
				}
			} while ((salas.get(opcionSala).getSillas()).get(posicionx).getOcupado()==true);

			for (Silla silla : salas.get(opcionSala).getSillas()) {

				if (silla.getNumsilla()==(posicionx+1)) {
							ocupacion.setNumsilla((posicionx+1));
							silla.setOcupado(true);
							ocups.add(ocupacion);
							numsillaxd++;
							System.out.println("---------------------------");
							break;
						}
					
				}//for each sillas
			}
		boleto.setSillisas(ocups);
		boleto.setPelicula(salas.get(opcionSala).getPelicula());;
		clientes.add(boleto);

	
	}
		
		
	
	
	public static int ScannerInt(int min, int max, String texto) {
		int x = 0;
		System.out.print(texto);
		do {
			x= sc.nextInt();
			if (((x<=min)||(x>=max))) {
				System.out.print("Dato invalido, vuelve a introducirlo ->");
			}
		} while ((x<=min)||(x>=max));
		
		
		return x;

	}
	
	
	
	public static void mostrarsillas(int x){
		System.out.println("Mostrando sillas sala "+(x+1));
		String leftAlignFormat = "( %-2s )  ";
			for (Silla  silla : salas.get(x).getSillas()) {

					if ((silla.getNumsilla()==5)||(silla.getNumsilla()==9)||(silla.getNumsilla()==13)||(silla.getNumsilla()==17)||(silla.getNumsilla()==21)) {
						System.out.println("");
					}
					
					if (silla.getOcupado() ){
					    System.out.format(leftAlignFormat,   "X");
					}
					else {
					    System.out.format(leftAlignFormat,   silla.getNumsilla());
					}
			}	
			System.out.println("");
			System.out.println("");
			
	}
	
	
	
	
	
public static void LLenarDatosSala() {

		// LLenado de datos de pelicula :3 
		String peliculasas[]=   
			    {"Peligro en la Montaña",
				"Cuando vuelva a verte",
				"Dragon ball Z        "};
		
		int durapel[]= {100 , 150 , 80};
		
		for (int i = 0; i < 3; i++) {
			Pelicula pelicula = new Pelicula ();
			pelicula.setDuracion(durapel[i]);
			pelicula.setPeli(peliculasas[i]);
			peliculas.add(pelicula);
		}
		
		 //llenar sala --------------
		for (int i = 0; i < 3; i++) {
			int cont = 0;
			Sala sala = new Sala();
			sala.setPelicula(peliculas.get(i));
			sala.setNumero((i+1));
			
			// LLenado de sillas ---------------
			for (int x = 0; x < 5; x++) {
				for (int y = 0; y < 4; y++) {
					
					Silla silla = new Silla();
					silla.setNumsilla((cont+1));
					silla.setPosicionX(x);
					silla.setPosiciony(y);
					silla.setOcupado(false);
					sala.getSillas().add(silla);
					cont++;
					
				}
			}
			salas.add(sala);
		}
		
		//Fin llenado salas
		

	}
}
