package sueldos_Empleados;

import java.util.Scanner;

public class sueldo_Empleados_main {

	static int empleados = 30;
	static int[] rut = new int[empleados];
	static float[] sueldo = new float[empleados];
	static float[] bono = new float[empleados];
	static float totalbonos = 0;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * La gerencia de la empresa ABC, preocupada por las bajas remuneraciones de su personal
		 * , ha decidido entregar una bonificaci�n ascendiente al 5% del sueldo a los 30 empleados
		 *  con m�s baja remuneraci�n. El gerente desea tener una lista con el RUT de los beneficiados 
		 *  y, adem�s, desea saber a cu�nto asciende el costo total de las bonificaciones. La empresa
		 *   almacenar� los datos del personal en dos arreglos paralelos: uno contendr� el RUT de los
		 *    100 empleados y otro estar� en correspondencia con �ste conteniendo el sueldo de cada uno.
		 *    Los arreglos son:
		 *    			int rut[n];
						float sueldo[n];
		 *    Implemente funciones que permitan:
				�	Encontrar el empleado con la mayor bonificaci�n,
				�	Encontrar el empleado con la menor bonificaci�n,
				�	Encontrar un empleado a partir de su RUT
		 */
		int opcion = 0;

		do {
		System.out.println("\n\n\n\n\n\n\n\n\n\n");
		System.out.println("Binvenido al gestor de suelditos ABC");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Menu de navegacion");
		System.out.println("1. Generar nuevos datos empleados");
		System.out.println("2. Mostrar datos empleados");
		System.out.println("3. Mostrar datos empleados con bonificacion");
		System.out.println("4. Mostrar empleado con mayor y menor bonificacion");
		System.out.println("5. Buscar empleado por RUT");
		System.out.println("0. Salir");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Ingrese una opcion: ");
		System.out.print("-> ");
		opcion = scannerNumero(0,5);
		System.out.println("\n\n\n\n\n\n");

		switch (opcion) {
		case 1:
			generarDatos();
			break;
		case 2:
			mostrarDatos();
			break;
		case 3:
			mostrarDatosBonificados();
			break;
		case 4:
			//empleado con mayor y menor bonificacion
			mostrarEmpleadoMayorYmenorBonificacion();
			break;
		case 5:
			buscarEmpleado();
			break;
		case 0:
			System.out.println("Saliendo...");
			break;
		default:
			break;
		}
		}while(opcion != 0);

	}


	public static void buscarEmpleado() {
		// TODO Auto-generated method stub
		int rutBuscado = 0;
		System.out.println("Ingrese el rut del empleado a buscar: ");
		System.out.print("-> ");
		rutBuscado = scannerNumero(1,99999999);
		System.out.println("\n\n\n\n\n\n");
		for (int i = 0; i < empleados; i++) {
			if (rutBuscado == rut[i]) {
				System.out.println("Empleado encontrado");
				System.out.println("RUT: "+rut[i]);
				System.out.println("Sueldo: "+sueldo[i]);
				System.out.println("Bonificacion: "+bono[i]);
				System.out.println("Sueldo total: "+(sueldo[i]+bono[i]));
			}
		}
	}

	public static void mostrarEmpleadoMayorYmenorBonificacion() {
		// TODO Auto-generated method stub
		int mayor = 0;
		int menor = 0;
		float mayorbono = 0;
		float menorbono = 0;

		for (int i = 0; i < empleados; i++) {
			if (i == 0) {
				mayor = i;
				menor = i;
				mayorbono = bono[i];
				menorbono = bono[i];
			}else {
				if (bono[i] > mayorbono) {
					mayor = i;
					mayorbono = bono[i];
				}
				if (bono[i] < menorbono) {
					menor = i;
					menorbono = bono[i];
				}
			}
		}

		System.out.println("El empleado con mayor bonificacion es: ");
		System.out.println("RUT: " + rut[mayor]);
		System.out.println("Sueldo: " + sueldo[mayor]);
		System.out.println("Bono: " + bono[mayor]);
		System.out.println("Total: " + (sueldo[mayor] + bono[mayor]));
		System.out.println("\n\n");
		System.out.println("El empleado con menor bonificacion es: ");
		System.out.println("RUT: " + rut[menor]);
		System.out.println("Sueldo: " + sueldo[menor]);
		System.out.println("Bono: " + bono[menor]);
		System.out.println("Total: " + (sueldo[menor] + bono[menor]));
		System.out.println("\n\n");
		System.out.println("El total de bonos es: " + totalbonos);
		System.out.println("\n\n");
	}


	public static void mostrarDatosBonificados() {
		// TODO Auto-generated method stub
		System.out.println("RUT\t\tSueldo\t\tBonificacion");
		for (int i = 0; i < empleados; i++) {
			System.out.println(rut[i]+"\t\t"+sueldo[i]+"\t\t"+bono[i]);
		}
		System.out.println("Total bonos: "+totalbonos);
	}

	public static void mostrarDatos() {
		System.out.println("RUT\t\tSueldo");
		for (int i = 0; i < empleados; i++) {
			System.out.println(rut[i] + "\t\t" + sueldo[i]);
		}
	}

	public static void generarDatos() {
		for (int i = 0; i < empleados; i++) {
			rut[i] = (int) (Math.random() * 10000000);
			sueldo[i] = (float) (Math.random() * 1000000);
		}
		//ordenar datos
		for (int i = 0; i < empleados; i++) {
			for (int j = 0; j < empleados; j++) {
				if (sueldo[i] < sueldo[j]) {
					float aux = sueldo[i];
					sueldo[i] = sueldo[j];
					sueldo[j] = aux;
					int aux2 = rut[i];
					rut[i] = rut[j];
					rut[j] = aux2;
				}
			}
		}
		
		//dar bonificacion a los 30 empleados con sueldo mas bajo
		for (int i = 0; i < 30; i++) {
			bono[i] = sueldo[i] * 0.05f;
			totalbonos += bono[i];
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
