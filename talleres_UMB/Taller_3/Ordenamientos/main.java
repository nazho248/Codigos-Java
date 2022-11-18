package Ordenamientos;
import java.util.Scanner;


public class main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantidad = 10;
		int opcion= 0;
		do {
			String[] nombres = {"Burbujas", "Insercion", "Seleccion", "Shell", "Quicksort"};
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("Programa para comparar los ordenamientos");
			System.out.println("---------------------------------------");
			System.out.println("Cantidad de datos a ordenar: "+cantidad);
			System.out.println("0. Cambiar cantidad de datos a ordenar: ");
			System.out.println("1. Metodo Burbuja");
			System.out.println("2. Metodo por inserción");
			System.out.println("3. Metodo por selección");
			System.out.println("4. Metodo Shell");
			System.out.println("5. Metodo QuickSort");
			System.out.println("6. Hacer una prueba con todos los metodos 10 veces y promediar");
			System.out.println("7. Salir");
			System.out.println("---------------------------------------");
			System.out.print("Ingrese una opción -> ");
			 opcion = sc.nextInt();
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			switch(opcion) {
				case 0:
					do {
						System.out.print("Ingrese la cantidad de datos a ordenar -> ");
						cantidad = sc.nextInt();
						if (cantidad<=0) {
							System.out.println("La cantidad de datos a ordenar debe ser mayor a 0");
						}
					} while (cantidad<=0);


					break;
				case 1,2,3,4,5:
					contarTiempo(opcion, cantidad);
					break;
				case 6:
					long suma = 0;
					for (int i = 1; i < 6; i++) {
						System.out.println(" ----------------------------------- Metodo: "+nombres[i-1]+" -----------------------------------");
						//hacer promedio entre 10 veces
						suma = 0;
						for (int j = 0; j < 10; j++) {
							suma += contarTiempo(i, cantidad);
						}
						System.out.println("El promedio de tiempo es: "+suma/10);
						System.out.println("\n\n");
					}
					break;
				case 7:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opción no válida");
					break;
			}

		} while ( opcion != 7);



	}

	public static int[] generarAleatorios(int cantidad) {
		int[] datos = new int[cantidad];
		for (int i = 0; i < cantidad; i++) {
			datos[i] = (int) (Math.random() * 10000);
		}
		return datos;
	}

	public static long contarTiempo(int TipoOrdenamiento, int cantidad) {
		int [] datos = generarAleatorios(cantidad);
		datos = shellSort(datos);
		long startTime = System.currentTimeMillis();
		switch (TipoOrdenamiento) {
		case 1:
			BubbleSort(datos);
			break;
		case 2:
			insertionSort(datos);
			break;
		case 3:
			selectionSort(datos);
			break;
		case 4:
			shellSort(datos);
			break;
		case 5:
			quickSort(datos);
			break;
		}
/*		Burbuja.ordenar(datos);*/
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("Tiempo de ejecucion: " + totalTime + " milisegundos");
		return totalTime;
	}

	public static int[] BubbleSort(int[] datos) {
		int aux = 0;
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos.length - 1; j++) {
				if (datos[j] > datos[j + 1]) {
					aux = datos[j];
					datos[j] = datos[j + 1];
					datos[j + 1] = aux;
				}
			}
		}
		return datos;
	}

	public static void insertionSort(int [] sort_arr){

		for(int i=0;i<sort_arr.length;++i){

			int j = i;

			while(j > 0 && sort_arr[j-1]>sort_arr[j]){

				int key = sort_arr[j];
				sort_arr[j] = sort_arr[j-1];
				sort_arr[j-1] = key;
				j = j-1;

			}
		}
	}

	public static int[] selectionSort(int arr[])
	{
		int n = arr.length;

		for (int i = 0; i < n-1; i++)
		{
			int min_idx = i;
			for (int j = i+1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;


			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}


	public static int[] shellSort(int arr[]) {
		int n = arr.length;

		for (int gap = n/2; gap > 0; gap /= 2)
		{

			for (int i = gap; i < n; i += 1)
			{
				int temp = arr[i];

				int j;
				for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
					arr[j] = arr[j - gap];
				arr[j] = temp;
			}
		}
		return arr;
	}
/* --------------------*/
	public static int[] quickSort(int[] datos) {
		int aux = 0;
		for (int i = 0; i < datos.length; i++) {
			for (int j = i; j > 0; j--) {
				if (datos[j] < datos[j - 1]) {
					aux = datos[j];
					datos[j] = datos[j - 1];
					datos[j - 1] = aux;
				}
			}
		}
		return datos;
	}

	public static void imprimirDatos(int[] datos) {
		//metodo solo para imprimir datos para probar ya que imprimir +100 datos...
		for (int i = 0; i < datos.length; i++) {
			if (i %15 == 0) {
				System.out.println();
			}
			System.out.print(datos[i] + " - ");
		}
	}


}
