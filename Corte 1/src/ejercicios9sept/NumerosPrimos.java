package ejercicios9sept;
import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		int LinF=0, LinS=0, prim=0, comp;
		System.out.println("Bienvenido a la calculadora de numeros primos entre intervalos NO SE ACEPTAN NEGATIVOS\n"
				+ "Por favor introduzca el limite inferior ");
		Scanner entrada = new Scanner(System.in);
		LinF= entrada.nextInt();
		System.out.println("Ahora por favor introduzca el limite superior");
		// Evaluar Limite inferior < Limite Superior
		while (LinS<=LinF) {
		LinS= scanner(LinF);	
		}

		System.out.println("A continuacion se imprimirán en pantalla los numeros primos en el intervalo ["+LinF+" - "+LinS+"]");
		for (int i = LinF; i <= LinS; ++i) {
		comp=0;	
		
		
			for (int j = i; j!=0; j--) {
				prim= i%j;
				if (prim==0) {
					comp++;
			}
				
			}
			if (comp==2) {
				System.out.println(i);
			}

			
			
				
		}
		
		
		
		
		
		
		
		
	}
	 /* SCANNER DE TECLADO*------------------------------------------------------------------------------------------------------------*/
	public static int scanner(int cond) {
		int numero;
		System.out.println("introduce el número:");
		Scanner entrada = new Scanner(System.in);
		numero = entrada.nextInt();
		if (numero < cond) {
			System.out.println("Has introducido un valor no válido, por favor vuelve a intentarlo");
		}

		return numero;
	}
/* FIN SCANNER DE TECLADO-------------------------------------------------------------------------------------------------------------*/	
	
}
