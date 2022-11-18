package algoritmos_secuenciales;

import java.util.Scanner;
public class quinto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Algoritmos Secuenciales
		5.	Realizar un algoritmo que calcule la edad de una persona.*/

		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido al programa de calculo de edad");
		System.out.println("Ingrese el año de nacimiento");
		int anioNacimiento = sc.nextInt();
		System.out.println("Ingrese el mes de nacimiento");
		int mesNacimiento = sc.nextInt();
		System.out.println("Ingrese el dia de nacimiento");
		int diaNacimiento = sc.nextInt();
		System.out.println("Ingrese el año actual");
		int anioActual = sc.nextInt();
		int edad = anioActual - anioNacimiento;
		System.out.println("La edad de la persona es: " + edad);




	}

}
