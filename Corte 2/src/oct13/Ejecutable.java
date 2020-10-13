package oct13;

import java.util.Scanner;
public class Ejecutable {

	public static void main(String[] args) {
		
		Edificio objEdificio = new Edificio(13 , 45.5f , 17);
		System.out.println("Edificio definido en codigo");
		
		System.out.println("El edificio 1 tiene:"+objEdificio.pisos+" pisos donde viven "
				+ objEdificio.inquilinos+ " inquilinos en un área de "+objEdificio.area+"  metros cuadrados,"
				+ " el área por persona es "+objEdificio.areaxpersona+" metros por persona.\r\n" );
		
		System.out.println("_____________________________________________");
		System.out.println("Edificio datos predeterminados");
		
		Edificio objEdificio_2 = new Edificio();
		
		System.out.println("El edificio 2 tiene "+objEdificio_2.inquilinos+" inquilinos en un área de "+objEdificio_2.area+" metros cuadrados,"
				+ "el área por persona es "+objEdificio_2.areaxpersona+" metros por persona" );

		System.out.println("___________________________________________________");
		System.out.println("Edificio datos insertados");
		Edificio objEdificioTeclado = new Edificio();
		Scanner sc= new Scanner(System.in);
		
		do {
		System.out.print("inserte numero pisos: ");
		//int valor = sc.nextInt();
		//aqui se da el valor en el ()
		//Edificio objEdificioTeclado = new Edificio(valor);

		objEdificioTeclado.setPisos(sc.nextInt());
		} while (objEdificioTeclado.getPisos()==0);
		
		
		System.out.print("digite el area: ");
		objEdificioTeclado.area = sc.nextFloat();
		System.out.print("digite el inquilinos: ");
		objEdificioTeclado.inquilinos = sc.nextInt();
		System.out.println("-");
	
		System.out.println("pisos edificio : "+objEdificioTeclado.pisos);
		System.out.println("El area es de "+ objEdificioTeclado.area);
		System.out.println("Hay "+ objEdificioTeclado.inquilinos+" inquilinos");
		
		
		System.out.println("___________________________________________________");
		System.out.println("Edificio aleatorio");
		
		Edificio objEdificioAleatorio = new Edificio();
		
		objEdificioAleatorio.pisos = (int) Math.floor(Math.random()*(50-(0)+1)+(0));; 
		objEdificioAleatorio.area = (int) Math.random()*(100-(0)+1)+(0);; 
		objEdificioAleatorio.inquilinos = (int) Math.floor(Math.random()*(35-(0)+1)+(0));; 
		
		System.out.println("pisos edificio teclado: "+objEdificioAleatorio.pisos);
		System.out.println("El area es de "+ objEdificioAleatorio.area);
		System.out.println("Hay "+ objEdificioAleatorio.inquilinos+" inquilinos");
		
		
		// (int) Math.floor(Math.random()*(9-(0)+1)+(0));
		
		
		
	}

}
