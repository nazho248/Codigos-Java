package Ejercicios2cortePT1;

public class oruebas {

	public static void main(String[] args) {
		int max = 100, min = 0, aux=0;
		int ordenado[]= new int[10];
		int b[]= new int[10];
		 for (int i = 0; i < b.length; i++) {	 
			b[i]= (int) Math.floor(Math.random()*(max-(min)+1)+(min));
			ordenado[i] = b[i];
		}
		
		 for (int i = 0; i < b.length; i++) {
			 for (int j = i+1; j < b.length; j++) {
				 
				 if ( ordenado[i]>ordenado[j]) {
					 aux = ordenado[i];
					 ordenado[i] = ordenado[j];
					 ordenado[j]=aux;
					 }
				 }
			 }
		 for (int i = 0; i < b.length; i++) {
			System.out.println(ordenado[i]);
		}
		 }
	}

