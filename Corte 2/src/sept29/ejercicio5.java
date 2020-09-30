package sept29;
import java.util.Scanner;
public class ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in);
		System.out.println("Digite el tamaño del vector");
		int tamano = sc.nextInt();
		
		int a[] = new int[tamano];
		int b[] = new int[tamano];
		int c[] = new int[tamano];
		for (int i = 0; i < a.length; i++) {
			
			a[i]= (int) Math.floor(Math.random()*(5-(-5)+1)+(-5));
			b[i]= (int) Math.floor(Math.random()*(5-(-5)+1)+(-5));
			c[i] =a[i]+b[i];
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Vector A");
			System.out.println(a[i]);
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println("Vector B");
			System.out.println(b[i]);
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.println("Vector C =  Vector A + Vector B");
			System.out.println(c[i]);
		}

	}

}
