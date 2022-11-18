package algoritmos_secuenciales;
import java.util.Scanner;
public class once {

	public static void main(String[] args) {

		/*
		* 11.	La presión, el volumen y la temperatura de una masa de aire se relacionan por la formula:
			Masa = (presión * volumen)/(0.37 * (temperatura + 460))
		* */

		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido al programa de calculo de masa");
		System.out.println("Ingrese la presion");
		double presion = sc.nextDouble();
		System.out.println("Ingrese el volumen");
		double volumen = sc.nextDouble();
		System.out.println("Ingrese la temperatura");
		double temperatura = sc.nextDouble();
		double masa = (presion * volumen) / (0.37 * (temperatura + 460));
		System.out.println("La masa es: " + masa);




	}

}
