package Buses;
import java.util.Scanner;

public class main {

	/*Configuracion*/
	static Scanner sc = new Scanner(System.in);
	static int Buseta = 6; //6 Buseta del ejercicio
	static int diasVentas=7; //7 dias de la semana

	public static void main(String[] args) {
		/*
		* Se tiene un programa donde se almacena una cantidad m de busetas y la cantidad de ventas de cada una de ellas por cada dia de la semana.
		* utilizando funciones almacenar las ventas de cada buseta en la matriz
		* mostrar utilizando funciones de la buseta que mas gana en la semana y la que menos gana
		* utilizar una funcion mostrar por cada buseta el dia de la semana que mas gana
		* con un procedimiento aumentar las ventas de la matriz en un 20% que esten por debajo del promedio de ventas diario
		* */
		System.out.println("Bienvenido al programa de ventas de busetas");
		Buseta = scanner("Ingrese la cantidad de busetas: ",100,1);
		int[][] ventas = new int[Buseta][diasVentas];
		double[] promedio = new double[Buseta];
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
			System.out.println("5. Aumentar 20% ventas por debajo de la media");
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
					promedio = promedioSemana(ventas);
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
		for (int i = 0; i < Buseta; i++) {
			for (int j = 0; j < diasVentas; j++) {
				//number between 123 and 1000
				ventas[i][j] = (int) (Math.random() * (1000 - 123) + 123);
			}
		}
		return ventas;
	}

	public static int[][] llenarMatrizManual(int[][] ventas, String[] DiasSemana) {
		for (int i = 0; i < Buseta; i++) {
			System.out.println("--------- Buseta " + (i+1)+"---------");
			for (int j = 0; j < diasVentas; j++) {
				ventas[i][j] = scanner("Ingrese la venta del " + (DiasSemana[j]) + ": ", 1000,0 );
			}
		}
		return ventas;
	}


	public static double[] promedioSemana(int[][] ventas) {
		double[] promedio = new double[Buseta];
		for (int i = 0; i < Buseta; i++) {
			double suma = 0;
			for (int j = 0; j < diasVentas; j++) {
				suma += ventas[i][j];
			}
			promedio[i] = suma / diasVentas;
		}
		return promedio;
	}

	public static void listTable(int[][] ventas, double[] promedio, String[] DiasSemana, boolean encimaPrmedio) {
		int mayorventatotal = 0;
		int posmayorventatotal = 0;
		int menorventatotal = ventas[0][0];
		int posmenorventatotal = 0;
		for (int i = 0; i < Buseta; i++) {
			System.out.println("--------- Buseta " + (i+1)+"---------");
			int mayorventa = ventas[i][0];
			int posmayorventa = 0;
			int menorventa = ventas[i][0];
			int posmenorventa = 0;
			for (int j = 0; j < diasVentas; j++) {
				if(encimaPrmedio){
					if(ventas[i][j] > promedio[i]){
						System.out.println(DiasSemana[j] + ": " + ventas[i][j]);

						if (ventas[i][j] > mayorventa) {
							mayorventa = ventas[i][j];
							posmayorventa = j;
						}
						if (ventas[i][j] < menorventa) {
							menorventa = ventas[i][j];
							posmenorventa = j;
						}
						if (ventas[i][j] > mayorventatotal) {
							mayorventatotal = ventas[i][j];
							posmayorventatotal = i;
						}
						if (ventas[i][j] < menorventatotal) {
							menorventatotal = ventas[i][j];
							posmenorventatotal = i;
						}

					}
				} else{
					if (ventas[i][j] > mayorventa) {
						mayorventa = ventas[i][j];
						posmayorventa = j;
					}
					if (ventas[i][j] < menorventa) {
						menorventa = ventas[i][j];
						posmenorventa = j;
					}
					if (ventas[i][j] > mayorventatotal) {
						mayorventatotal = ventas[i][j];
						posmayorventatotal = i;
					}
					if (ventas[i][j] < menorventatotal) {
						menorventatotal = ventas[i][j];
						posmenorventatotal = i;
					}
					System.out.println(DiasSemana[j]+" : " + ventas[i][j]);
				}
			}
			System.out.println("Promedio de la semana: " + promedio[i]);
			if (!encimaPrmedio){
				System.out.println("Menor venta: " + menorventa + " del día " + DiasSemana[posmenorventa]);
				System.out.println("Mayor venta: " + mayorventa + " del día " + DiasSemana[posmayorventa]);
			}
		}
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("=>Mayor venta total: " + mayorventatotal + " del autobus "+ (posmayorventatotal+1));
		System.out.println("=>Menor venta total: " + menorventatotal + " del autobus "+ (posmenorventatotal+1));
	}

	public static int[][] aumentarporcentaje(int[][] ventas, double[] promedio){
		for (int i = 0; i < Buseta; i++) {
			for (int j = 0; j < diasVentas; j++) {
				if(ventas[i][j] < promedio[i]){
					ventas[i][j] = (int) (ventas[i][j] * 1.20);
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
		} while (variable <min || variable > max);

		return variable;
	}

}
