package corregir;
import java.util.Scanner;

public class Ejecutable {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("introduza el nombre del estudiante 1 a br");
	        Estudiante alumno[] = new Estudiante[10];
	        float notas[] = new float [5];
	        

			 alumno[1].setNombre(sc.next());

	        System.out.println(alumno[1].getNombre());
	        
	        

	        for (int i = 0; i < alumno.length; i++) {
	            System.out.println("Digite el nombre del estudiante " + i);
	            alumno[i].setNombre("xd"); 
	            for (int j = 0; j < notas.length; j++) {
	                System.out.println("Digite la nota " + j);
	                notas[j] = sc.nextFloat();
	            }
	        }
	     /* Hola profe buena noche
	      * Profe debido a los inconvenientes manifestados en mi codigo para el ejercicio
	      * de tarea me eh visto en la obligacion de irme a dormir porq no entiendo el porq 
	      * me vota error cuando quiero pedir los nombres. agradesco su comprension, un besito.
	      */



	    }

	}


