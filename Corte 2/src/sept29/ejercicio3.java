package sept29;
import java.util.Scanner;
public class ejercicio3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in);
		
		System.out.println("digit3e el tamaño del arreglo");
		int tamano= sc.nextInt();
		
		float numeros []= new float [tamano];
		
		for (int i = 0; i < numeros.length; i++) {
		 numeros[i] = ( float) Math.random()*(10-(-10)+1)+(-10);	
		}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros [i]);
		}
		
		float total=0;
		for (int i = 0; i < numeros.length; i++) {
		total= total+numeros[i]	;
		}
		
		System.out.println("La suma es "+total);
	}
	

}
