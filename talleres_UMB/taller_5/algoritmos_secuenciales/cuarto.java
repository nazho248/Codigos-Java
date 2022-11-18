package algoritmos_secuenciales;
import java.util.Scanner;
public class cuarto {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
        /*
        Algoritmos secuenciales
        4.	Un maestro desea saber qué porcentaje de hombres y que porcentaje de mujeres hay en un grupo de estudiantes.
        */
		System.out.println("Bienvenido al programa de calculo de porcentajes de hombres y mujeres");
		System.out.println("Ingrese el numero de hombres");
		int hombres = sc.nextInt();
		System.out.println("Ingrese el numero de mujeres");
		int mujeres = sc.nextInt();
		int total = hombres + mujeres;
		double porcentajeHombres = (hombres * 100) / total;
		double porcentajeMujeres = (mujeres * 100) / total;
		System.out.println("El porcentaje de hombres es: " + porcentajeHombres + "%");
		System.out.println("El porcentaje de mujeres es: " + porcentajeMujeres + "%");



	}

}
