package Ejercicios2cortePT1;
import java.util.Scanner;

public class ejercicio4 {
	/*Se tienen los nombres de los N alumnos de una escuela, 
	 *además de su promedio general. Realice un algoritmo para 
	 *capturar esta información, la cual se debe almacenar en arreglos,
	 *un vector para el nombre y otro para el promedio, después de capturar
	 *la información se debe ordenar con base en su promedio, de mayor a menor,
	 *los nombres deben corresponder con los promedios. */
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hola profe que tal :c");
		System.out.println("Inserte la cantidad de alumnos");
		int alumnos = sc.nextInt();   //numero alummnos
		float aux, suma=0;
		
		String estudiantes[]= new String[alumnos];
		float promedio[]= new float [alumnos], ordenado[]=new float[alumnos];
		
		
		//llenado de nombres
		System.out.println("inserte los nombres de sus "+alumnos+ " estudiantes");
		for (int i = 0; i < estudiantes.length; i++) {
			System.out.print("Inserte el nombre del estudiante "+(i+1)+": ");
			estudiantes[i] = sc.next();
		}
		
		//llenado datos del promedio
		System.out.println("inserte la nota de sus "+alumnos+" preciados estudiantes");
		for (int i = 0; i < promedio.length; i++) {
				System.out.print("inserte el promedio de "+estudiantes[i]+": ");
				promedio[i]= sc.nextFloat();
				ordenado[i]= promedio[i]; //para ordenar
				suma = suma+promedio[i];
		}
		
	

		for (int i = 0; i < ordenado.length; i++) {
			for (int j = i+1; j < ordenado.length; j++) {
				
				if (ordenado[i]<ordenado[j]) {
					aux = ordenado[i];
					ordenado[i]=ordenado[j];
					ordenado[j]=aux;
				}
			}
		}
		System.out.println("El orden de mayor a menor promedio es:");
		for (int i = 0; i < ordenado.length; i++) {
			for (int j = 0; j < ordenado.length; j++) {
				if(ordenado[i]==promedio[j]) {
					System.out.println("("+(i+1)+")"+estudiantes[j]+" "+ordenado[i]);
				}
				
			}
		}
		System.out.println("El promedio General del curso de "+alumnos+" es de "+(suma/alumnos));
		
	}
}
	


