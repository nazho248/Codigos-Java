package Parcial;

import java.util.Scanner;

public class punto3 {
	
	/* Pedir al usuario un entero positivo N, no mayor a 20. Crear un array de tamaño
     N. Para llenarlo, debe solicitar al usuario un número entre 1 y 10 para llenar las
     posiciones pares (0 es par) y generar un número al azar entre 11 y 20 para las
     posiciones impares. Imprimir el arreglo*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamaño=-1;
		
		System.out.println("Bienvenido al rellenador de arreglos no mayores a 20,\n"
				+ "rellenando las posiciones impares con numeros ingresados del usuario de 11 a 20\n"
				+ "y rellenando posiciones pares con numeros del 0 al 1");
		while((tamaño<0)||(tamaño>20)) {
		tamaño= scanner("Inserte el tamaño del arreglo: ",20,0);
		}
	  System.out.println(tamaño);
	  
	  
		int Numeros[]=new int[tamaño];
		
		Numeros= rellenadorN(Numeros);

		//Numeros = rellenador(Numeros);
		int max=20,min=11;
		for (int i = 0; i < Numeros.length; i++) {

			if ((i%2)==0) {
				while ((Numeros[i]<1)||(Numeros[i]>10)) {
					System.out.print("("+i+"). ");
				
					Numeros[i]=scanner("Inserte un numero del 1 al 10: ", 10, 0);
			}}
				else{{
					System.out.print("("+i+"). ");
				Numeros[i]= (int) Math.floor(Math.random()*(min-(max)+1)+(max));
				System.out.println("Generando numero (11-20)");
				
			}
		
			}
		}	
		imprimir(Numeros);
	}
	
	
	
	//imprimir 
	public static void  imprimir(int[] y) {
		String alinear = "(%-2s) %-3s  %n";
		for (int i = 0; i < y.length; i++) {
			System.out.format(alinear,i,y[i]);
		}

	}
	
	
	//scanner
		public static int scanner ( String x,int max,int min ){	
			Scanner sc = new Scanner(System.in);
			int variable = 0;
			System.out.print(x);
			variable = sc.nextInt();
			
			if ((variable<min)||(variable>max)) {
				System.out.println("Dato invalido");
				return -1;
			}
			return variable;
        }
		
		public static int[] rellenador(int[] x) {
			int max=20,min=11;
			for (int i = 0; i < x.length; i++) {

				if ((i%2)==0) {
					System.out.print("("+i+"). ");
					while ((x[i]<1)||(x[i]>10))
					x[i]=scanner("introduce un numero del 1 al 10: ",10,1);
				}
				if  ((i%2)!=0){
					while ((x[i]<10)||(x[i]>20))
						System.out.print("("+i+"). ");
					x[i]=(int) Math.floor(Math.random()*(max-(min)+1)+(min));

					System.out.println("Generando numero (11-20)");
				}
		
			}
			return x;
		}
		
		//rellenador para negativos
		public static int[] rellenadorN(int[] x) {
			for (int i = 0; i < x.length; i++) {
				x[i]=-1;			
			}
			return x;
		}
}
