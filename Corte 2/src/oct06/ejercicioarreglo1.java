package oct06;
import java.util.Scanner;
public class ejercicioarreglo1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantos estudiantes tiene?");
		int estudiantes = sc.nextInt(); 
		System.out.println("¿ Cuantas materias tiene?");
		int asignaturas = sc.nextInt();
		
	   float tabla [][] = new float [estudiantes][asignaturas];
		
		for (int i = 0; i < tabla.length; i++) {
			
			for (int j = 0; j < tabla.length; j++) {
				System.out.println("Digite La nota para el estudiante "+(i+1)+" para la asignatura " + (j+1));
				tabla [i][j] = sc.nextFloat();
			}
			
		}
		
		for (int i = 0; i < tabla.length; i++) {
			
			for (int j = 0; j < tabla.length; j++) {
				System.out.println ( " La nota para el estudiante  "+(i+1)+" para la asignatura " + (j+1)+ " es " +tabla [i][j] );

			}
			
		}
		
	
	}
}

