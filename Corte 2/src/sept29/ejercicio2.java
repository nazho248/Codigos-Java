package sept29;
import java.util.Scanner;
public class ejercicio2 {
	public static void main(String[] args) {
		
		int numeros []= new int[100];
		//llenar
		
		//for (int i = 0; i < numeros.length; i++) {
	//		numeros[i] = i *2;
		//}
		
		//llenar 2
		
		int cont=2;
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = cont;
			cont=cont+2;
		}
		
		// impresion de texto
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}

}
