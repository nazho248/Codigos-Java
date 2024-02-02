package Ejercicios2CortePT2;
import java.util.Scanner;

public class ejercicio6 {
	
	/*Realice un algoritmo que lea un vector y a partir de �l forme un segundo vector, 
	 de tal forma que el primer elemento pase a ser el segundo, el segundo pase a ser el tercero,
	 el �ltimo pase a ser el primero, y as� sucesivamente. Repres�ntelo mediante un diagrama de flujo.*/
	
	// (int) Math.floor(Math.random()*(9-(0)+1)+(0));

	
	public static void main(String[] args) {
		
		execute6();
		
	}
	
	public static void execute6() {
		int tama�o=-1, max=-1;
		System.out.println("Bienvenido al reorganizador de un vector, aumentando su posicion en 1 y el ultimo pasa a ser el primero");
		System.out.println("Digite el tama�o del vector");
		
		while (tama�o<=0) {
		 tama�o = scanner("Inserta el numero ",10000000,0);
		}
		System.out.println("inserte el valor maximo para la generacion del numero aleatorio, desde 0 - max");
		//pedir numero maxm
		while (max<=0) {
		 max = scanner("Inserta el numero",100000,0);
		}
		int numeros[] = new int[tama�o];
		int reordenado[]= new int[tama�o];
		int xd[]=new int [tama�o];
		numeros = rellenador(numeros, max);
		
		//cambiador de posiciones
		for (int i = 0; i < numeros.length; i++) {
			if (i<(numeros.length-1)) {
				reordenado[i+1]=numeros[(i)];
				xd[i]=i;
			}
			else {
				reordenado[0]=numeros[i];
				xd[0]=i+1;
			}
		}
		xd[(tama�o-1)]=((xd.length-1)); //asignar ultimo valor
		
		String alinear = "(%-2s) %-3s \\  (%-2s)   %-3s %n";
		//imprimir final
		System.out.println("original    | reorganizado ");
		for (int i = 0; i < reordenado.length; i++) {
			System.out.format(alinear,(i+1),numeros[i],(xd[i]),reordenado[i]);
		}
	}
	
	

	
	//rellenador de arrays
		public static int[] rellenador(int[] x, int max) {
			
			for (int i = 0; i < x.length; i++) {
				x[i]=(int) Math.floor(Math.random()*(max-(0)+1)+(0));		
			}
			return x;
		}
		
		//scanner
		public static int scanner ( String x,int max,int min ){	
			Scanner sc = new Scanner(System.in);
			int variable = 0;
			System.out.print(x);
			variable = sc.nextInt();
			
			if ((variable<min)||(variable>max)) {
				System.out.println("Dato invalido");
				return 0;
			}
			return variable;
		}
}
