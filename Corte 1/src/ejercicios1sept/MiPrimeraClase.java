package ejercicios1sept;
import java.util.Scanner;

public class MiPrimeraClase {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Buenas tardes, por favor digite dos numeros que quieras sumar");
	    int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		saludo(num1+num2);
		
	}
	
	public static void  saludo(int n) {
		System.out.println("La suma es  "+ n);
	}
}
/*	if () {
}
	else {
}n */

 

	