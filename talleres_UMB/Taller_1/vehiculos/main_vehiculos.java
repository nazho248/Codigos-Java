package vehiculos;
import java.util.Scanner;

public class main_vehiculos {

	static Scanner sc = new Scanner(System.in);
	static int anyoinicial = 2018; //el año inicial de los vehiculos
	static int precios = 5+1; //5 precios y el nombre del auto

	public static void main(String[] args) {
		/* 
		Haciendo uso de estructuras de datos estáticos (vectores y matrices) sin POO, Generar un Algoritmo que guarda una matriz de N vehículos 
		(Mazda, Toyota, etc.) con sus respectivos precios durante los últimos 5 años (2018, 2019, 2020 ,2021, 2022), los cuales son ingresados
		por teclado (validar que el valor que se introduce sea positivo, si introduce valores negativos o cero debe mostrar mensaje que solo 
		se permiten valores positivos y permitirle digitar nuevamente el precio). Mostrar:
			•	Mediante una función la Lista de autos con sus respectivos precios de cada año
			•	Mediante una función los autos más baratos de cada a�+o
			•	Mediante una función el promedio de los autos que cuestan entre 30 y 50 millones del año seleccionado por el usuario.
		 */

		String[][] marcas ;
		marcas = main();

		 //menu de navegacion
		 int opcion = 0;
		 do {
			 System.out.println("\n\n\n\n\n");
			 System.out.println("---------------------------------------------------------------------------------------");
			 System.out.println("0. Colocar Datos");
			 System.out.println("1. Lista de autos con sus respectivos precios de cada año");
			 System.out.println("2. Autos más baratos de cada año");
			 System.out.println("3. Promedio de autos que cuestan entre 30 y 50 millones del año seleccionado por el usuario.");
			 System.out.println("4. Salir");
			 System.out.print("Seleccione una opción: ");
			 opcion = sc.nextInt();
			 System.out.println("---------------------------------------------------------------------------------------");
			 System.out.println("\n\n\n\n\n");


			 switch (opcion) {
				 case 0:
					 marcas = main();
					 break;
			 case 1:
				 listTable(marcas);
				 break;
			 case 2:
				 preciomasbajo(marcas);
				 break;
			 case 3:
				 promedio(marcas);
				 break;
			 case 4:
				 System.out.println("Gracias por usar el programa");
				 break;
			 default:
				 System.out.println("Opción inválida");
				 break;
			 }
		 } while (opcion != 4);
	}	


	public static String[][] main(){
		
		 int cantVehiculos = Integer.parseInt(scanner ("introduce la cantidad de autos a seguir su precio: ",99999999,1));
		 String[][] marcas = new String[cantVehiculos][precios];
		// una tabla donde el primer valor es el nombre de la marca y el resto de datos es el precio de los vehiculos de esa marca en ese año
		for(int i=0,j=0; i<cantVehiculos; i++,j=0) {
			System.out.print("digita el nombre de la marca: ");
			marcas[i][j] = sc.next();
			for(int k=1; k<precios; k++) {
				marcas[i][k] = scanner ("introduce el precio del vehiculo en el anyo "+(anyoinicial+k-1)+": ",99999999,1);
			}
			System.out.println("------------------->");
		}
		return marcas;
	}
	
	public static void listTable(String[][] marcas){
		System.out.println("lista de autos con sus respectivos precios (en M) de cada año");
		for(int i=0; i<marcas.length; i++) {
			System.out.println("\n-------------------------------------"+marcas[i][0]+"-------------------------------------");
			for(int j=1; j<marcas[i].length; j++) {
				System.out.print((anyoinicial+j-1)+": "+marcas[i][j]+" ||  ");
			}
			System.out.println();
		}
	}	

	//imprimir los autos mas baratos de cada año guardandolo en una variable y imprimiendolo al final
	public static void preciomasbajo(String[][] marcas){
		int anyobarato = 0;
		System.out.println("\nlos autos mas baratos de cada año");
		for(int i=0; i<marcas.length; i++) {
			System.out.println("\n-------------------------------------"+marcas[i][0]+"-------------------------------------");
			int precio = Integer.parseInt(marcas[i][1]);
			anyobarato = 1;
			for(int j=2; j<marcas[i].length; j++) {
				if(Integer.parseInt(marcas[i][j])<precio) {
					precio = Integer.parseInt(marcas[i][j]);
					anyobarato = j;

				}
			}
			System.out.println("el precio mas bajo fue en el año "+(anyobarato+anyoinicial-1)+" : "+precio);
		}
	}

	//imprimir el promedio de los autos que cuestan entre 30 y 50 millones del año seleccionado por el usuario.
	public static void promedio(String[][] marcas){
		int anyo = 0;
		double promedio = 0;
		int contador = 0;
		int suma = 0;
		System.out.println("\npromedio de los autos que cuestan entre 30 y 50 millones del año seleccionado por el usuario\n\n");
		anyo = Integer.parseInt(scanner("introduce el año del cual quieres saber el promedio:", anyoinicial+5,anyoinicial));
		anyo= anyo-anyoinicial+1;
		System.out.println(anyo);
		for (int i=0; i<marcas.length; i++) {
			if (Integer.parseInt(marcas[i][anyo])>=30 && Integer.parseInt(marcas[i][anyo])<=50) {
				suma = suma + Integer.parseInt(marcas[i][anyo]);
				contador++;
			}
			}
		if (contador==0) {
			System.out.println("no hay autos que cuesten entre 30 y 50 millones");
		}
		else {
			promedio = suma/contador;
			System.out.println("el promedio de autos que cuestan entre 30 y 50 millones del año seleccionado es: "+promedio);
		}
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
		} while (variable <min);
		String variable2 = Integer.toString(variable);
		return variable2;
	}

}
