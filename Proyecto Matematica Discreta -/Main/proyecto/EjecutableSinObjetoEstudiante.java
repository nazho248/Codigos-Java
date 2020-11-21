package proyecto;
import java.util.Scanner;
import java.util.ArrayList;

public class EjecutableSinObjetoEstudiante {
	
	
	static Scanner sc = new Scanner(System.in);
	static  ArrayList<String> estudiantes = new ArrayList<String>();
	static ArrayList<String> ganadores = new ArrayList<String>();
	
	//(int) Math.floor(Math.random()*(max-(min)+1)+(min)); FORMULA numero aleatorio entre maximo y minimo ;3

	
	public static void main(String[] args) {
		

		int opcion =0;
		int contador=0;
		int opsecu=0;
		
		System.out.println("Bienvenido  al programa para elegir los 5 ganadores \n"
				+ "del sorteo al viaje a sillicon valey del programa de ingenieria de software. \n"
				+ "Por : Jair Andres Gonzalez Ruiz");
		
		do {
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.print("Elige la opcion a relizar                                                                           |\n"
					+ "1- Registrar Estudiante                                                                             |\n"
					+ "2- Imprimir Estudiantes Registrados                                                                 |\n"
					+ "3- Ejecutar el Sorteo e imprimir Ganadores                                                          |\n"
					+ "0- Finalizar el programa \n ->");
			opcion =sc.nextInt();
			System.out.println("----------------------------------------------------------------------------------------------------");

			switch (opcion) {
			case 0:
				System.out.println("Fin del programa");
				break;
			
			case 1:
				
				contador++; //Contador inicia en 1
				String estudiante = "";
				System.out.println("----------Registrando nuevo estudiante ----------");
				System.out.print("Digita el nombre del estudiante  ->");
				estudiante =sc.next();
				estudiantes.add(estudiante);

				
			/*	System.out.println("Seguro que quieres registrar a "+estudiante.getNombre()+" Si=1 / No=0");
				if (opsecu==1) {
				}
				else {
					System.out.println("El estudiante no se ha guardado :)");
				}*/
				// --------------------------------------------------------------
				break;
			case 2:
				int xd=1;
				System.out.println("Estudiantes  Registrados");
				for (String  ests : estudiantes) {
					System.out.println("("+xd+")- "+ests.toString());
					xd++;
				}
				if (estudiantes.size()==0) 
				System.out.println("XXXNo hay estudiantes registradosXXX");{
				}
				
				break;
			case 3:
				int aleatorio=0 , max=0, min=0;
				  ArrayList<String> participantes = new ArrayList<String>();
					participantes = (ArrayList<String>) estudiantes.clone();
				if (contador < 5 ) {
					System.out.println("No hay suficientes estudiantes para ejecutar el sorteo para 5 ganadores");
					System.out.println("Por favor introduzca "+(5-contador)+" estudiantes más ");
				}
				else {
					for (int i = 0; i < 5; i++) {
						
						max = participantes.size()-1;
						String ganador = "";
						aleatorio =(int) Math.floor(Math.random()*(max-(min)+1)+(min)); 
						ganador = participantes.get(aleatorio);
						participantes.remove(aleatorio);
						ganadores.add(ganador);
					}
					
					int contindex=0;
					System.out.print("Ganadores: ");
					
					for (String  won : ganadores) {
						System.out.print(won.toString());
						if (contindex==4) {}
						else {
							System.out.print(" - ");
						}
						contindex++;
					}
					System.out.println("");
				}
				
				ganadores.clear();
				
				
				break;

			default:
				System.out.println("Opcion invalida");
				break;
			}
			
		} while (opcion!=0);
		
		  System.exit(0);

		
	}

}
