package parcial;
import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		ejercicio3();
		

	
	}

		
		
	
	 static void ejercicio3() {

			int x=0, Lim=-1;
			System.out.println("Bienvenido al calculador de tablas de multiplicar  ");
			System.out.println("Por Favor digite el numero con el que se realizará la tabla de multiplicar");
			Scanner entrada = new Scanner(System.in);
			x= entrada.nextInt();
			System.out.println("Ahora por favor introduzca de 0 hasta donde se realizará la tabla de multiplicar");
			// Evaluar Limite inferior < Limite Superior
			while (Lim<0) {
			Lim= scanner();	
			}
			System.out.println("A continuacion se imprimirán en pantalla la tabla de multiplicar del "+x+" del 0 al "+Lim);
			int mult []= new int[Lim+1];
			
			for (int i = 0; i <=Lim ; i++) {
				mult[i]= (x*i);
				System.out.println(x+" * "+i+" = "+mult[i]);
			}
			

		
	}




	/* SCANNER DE TECLADO*------------------------------------------------------------------------------------------------------------*/
	public static int scanner() {
		int numero;
		System.out.println("introduce el número:");
		Scanner entrada = new Scanner(System.in);
		numero = entrada.nextInt();
		if (numero < 0) {
			System.out.println("Has introducido un valor no válido, por favor vuelve a intentarlo");
		}

		return numero;
	}
/* FIN SCANNER DE TECLADO-------------------------------------------------------------------------------------------------------------*/	
	
	}

	


