package Parcial;

import java.util.Scanner;

public class punto1 {
	
	/* Realice y represente mediante diagrama de flujo y pseudocódigo un algoritmo que
    lea los nombres y las edades de diez alumnos, y que los datos se almacenen en dos
    vectores, y con base en esto se determine el nombre del alumno con la edad
    mayor del arreglo.*/

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int E=10;
		String nombres []= new String [E];
		int edad [] = new int [E];
		
		edad= rellenadorN(edad);
	
		System.out.println("Bienvenido para calcular el alumno mayor de un curso de 10 estudiantes ");
		
		System.out.println("Introduzca el nombre de los estudiantes");
		
		//introducir nombres
		for (int i = 0; i < nombres.length; i++) {
			System.out.print("inserte el nombre para el estudiante "+(i+1)+":");
			nombres [i]= sc.next();
		}
		//introducir edades
		for (int i = 0; i < edad.length; i++) {

			while (edad[i]<0){
		    System.out.print("introduce la edad de "+nombres[i]+": ");
			edad [i] = scanner(" " , 1000000000 , 0);
			}
		}
		
		for (int i = 0; i < edad.length; i++) {
			System.out.print("("+nombres[i]+") "+edad[i]+";");
		}
		
		int mayor=0, pos=0;
		
		for (int i = 0; i < edad.length; i++) {
			if (edad[i]>=mayor) {
				mayor=edad[i];
				pos=i;
			}
		}
		System.out.println("");
		System.out.println("EL alumno "+nombres[pos]+" con "+edad[pos]+" años es el mayor del grupo de "+E+" estudiantes");

		}
	
	
	//scanner
	public static int scanner ( String x,int max,int min ){	
		Scanner sc = new Scanner(System.in);
		int variable = 0;
		System.out.print(x);
		variable = sc.nextInt();
		
		if ((variable<min)||(variable>max)) {
			System.out.println("Dato invalido");
			return -1;
		}
		return variable;
	}
	//rellenador para negativos
	public static int[] rellenadorN(int[] x) {
		
		for (int i = 0; i < x.length; i++) {
			x[i]=-1;			
		}
		return x;
	}
	
}

