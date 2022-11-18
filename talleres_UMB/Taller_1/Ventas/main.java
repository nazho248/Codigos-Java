package Ventas;
import java.util.Scanner;

public class main {
	/*Configuracion*/
	static Scanner sc = new Scanner(System.in);
	static int sedes = 6; //6 sedes del ejercicio
	static int diasVentas=7; //7 dias de la semana

	public static void main(String[] args) {
		/* Generar sin POO, un programa que por cada d�a de la semana (lunes a domingo) acumula
		 * la cantidad de ventas totales diarias de una empresa, la empresa tiene 6 sedes. Mediante
		 * funciones llenar la matriz con las ventas respectivas, haciendo uso de funciones por cada
		 * sede mostrar los d�as que tienen ventas totales diarias por encima de la media de la
		 * semana respectiva y el promedio de ventas total de la semana de la empresa y por
		 * cada sede. De igual manera generar un procedimiento que permita aumentar en
		 * un 15% las ventas diarias que est�n por debajo de la media respectiva de cada sede.*/

		int[][] ventas = new int[sedes][diasVentas];
		double[] promedio = new double[sedes];
		String[] DiasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
		int opcion = 0;
		ventas = llenarMatrizAl(ventas);
		promedio = promedioSemana(ventas);

		//menu de navegacion con opcion 1 llenar datos automaticamente, opcion 2 llenar datos manualmente, 3 listar datos,
		// 4 listar datos por encima de la media y su promedio, 5 aumentar 15% ventas por debajo de la media, 6 salir

do {
	System.out.println("\n\n\n\n\n");
	System.out.println("---------------------------------------------------------------------------------------");
	System.out.println("1. Llenar datos automaticamente");
	System.out.println("2. Llenar datos manualmente");
	System.out.println("3. Listar todos los datos");
	System.out.println("4. Listar datos por encima de la media");
	System.out.println("5. Aumentar 15% ventas por debajo de la media");
	System.out.println("6. Salir");
	System.out.print("Seleccione una opción: ");
	opcion = sc.nextInt();
	System.out.println("---------------------------------------------------------------------------------------");
	System.out.println("\n\n\n\n\n");
	switch (opcion) {
		case 1:
			ventas = llenarMatrizAl(ventas);
			//despues de llenar las ventas, calcular su promedio
			promedio = promedioSemana(ventas);
			break;
		case 2:
			ventas = llenarMatrizManual(ventas, DiasSemana);
			//despues de llenar las ventas, calcular su promedio
			promedio = promedioSemana(ventas);
			break;
		case 3: //listar todos los datos
			listTable(ventas, promedio, DiasSemana, false);
			break;
		case 4: //listar datos por encima de la media
			listTable(ventas, promedio, DiasSemana, true);
			break;
		case 5:
			ventas = aumentarporcentaje(ventas, promedio);
			break;
		case 6:
			System.out.println("Gracias por usar el programa");
			break;
		default:
			System.out.println("Opción no válida");
	}
}while (opcion != 6);
	}


	public static int[][] llenarMatrizAl(int[][] ventas) {
		for (int i = 0; i < sedes; i++) {
			for (int j = 0; j < diasVentas; j++) {
				//number between 123 and 1000
				ventas[i][j] = (int) (Math.random() * (1000 - 123) + 123);
			}
		}
		return ventas;
	}

	public static int[][] llenarMatrizManual(int[][] ventas, String[] DiasSemana) {
		for (int i = 0; i < sedes; i++) {
			System.out.println("--------- Sede " + (i+1)+"---------");
			for (int j = 0; j < diasVentas; j++) {
				ventas[i][j] = scanner("Ingrese la venta del " + (DiasSemana[j]) + ": ", 1000,0 );
			}
		}
		return ventas;
	}


	public static double[] promedioSemana(int[][] ventas) {
		double[] promedio = new double[sedes];
		for (int i = 0; i < sedes; i++) {
			double suma = 0;
			for (int j = 0; j < diasVentas; j++) {
				suma += ventas[i][j];
			}
			promedio[i] = suma / diasVentas;
		}
		return promedio;
	}

	public static void listTable(int[][] ventas, double[] promedio, String[] DiasSemana, boolean encimaPrmedio) {
		for (int i = 0; i < sedes; i++) {
			System.out.println("--------- Sede " + (i+1)+"---------");
			for (int j = 0; j < diasVentas; j++) {
				if(encimaPrmedio){
					if(ventas[i][j] > promedio[i]){
						System.out.println(DiasSemana[j] + ": " + ventas[i][j]);
					}
				} else{
					System.out.println(DiasSemana[j]+" : " + ventas[i][j]);
				}
			}
			System.out.println("Promedio de la semana: " + promedio[i]);
		}
	}

	public static int[][] aumentarporcentaje(int[][] ventas, double[] promedio){
		for (int i = 0; i < sedes; i++) {
			for (int j = 0; j < diasVentas; j++) {
				if(ventas[i][j] < promedio[i]){
					ventas[i][j] = (int) (ventas[i][j] * 1.15);
				}
			}
		}
		return ventas;
	}



	/* SCANNER DE TECLADO------------------------------------------------------------------------------------------------------------*/
	//lim= limite inferior, lim2 limite superior [ambos no incluyentes] y la variable x es el texto a imprimir en el scanner
	public static int scanner ( String x,int max,int min ){
		int variable = 0;
		do {
			System.out.print(x);
			variable = sc.nextInt();
			if ((variable<min)||(variable>max)) {
				System.out.println("XxX Dato invalido XxX");
			}
		} while (variable <min);

		return variable;
	}

}
