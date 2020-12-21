import java.util.Scanner;
public class CalculadoraDeSalario {
	/*
	 1. Crear un programa que calcule el salario actual de un empleado teniendo como datos de entrada su
salario al entrar a la empresa y sus años de antigüedad en la misma y las siguientes políticas de
aumentos. Imprimir el salario actual del empleado.
Al cumplir 12 años trabajando se le aumenta el 50%.
Al cumplir 9 años trabajando se le aumenta el 20%.
Al cumplir 6 años trabajando se le aumenta el 10%.
Al cumplir 3 años trabajando se le aumenta el 5%. 
	 * */
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Bienvenido a calculador de salario del empleado segun su antiguedad en la empresa y su salario al inicio");
		float  salarioEntrada = 0, antiguedad=0;
		do {
			salarioEntrada = scanner("Introduce el salario al entrar: ",999999999,1);
		} while (salarioEntrada<=0);
		do {
			antiguedad = scanner("Introduce la antiguedad del empleado: ",999999999,0);
		} while (antiguedad<0);
		float porcentaje = 0;
		
		
		if (antiguedad >=12) {
			porcentaje=1.5f;
		}
		else if (antiguedad>=9) {
			porcentaje=1.2f;
		}
		else if (antiguedad >=6) {
			porcentaje=1.1f;
		}
		else if (antiguedad >=3) {
			porcentaje=1.05f;
		}
		else {
			porcentaje=1f;
		}
		System.out.println("El empleado con  "+antiguedad+" años de antiguedad queda con un sueldo de "+ (salarioEntrada*porcentaje));
		
		
		
	}
	
	
	
	/* SCANNER DE TECLADO*------------------------------------------------------------------------------------------------------------*/
	//scanner
	public static int scanner ( String x,int max,int min ){	
		Scanner sc = new Scanner(System.in);
		int variable = 0;
		System.out.print(x);
		variable = sc.nextInt();
		
		if ((variable<min)||(variable>max)) {
			System.out.println("Dato invalido");
			return -1;
		}
		return variable;
	}
	/* FIN SCANNER DE TECLADO-------------------------------------------------------------------------------------------------------------*/	
	
	

}
