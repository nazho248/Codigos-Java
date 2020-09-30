package Ejercicios2cortePT1;

public class ejercicio2 {
	public static void main(String[] args) {
		
		/*Utilizando el ejercicio anterior, determinar e imprimir cual es el mayor y en qué posición se encuentra, 
		  y cuál es el menor y en qué posición se encuentra.*/
		
		// (int) Math.floor(Math.random()*(9-(0)+1)+(0));
		
		
		 int numeros [] = new int [10], suma=0, max=100, min=0, mayor=min, menor=max, minpos=0,maxpos=0; // array 10 numeros 

			System.out.println("Arreglo:");
		 for (int i = 0; i < numeros.length; i++) {
			 
			numeros [i] =  (int) Math.floor(Math.random()*(max-(min)+1)+(min));
			suma = suma+numeros [i];
			System.out.print("("+(i+1)+") "+numeros[i]+" || ");
			
			if (numeros[i]<menor) {
				menor = numeros[i];
				minpos=i;
			}
			if (numeros[i]>mayor) {
				mayor = numeros[i];
				maxpos=i;
			}
			
		}
		 System.out.println("");
		 System.out.println("La suma es: "+suma);
		 System.out.println("El numero mayor es "+numeros[maxpos]+" y se encuentra en la posicion "+(maxpos+1));
		 System.out.println("El numero menor es "+numeros[minpos]+" y se encuentra en la posicion "+(minpos+1));

		 
		
		
	}

}