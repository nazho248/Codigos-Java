package Actividad1Poo;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutable2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Estudiante2> alumnos = new ArrayList<Estudiante2>();
		
		for (int i = 0; i < 2; i++) {
			Estudiante2 est = new Estudiante2();
			System.out.println("Digite el nombre del estudiante "+(i+1));
			est.setNombre(sc.next());
			

			for (int j = 0; j < 3; j++) {
				Materia materia = new Materia();

				
				
				System.out.println("Digite el nombre de la materia "+j);
				materia.setNombre(sc.next());
				System.out.println("inserte la nota de la materia "+j);
				materia.setNota(sc.nextFloat());
				
				
				do {
					System.out.println("inserte los creditos de la materia "+j);
					materia.setCreditos(sc.nextInt());
				} while (materia.getCreditos()==0);
				
			}
			alumnos.add(est);

		}
		
		
		//impresion 
		int posicion=0;
		float notamayor=0;
		Estudiante2 mejorestudiante = new Estudiante2();
		

		for (Estudiante2 alumno : alumnos) {
			System.out.println(alumno.toString());
			System.out.println(alumno.Promedio());
		
		if (alumno.Promedio()>notamayor) {
			notamayor=alumno.Promedio();
			posicion = alumnos.indexOf(alumno);
			mejorestudiante= alumno;
		}
		}
		
	
		System.out.println("El mejor promedio es: "+mejorestudiante.Promedio()+" del estudiante "+mejorestudiante.getNombre());
		
		

		

	}

}
