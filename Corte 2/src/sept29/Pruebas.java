package sept29;
import java.util.Random;
import java.util.Scanner;
public class Pruebas {
	public static void main(String[] args) {
		 int maximo=0, posicion=0;
		Random aleatorio = new Random ();
		
		int numeros[]= new int[10];  //int (Nombre cualquiera) []= new int[TAMAÑO]
		
		
		for (int i = 0; i < 10; i++) {
			numeros[i]=aleatorio.nextInt()/10000000;			
		}
		for (int i = 0; i < 10; i++) {
			if (numeros[i]>maximo) {
				maximo=numeros[i];
				posicion=i;
			}

			
		}
		System.out.println("El mayor es:"+maximo+" en la posicion"+posicion);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("El numero en la posicion "+i+" es:"+numeros[i]);
		
		}
	}
	

		
	}


