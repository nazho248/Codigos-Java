package sept29;
import java.util.Scanner;
public class ejercicio1 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in) ;
		System.out.println("Escriba un mensaje");
		String cadena= sc.nextLine();
		imprimircaracteres(cadena);
		imprimircantidadblanco(cadena);
		
		
	}
	
	public static void imprimircaracteres(String texto) {
		System.out.println("El tamaño es de "+texto.length()+" caracteres");
	}
	
	public static void imprimircantidadblanco(String texto) {
		int contador = 0;
		for (int i = 0; i < texto.length(); i++) {
			if(texto.charAt(i) == ' ') {
				contador = contador+1;
			}
			
		}
	System.out.println("Hay "+ contador+" caracteres en blanco");	
	}
}
