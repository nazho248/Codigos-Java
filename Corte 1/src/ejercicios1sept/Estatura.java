package ejercicios1sept;
import java.util.Scanner;
public class Estatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Se requiere un algoritmo para obtener la estatura promedio de un grupo de personas, cuyo número de miembros se desconoce, el ciclo
           debe efectuarse siempre y cuando se tenga una estatura registrada.
           Realice el programa utilizando el ciclo apropiado.*/
		
		System.out.println("Calculadora de promedio de estatura");
		
		int personas =-1, altura=-1, sumatoria=0, contador =0;

		
	System.out.println("Aquí se le pedira el numero de personas");
		
		while (personas<0) {
				personas = scanner();
		}	
		
		System.out.println("Ahora se procedera a recoger la altura del numero de personas en CM");
		
		while (personas!=contador) {
			altura =-1;
			while (altura<0) {
				System.out.println("por favor escriba la altura en CM diferente de 0");
				altura = scanner();
			}
			sumatoria=sumatoria+altura;
			contador=contador+1;
			System.out.println(contador);
		}
		
		texto(personas,sumatoria);
		
		}
	
	/*Imprimir texto */
	public static void texto(int personas, int sumatoria) {
		double promedio=sumatoria/personas;
		

		 if (personas==1) {
			System.out.println("El promedio de altura para la unica persona es de "+promedio+" centimétros");
		}
		else {
			System.out.println("El promedio de altura para las "+personas+" personas es de "+promedio+" centimétros");
		}

		
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