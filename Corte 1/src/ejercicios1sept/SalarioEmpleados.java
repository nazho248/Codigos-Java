package ejercicios1sept;
import java.util.Scanner;

public class SalarioEmpleados {
	
	/*Una empresa les paga a sus empleados con base en las horas
      trabajadas en la semana. Para esto, se registran los días que laboró y
      las horas de cada día. Realice un algoritmo para determinar el sueldo
      semanal de N trabajadores y además calcule cuánto pagó la empresa
      por los N empleados.*/

	public static void main(String[] args) {
System.out.println("Calculadora del salario de sus empleados");
		
		int precio =-1, empleados=-1, horas=-1, sumatoria=0, contador =1, salario, dias=-1;

		
	System.out.println("Aquí se le pedira el precio por hora a pagar");
		
		while (precio<0) {
				precio = scanner();
		}	
		
		System.out.println("Ahora se procedera a pedir el numero de empleados");
		while (empleados<0) {
			empleados = scanner();
	}	
		
		while ((empleados+1)!=contador) {
			horas=-1;
			dias=-1;
			while (dias<0) {
				System.out.println("digite los dias laborados del empleado "+contador);
				dias = scanner();
			}
			while (horas<0) {
				System.out.println("digite las horas diarias del empleado "+contador);
				horas = scanner();
			}
			salario=horas*precio*dias;
			sumatoria=sumatoria+salario;
			contador=contador+1;
			System.out.println("El salario del empleado "+contador+" es de "+salario);
		}
		
		texto(empleados,sumatoria);
		
		}
	
	/*Imprimir texto */
	public static void texto(int empl, int plata) {
		
		System.out.println("El total a pagar de la empresa a todos sus "+(empl)+" empleados es de "+plata);

		
	}
	
	
	/* Scanner verificador */
	public static int scanner() {
		System.out.println("por favor ingrese el numero");
		Scanner entrada = new Scanner(System.in);
		int numero = entrada.nextInt();
		

	    if (numero>0) {
			return numero;
			
		}
		else {
			System.out.println("Has introducido un número inválido, vuelve a intentarlo");
			return -1;
		}
		

	}
		
		

}