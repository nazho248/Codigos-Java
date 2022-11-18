package binary_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class binary_search {

	static Scanner sc = new Scanner(System.in);
	static int numerodatos=1000;
	static int[] arreglodatosordenados;
	static int [] arregloorigen;
	static long startTime;
	static long endTime;
	static long totalTime;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*a.	Elabore un programa en lenguaje de programaci�n Java que permita realizar
		 *  una b�squeda binaria sobre un consunto de datos ordenados. Defina un valor
		 *   y realice pruebas de b�squeda para arreglos de tama�o 100, 1000, 5000, 10000
		 *    y 100000 (recuerde que los arreglos deben estar ordenados). Tome los tiempos
		 *     en cada caso y realice una gr�fica.
		 * */
		int opcion =2;
		System.out.println("Bienvenido al programa que permite evaluar la busqueda binaria con diferentes tama�os de arreglo");
		generararregloordenado(); //al iniciar el programa genero un arreglo ordenado
		
		do {
			System.out.println("\n\n\n\n\n\n");
			System.out.println("-------------------------------------------------------------");
			System.out.println("Menu de navegaci�n");
			System.out.println("->N�mero de datos a evaluar: "+numerodatos);
			System.out.println("1. Generar nuevo arreglo");
			System.out.println("2. Cambiar el numero de datos a evaluar");
			System.out.println("3. Buscar un numero de forma binaria");
			System.out.println("4. Buscar un numero de forma lineal");
			System.out.println("5. Imprimir arreglo en un rango determinado");
			System.out.println("0. Salir del programa");
			System.out.println("6. Evlauar 10 veces la busqueda binaria");
			System.out.println("7. Evlauar 10 veces la busqueda lineal");

			System.out.println("-------------------------------------------------------------");
			System.out.println("Elige una opcion");
			System.out.print("-> ");
			opcion = scannerNumero(0, 7);
			System.out.println("\n\n\n\n\n\n\n\n\n\n");

			switch (opcion) {
			case 0:
				System.out.println("Fin del programa :)");
				break;
			case 1:
				generararregloordenado();
				//generar nuevo arreglo
				break;
			case 2:
				System.out.println("Ingrese el numero de datos a evaluar");
				System.out.print("-> ");
				numerodatos = scannerNumero(0, 1000000000);
				generararregloordenado();
				//cambiar numero de datos a evaluar
			break;
			case 3:
				//buscar numero de forma lineal
				buscarbinario();
				break;
			case 4:
				buscarlineal();
				//buscar forma de forma lineal
				break;
			case 5:
				//imprimir arreglo en un rango determinado
				int inicio,fin;
				System.out.println("Ingrese el inicio del rango");
				System.out.print("-> ");
				inicio = scannerNumero(0, numerodatos);
				System.out.println("Ingrese el fin del rango ("+ (numerodatos)+" datos )");
				System.out.print("-> ");
				fin = scannerNumero(inicio+1, numerodatos);
				imprimirarreglo(arreglodatosordenados, inicio, fin);
				System.out.println();
				break;
			case 6:
				//evaluar 10 veces la busqueda binaria
				evaluarbusqueda(1);
				break;
			case 7:
				//evaluar 10 veces la busqueda lineal
				evaluarbusqueda(2);
				break;
			}
		}while(opcion != 0);

	}

	public static void evaluarbusqueda(int tipo) {
		int cantidadevaluaciones =10000;
		int numeroabuscar;
		//buscar numero aleatorio
		numeroabuscar = (int) (Math.random() * numerodatos);
		
		int posicion;
		long tiempo=0;
		if (tipo ==1){
			System.out.println("Busqueda Binaria");
		}else {
			System.out.println("Busqueda Lineal");
		}
		for (int i = 0; i < cantidadevaluaciones; i++) {
			generararregloordenado();
			startTime = System.nanoTime();
			if(tipo==1) {
				posicion = busquedaBinaria(arreglodatosordenados, numeroabuscar);
			}else {
				posicion = busquedaLineal(arreglodatosordenados, numeroabuscar);
			}
			endTime = System.nanoTime();
			totalTime = endTime - startTime;
			tiempo+=totalTime;
			System.out.println("Tiempo de ejecuci�n: "+totalTime+" nanosegundos");
		}
		System.out.println("Tiempo promedio de ejecuci�n: "+(tiempo/cantidadevaluaciones)+" nanosegundos");
		//numero buscado
		System.out.println("Numero buscado: "+numeroabuscar);
	}

	public static void buscarbinario() {
		System.out.println("Ingrese el numero a buscar");
		System.out.print("-> ");
		int numeroabuscar = scannerNumero(0, 1000000000);
		startTime = System.nanoTime();
		int posicion = busquedaBinaria(arreglodatosordenados, numeroabuscar);
		endTime = System.nanoTime();
		totalTime = endTime - startTime;
		if(posicion == -1) {
			System.out.println("El numero no se encuentra en el arreglo");
		}else {
			System.out.println("El numero se encuentra en la posicion "+posicion);
		}
		System.out.println("Tiempo de ejecucion: "+totalTime+" nanosegundos");
	}
	public static int busquedaBinaria(int[] arreglo, int numeroabuscar) {
		int inicio = 0;
		int fin = arreglo.length - 1;
		int mitad = 0;
		while (inicio <= fin) {
			mitad = (inicio + fin) / 2;
			if (arreglo[mitad] == numeroabuscar) {
				return mitad;
			} else if (arreglo[mitad] < numeroabuscar) {
				inicio = mitad + 1;
			} else {
				fin = mitad - 1;
			}
		}
		return -1;
	}
	public static void buscarlineal() {
		System.out.println("Ingrese el numero a buscar");
		System.out.print("-> ");
		int numeroabuscar = scannerNumero(0, 1000000000);
		startTime = System.nanoTime();
		int posicion = busquedaLineal(arreglodatosordenados, numeroabuscar);
		endTime = System.nanoTime();
		totalTime = endTime - startTime;
		if(posicion == -1) {
			System.out.println("El numero no se encuentra en el arreglo");
		}else {
			System.out.println("El numero se encuentra en la posicion "+posicion);
		}
		System.out.println("Tiempo de ejecucion: "+totalTime+" nanosegundos");
	}
	public static int busquedaLineal(int[] arreglo, int numeroabuscar) {
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] == numeroabuscar) {
				return i;
			}
		}
		return -1;
	}
	public static void generararregloordenado(){
		arregloorigen = new int[numerodatos];
		arreglodatosordenados = new int[numerodatos];
		for (int i = 0; i < numerodatos; i++) {
			arregloorigen[i] = (int) (Math.random()*numerodatos);
		}

		//sort array with the fastest sorting algorithm
		Arrays.sort(arregloorigen);



		//copiar el arreglo ordenado
		for (int i = 0; i < numerodatos; i++) {
			arreglodatosordenados[i] = arregloorigen[i];
		}
	}

	public static void imprimirarreglo(int[] arreglo, int inicio, int fin) {
		for (int i = inicio; i < fin; i++) {
			System.out.print(i+"- "+arreglo[i]+".  |  ");
			if (i%10== 0) {
				System.out.println();
			}
		}

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
	
}
