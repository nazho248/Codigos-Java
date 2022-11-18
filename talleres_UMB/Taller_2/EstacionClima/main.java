package EstacionClima;
import java.util.Scanner;

public class main {

	static Scanner sc = new Scanner(System.in);
	String[] DiasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*una estacion climatica proporciona N pares de temperaturas diarias (maxima, minima=
		* junto al nombre del dia respectivo ( no pueden ser menor a -40 o mayor a 40 grados)
		* se pide determinar dias y temperaturas cuyas temperaturas maximas esten entre 15 y 20 grados
		* dias y temperatura cuyas temperaturas minimas esten por debajo de los 0 grados
		* calcular las medias, maxima y minima de las temperaturas
		* mostrar el listado de temperaturas con su dia respectivo*/


		System.out.println("Bienvenido al programa de temperaturas de la estacion climatica");
		String[][] temperaturas = new String[7][2];
		int opcion = 0;
		temperaturas = llenarMatrizAl(temperaturas);
		//menu de navegacion con opcion 1 llenar datos automaticamente, opcion 2 llenar datos manualmente, 3 listar datos, 4 determinar dias y temperaturas cuyas temperaturas maximas esten entre 15 y 20 grados, 5 determinar dias y temperaturas cuyas temperaturas minimas esten por debajo de los 0 grados, 6 calcular las medias, maxima y minima de las temperaturas
		do {
			System.out.println("\n\n\n\n\n");
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println("1. llenar datos automaticamente");
			System.out.println("2. llenar datos manualmente");
			System.out.println("3. listar datos");
			System.out.println("4. determinar dias y temperaturas cuyas temperaturas maximas esten entre 15 y 20 grados");
			System.out.println("5. determinar dias y temperaturas cuyas temperaturas minimas esten por debajo de los 0 grados");
			System.out.println("6. calcular las medias, maxima y minima de las temperaturas");
			System.out.println("7. salir");
			opcion = sc.nextInt();
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println("\n\n\n\n\n");
			switch (opcion) {
			case 1:
				temperaturas = llenarMatrizAl(temperaturas);
				break;
			case 2:
				temperaturas = llenarMatrizManual(temperaturas);
				break;
			case 3:
				listarMatriz(temperaturas);
				break;
			case 4:
				determinarDiasTemperaturasMaxMin(temperaturas, 15, 20);
				break;
			case 5:
				determinarDiasTemperaturasMaxMin(temperaturas, 0, 0);
				break;
			case 6:
				calcularMediasMaxMin(temperaturas);
				break;
			case 7:
				System.out.println("Gracias por usar el programa");
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
		} while (opcion != 7);
	}

	//funcion llenarmatriz con temperatura maxima y temperatura minima
	public static String[][] llenarMatrizAl(String[][] temperaturas) {
		for (int i = 0; i < temperaturas.length; i++) {
			//random number between -40 and 40
			int max = (int) (Math.random() * (40 - (-40))) + (-40);
			int min = (int) (Math.random() * (40 - (-40))) + (-40);
			if (max > min){
				temperaturas[i][0] = Integer.toString(max);
				temperaturas[i][1] = Integer.toString(min);
			}else if(max<min){
				temperaturas[i][0] = Integer.toString(min);
				temperaturas[i][1] = Integer.toString(max);
			}

		}
		return temperaturas;
	}

	//funcion llenarmatriz manualmente
	public static String[][] llenarMatrizManual(String[][] temperaturas) {
		for (int i = 0; i < temperaturas.length; i++) {
			temperaturas[i][0] = scanner(("Ingrese la temperatura maxima del dia " + (i + 1))+": ", 40, -40);
			temperaturas[i][1] = scanner(("Ingrese la temperatura minima del dia " + (i + 1))+": ", Integer.parseInt(temperaturas[i][0]), -40);
		}
		return temperaturas;
	}

	//funcion listar matriz
	public static void listarMatriz(String[][] temperaturas) {
		System.out.println("Listado de temperaturas");
		System.out.println("Dia\tT maxima\tT minima");
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println((i + 1) + "\t" + temperaturas[i][0] + "\t\t" + temperaturas[i][1]);
		}
	}

	//funcion determinar dias y temperaturas cuyas temperaturas maximas esten entre 15 y 20 grados
	public static void determinarDiasTemperaturasMaxMin(String[][] temperaturas, int min, int max) {

		if (min ==0){
			System.out.println("Dias con temperaturas minimas por debajo de los 0 grados");
		}else{
			System.out.println("Dias y temperaturas cuyas temperaturas esten entre " + min + " y " + max + " grados");
		}

		System.out.println("Dia\tTemperatura maxima\tTemperatura minima");
		int contador = 0;
		for (int i = 0; i < temperaturas.length; i++) {
			if(min==0){
				if(Integer.parseInt(temperaturas[i][1])<0){
					System.out.println((i + 1) + "\t" + temperaturas[i][0] + "\t\t" + temperaturas[i][1]);
					contador++;
				}
			}else{

				if (Integer.parseInt(temperaturas[i][0] + "") >= min && Integer.parseInt(temperaturas[i][0] + "") <= max) {
					System.out.println("Dia " + (i + 1) + ": " + temperaturas[i][0] + " , " + temperaturas[i][1]);
					contador++;
				}
			}

		}
		if (contador == 0) {
			System.out.println("No hay dias con temperaturas  entre " + min + " y " + max + " grados");
		}
	}

	//funcion calcular medias maxima y minima de las temperaturas
	public static void calcularMediasMaxMin(String[][] temperaturas) {
		int suma = 0;
		int suma2 = 0;
		int media = 0;
		int media2 = 0;
		int max = 0;
		int min = 0;
		for (int i = 0; i < temperaturas.length; i++) {
			suma += Integer.parseInt(temperaturas[i][0]);
			suma2 += Integer.parseInt(temperaturas[i][1]);
		}
		media = suma / temperaturas.length;
		media2 = suma2 / temperaturas.length;
		for (int i = 0; i < temperaturas.length; i++) {
			if (Integer.parseInt(temperaturas[i][0]) > max) {
				max = Integer.parseInt(temperaturas[i][0]);
			}
			if (Integer.parseInt(temperaturas[i][0]) < min) {
				min = Integer.parseInt(temperaturas[i][0]);
			}
		}
		System.out.println("Media de todas las temperaturas: "+(suma+suma2)/14);
		System.out.println("Media de temperaturas maximas: " + media);
		System.out.println("Media de temperaturas minimas: " + media2);
		System.out.println("Temperatura maxima: " + max);
		System.out.println("Temperatura minima: " + min);
	}




	/* SCANNER DE TECLADO------------------------------------------------------------------------------------------------------------*/
	//lim= limite inferior, lim2 limite superior [ambos no incluyentes] y la variable x es el texto a imprimir en el scanner
	public static String scanner ( String x,int max,int min ){
		int variable = 0;
		do {
			System.out.print(x);
			variable = sc.nextInt();
			if ((variable<min)||(variable>max)) {
				System.out.println("XxX Dato invalido XxX");
			}
		} while (variable <min || variable > max);

		String variablestring = String.valueOf(variable);
		return variablestring;
	}

}
