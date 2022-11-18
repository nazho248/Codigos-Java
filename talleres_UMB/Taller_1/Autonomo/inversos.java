package Autonomo;

public class inversos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//recorrer un arreglo de 10 números en forma inversa.
		int[] arreglo = {1,2,3,4,5,6,7,8,9,10};
		for (int i = arreglo.length-1; i >= 0; i--) {
			System.out.println(arreglo[i]);
		}
	}

	//funcion que imprima cualquier tipo de arreglo
	public static void imprimirArreglo(Object[] arreglo) {
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
	}

}
