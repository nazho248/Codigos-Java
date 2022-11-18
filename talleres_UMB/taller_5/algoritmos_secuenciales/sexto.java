package algoritmos_secuenciales;
import java.util.Scanner;
public class sexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Algoritmos Secuenciales
		* 6.	Dada una cantidad en pesos, obtener la equivalencia en dólares, asumiendo que la unidad cambiaría es un dato desconocido.
		* */

		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido al programa de conversion de pesos a dolares");
		System.out.println("Ingrese la cantidad de pesos");
		double pesos = sc.nextDouble();
		System.out.println("Ingrese el valor de la unidad de cambio");
		double unidadCambio = sc.nextDouble();
		double dolares = pesos / unidadCambio;
		System.out.println("La cantidad de dolares es: " + dolares);



	}

}
