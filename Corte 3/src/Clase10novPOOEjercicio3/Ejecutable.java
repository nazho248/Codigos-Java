package Clase10novPOOEjercicio3;
import java.util.Scanner;

public class Ejecutable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido al creador de objetos de la tienda");
		int opcion;
		do {
			System.out.println("Inserte una opcion \n"
					+ "0. Salir\n"
					+ "1. Disco\n"
					+ "2. Libro\n"
					+ "3. Ventas");
			System.out.print("Digita una opcion");
			opcion= sc.nextInt();
			
			switch (opcion) {
			case 0:
				break;
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;



			default:
				System.out.println("OPCION INVALIDA, POR FAVOR DIGITE OTRA");
				break;
			}
			System.out.println("----------------------------------------");
		} while (opcion!=0);
		
	
		
	}

}
