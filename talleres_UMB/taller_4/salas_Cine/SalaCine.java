package salas_Cine;

import java.util.Scanner;

public class SalaCine {
	
	static Scanner sc = new Scanner(System.in);
	static int[][] salas = new int[7][15];
	static int[] totalSala = new int[7];
	static int[] totalPeliculas = new int[15];
	//nombre de 15 pelicculas cortas
	static String[] peliculas = {"La vida es bella", "El padrino", "El señor de los anillos", "El club de la lucha",
			"El pianista", "El silencio de los corderos", "El bueno, el feo y el malo", "El laberinto del fauno",
			"El exorcista", "El imperio contraataca", "El caballero oscuro", "Home alone",
			"Batimovil", "Madagasca", "Shrek"};
	public static void main(String[] args) {
		int opcion = 222;
		/*
		* El gerente de las salas de cine Cinemax desea conocer algunas estadísticas
		* respecto de las películas más vistas. Las mismas 15 películas son exhibidas en
		* cada una de las 7 salas de cine. Para cada sala se requiere almacenar el total
		* de personas que han asistido a ver cada película.
		* Se requiere saber cuál es la mejor combinación sala-película, más vista. Cual fue la película más vista.
		* */
		
		llenarSalas();

		do {
			System.out.println("\n\n\n\n\n\n\n\n");
			System.out.println("--------------------------Cinemax El poLillo----------------------------------");
			System.out.println("Las peliculas que se estan proyectando son: ");
			for (int i = 0; i < peliculas.length; i++) {
				System.out.println((i+1)+". "+peliculas[i]);
			}
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.println("Menu de navegacion");
			System.out.println("1. Generar datos aleatorios");
			System.out.println("2. Imprimir datos de cada sala");
			System.out.println("3. Imprimir pelicula mas vista");
			System.out.println("4. Imprimir mejor combinacion sala-pelicula");
			System.out.println("5. Salir");
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.println("Ingrese una opcion: ");
			System.out.print("-> ");
			opcion = scannerNumero(1,5);
			
			switch(opcion) {
			case 1:
				// generar datos aleatorios
				llenarSalas();
				break;
			case 2:
				//imprimir datos de cada sala
				imprimirSalas();
				break;
			case 3:
				//imprimir pelicula mas vista
				peliculaMasVista();
				break;
			case 4:
				//imprimir mejor combinacion sala-pelicula
				mejorCombinacion();
				break;
			case 5:
				System.out.println("Gracias por usar el programa");
				break;
			}
			System.out.println("Bienenido a la app para gestionar las salas de cine imprimiendo la mejor y la peor sala");
			System.out.println("Los datos fueron generados aleatoriamente :)");
			System.out.println("--------------------------Cinemax El poLillo----------------------------------");
			System.out.println("Las peliculas que se estan proyectando son: ");
			for (int i = 0; i < peliculas.length; i++) {
				System.out.println((i+1)+". "+peliculas[i]);
			}
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.println("Menu de navegacion");
			System.out.println("1. Generar datos aleatorios");
			System.out.println("2. Imprimir datos de cada sala");
			System.out.println("3. Imprimir pelicula mas vista");
			System.out.println("4. Imprimir mejor combinacion sala-pelicula");
			System.out.println("5. Salir");
			System.out.println("--------------------------------------------------------------------------------------");
			System.out.println("Ingrese una opcion: ");
			System.out.print("-> ");
			opcion = scannerNumero(1,5);
			
			switch(opcion) {
			case 1:
				// generar datos aleatorios
				llenarSalas();
				break;
			case 2:
				//imprimir datos de cada sala
				imprimirSalas();
				break;
			case 3:
				//imprimir pelicula mas vista
				peliculaMasVista();
				break;
			case 4:
				//imprimir mejor combinacion sala-pelicula
				mejorCombinacion();
				break;
			case 5:
				System.out.println("Gracias por usar el programa");
				break;
			}
		}while(opcion!=5);
		System.out.println("Bienenido a la app para gestionar las salas de cine imprimiendo la mejor y la peor sala");
		System.out.println("Los datos fueron generados aleatoriamente :)");
	}

	public static void llenarSalas() {
		for (int i = 0; i < salas.length; i++) {
			for (int j = 0; j < salas[i].length; j++) {
				salas[i][j] = (int) (Math.random()*100);
			}
		}
		sumaPeliculas();
		sumaSala();
	}

	public static void imprimirSalas() {
		for (int i = 0; i < salas.length; i++) {
			System.out.println("###################################Sala "+(i+1)+"###################################");
			for (int j = 0; j < salas[i].length; j++) {
				System.out.println("Pelicula: "+peliculas[j]+" asistieron: "+salas[i][j]);
			}
			System.out.println();
		}
	}

	//mejor combinacion sala pelicula
	public static void mejorCombinacion() {
		int mayor = 0;
		int sala = 0;
		int pelicula = 0;
		for (int i = 0; i < salas.length; i++) {
			for (int j = 0; j < salas[i].length; j++) {
				if(salas[i][j]>mayor) {
					mayor = salas[i][j];
					sala = i;
					pelicula = j;
				}
			}
		}
		System.out.println("La mejor combinacion es la sala "+(sala+1)+" con la pelicula "+peliculas[pelicula]+" con "+mayor+" asistentes");
	}


	public static int scannerNumero(int min, int max) {
		int numero =0;
		do {
			numero = sc.nextInt();
			if(numero<min || numero >max) {
				System.out.println("Numero fuera de rango, digitalo nuevamente");
				System.out.print("-> ");
			}
		}while(numero<min || numero >max);
		return numero;
	}

	public static void sumaSala() {
		for (int i = 0; i < salas.length; i++) {
			for (int j = 0; j < salas[i].length; j++) {
				totalSala[i] += salas[i][j];
			}
		}
	}

	public static void sumaPeliculas() {
		for (int i = 0; i < salas.length; i++) {
			for (int j = 0; j < salas[i].length; j++) {
				totalPeliculas[j] += salas[i][j];
			}
		}
	}

	public static void peliculaMasVista() {
		int mayor = 0;
		int pos = 0;
		for (int i = 0; i < totalPeliculas.length; i++) {
			if (totalPeliculas[i] > mayor) {
				mayor = totalPeliculas[i];
				pos = i;
			}
		}
		System.out.println("La pelicula mas vista es: "+peliculas[pos]+" con "+mayor+" asistentes");
		//en la sala
		int mayorSala = 0;
		int posSala = 0;
		for (int i = 0; i < salas.length; i++) {
			if (salas[i][pos] > mayorSala) {
				mayorSala = salas[i][pos];
				posSala = i;
			}
		}
		System.out.println("En la sala: "+(posSala+1)+" con "+mayorSala+" asistentes");
	}
	
	
	
}
