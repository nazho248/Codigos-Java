import java.util.Scanner;
import javax.swing.JOptionPane;
public class SecuenciaCollatz {
	static Scanner sc = new Scanner(System.in);
	/*
	 La secuencia de Collatz de un número entero se construye de la siguiente forma:
• si el número es par, se lo divide por dos;
• si es impar, se le multiplica tres y se le suma uno;
• la sucesión termina al llegar a uno.
La conjetura de Collatz afirma que, al partir desde cualquier número, la secuencia siempre llegará
a 1. A pesar de ser una afirmación a simple vista muy simple, no se ha podido demostrar si es
cierta o no.
*/

	public static void main(String[] args) {
		int numero;
		System.out.println("Bienvenido a la calculadora de secuencia de collatz, que imprime la secuencia de numeros del numero introducido");
		numero = scanner("Introduce el numero: ",999999999,1);
		do {
			System.out.print(numero);
			
			if (numero%2==0) {
				numero = numero/2;
				System.out.print(", ");
			}
			else if (numero==1) {
				break;
			}
			else {
				numero= (numero*3)+1;
				System.out.print(", ");
			}
		} while (numero !=0);

		
		}



	/* SCANNER DE TECLADO 2.0 con verificacion  INT :)*------------------------------------------------------------------------------------------------------------*/
	//scanner
	public static int scanner ( String x,int max,int min ){	
		int variable = 0;
		do {
			System.out.print(x);
			variable = sc.nextInt();
			if ((variable<min)||(variable>max)) {
				System.out.println("Dato invalido");
			}
		} while (variable <min);
		return variable;
	}
	/* FIN SCANNER DE TECLADO-------------------------------------------------------------------------------------------------------------*/	
}

