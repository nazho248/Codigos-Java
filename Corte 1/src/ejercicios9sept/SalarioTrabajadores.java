package ejercicios9sept;
import java.util.Scanner;

public class SalarioTrabajadores {
	public static void main(String[] args) {
		
		
		System.out.println("Buen dia jefe,  Bienvenido al calculador del salario de los empleados");
		@SuppressWarnings("unused")
		Scanner entrada = new Scanner(System.in);
		int salarioE=800, horas=-1, horasN=-1,  sueldodia=0;
		int decision=-1;
		double sueldon=0;
		

		System.out.println("¿El empleado laboró horas extras?, escriba 1 para si y 0 para no");
		
		while (decision!=1 && decision!=0) {
			decision=scanner();
		}	
		
		
		if (decision==1) {
			System.out.println("Cuantas horas extras laboró (incluyendo nocturnas)");
			while (horas<0) {
				horas=scanner();
			}
			System.out.println("De esas horas extra, cuantas horas  fueron nocturnas");
			while (horasN<0) {
				horasN=scanner();
			}
			sueldon= horasN*(150*0.05)+150*horasN;
			sueldodia= (horas-horasN)*150;
		}

		
		System.out.println("El salario del empleado es de "+ (sueldodia+sueldon+salarioE) +" pesos");
		
		
	}
	
	
	
	
		 /* SCANNER DE TECLADO*------------------------------------------------------------------------------------------------------------*/
		public static int scanner() {
			int numero = 0;
			System.out.println("introduce el número:");
			Scanner entrada = new Scanner(System.in);
			numero = entrada.nextInt();
			if (numero < 0) {
				System.out.println("Has introducido un valor inválido, por favor vuelve a intentarlo");
				return numero;
			}

			return numero;
		}
	/* FIN SCANNER DE TECLADO-------------------------------------------------------------------------------------------------------------*/
		
		
	}
	

