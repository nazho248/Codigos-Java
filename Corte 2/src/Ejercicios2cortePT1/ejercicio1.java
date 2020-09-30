package Ejercicios2cortePT1;

public class ejercicio1 {
	public static void main(String[] args) {
		
		/*Se requiere obtener la suma de las cantidades contenidas en un arreglo de 10 elementos.
        Realice el algoritmo y represéntelo mediante el diagrama de flujo y el pseudocódigo.*/
		
		// (int) Math.floor(Math.random()*(9-(0)+1)+(0));
		
		
		 int numeros [] = new int [10], suma=0; // array 10 numeros y variable suma
		 
			System.out.println("Arreglo:");
		 for (int i = 0; i < numeros.length; i++) {
			 
			numeros [i] =  (int) Math.floor(Math.random()*(100-(0)+1)+(0));
			suma = suma+numeros [i];

			System.out.print(numeros[i]+"; ");
			
		}
		 System.out.println("");
		 System.out.println("La suma del arreglo de 10 numeros es "+suma);
		
		
	}

}
