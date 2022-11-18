package algoritmos_secuenciales;
import java.util.Scanner;
public class tercero {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		* 3.	Un aprendiz desea saber cuál será su calificación final en la materia de Algoritmos. Dicha calificación se compone de los siguientes porcentajes:
	55% del promedio de sus tres calificaciones parciales.
	30% de la calificación del examen final.
	15% de la calificación de un trabajo final.
	* */

		System.out.println("Bienvenido al programa de calculo de calificaciones");
		System.out.println("Ingrese el valor de la primera calificacion parcial");
		double calificacion1 = sc.nextDouble();
		System.out.println("Ingrese el valor de la segunda calificacion parcial");
		double calificacion2 = sc.nextDouble();
		System.out.println("Ingrese el valor de la tercera calificacion parcial");
		double calificacion3 = sc.nextDouble();
		System.out.println("Ingrese el valor de la calificacion del examen final");
		double examenFinal = sc.nextDouble();
		System.out.println("Ingrese el valor de la calificacion del trabajo final");
		double trabajoFinal = sc.nextDouble();
		double promedioParciales = (calificacion1 + calificacion2 + calificacion3) / 3;
		double calificacionFinal = (promedioParciales * 0.55) + (examenFinal * 0.3) + (trabajoFinal * 0.15);
		System.out.println("El valor de su calificacion final es: " + calificacionFinal);
	}


}
