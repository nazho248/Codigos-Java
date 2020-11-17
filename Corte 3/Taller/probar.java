
import java.util.ArrayList;
import java.util.Scanner;
public class probar {
	
	static 		ArrayList<Integer>enteros = new ArrayList<Integer> ();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			enteros.add(i);
		}
		
		imprimir();
		
		System.out.print("Digite cual quiere eliminar :3: ");
		enteros.remove(sc.nextInt());
		enteros.add(sc.nextInt(), 9);

		
		imprimir();

	}
	
	public static void   imprimir() {
		for (Integer integer : enteros) {
			System.out.print(enteros.lastIndexOf(integer));
			System.out.print(". "+integer);
			System.out.println("");

		}
	}

}
