package ejercicios9sept;
import java.util.Scanner;

public class Encuesta {

public static void main(String[] args) {
	
	double personas=-1, contH=0, contF=0, contT=0, contNT=0, genero, trabajar; 
	int sueldoH=0, sueldoF=0;
	Scanner entrada = new Scanner(System.in);

		System.out.println("Bienvenido a la encuesta \n"
				+ "Por favor introduce el numero de encuestados");
		while (personas<0) {
			personas=scanner();
		}
		System.out.println("la encuenta ha iniciado");
		for (int i = 1; i <= personas ; i++) {
			System.out.println("para la pesona "+i);
			System.out.println("Hombre (1) o Mujer (0)?");
			genero=entrada.nextInt();
			if (genero==1 ) {
				contH++;
				System.out.println("¿cuanto sueldo gana?");
				sueldoH=scanner();
			}
			else {
				contF++;
				System.out.println("¿cuanto sueldo gana?");
				sueldoF=scanner();
			}
			
			System.out.println("¿Trabaja? Si (1) No(0)");
			trabajar=entrada.nextInt();
			
			if (trabajar==1) {
				contT++;
				
			}
			else {
				contNT++;
			}
		}
			System.out.println("El resultado de la encuesta es:");
			System.out.println("Hay un "+((contH/personas)*100)+"% de hombres y un "+((contF/personas)*100)+"% de mujeres");
			System.out.println("hay un "+((contT/personas)*100)+"% de empleados y un"+((contNT/personas)*100)+"% de desempleados");
			if (contH==0 && contF!=0) {
				
				System.out.println("El promedio de salario de hombres es de 0 Pesos y el salario promedio de las mujeres es de "+((sueldoF)/contF));				
			}
			else if((contF==0 && contH!=0)) {
				System.out.println("El promedio de salario de hombres es de "+((sueldoH)/contH)+" Pesos y el salario promedio de las mujeres es de 0");

			}
			else if(contF==0 && contH==0) {
				System.out.println("El promedio de salario de hombres es de 0 Pesos y el salario promedio de las mujeres es de 0");
			}
			else {
			System.out.println("El promedio de salario de hombres es de "+((sueldoH)/contH)+" Pesos y el salario promedio de las mujeres es de "+((sueldoF)/contF));
			}
		}
		
		





/* SCANNER DE TECLADO*------------------------------------------------------------------------------------------------------------*/
public static int scanner() {
	int numero = 0;
	System.out.println("introduce el numero ");
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
