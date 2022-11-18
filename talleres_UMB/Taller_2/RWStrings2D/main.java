package RWStrings2D;

public class main {

	public static void main(String[] args) {
		/*
		elaborar un programa que permita leer y visualizar numeros enteros en un arreglo unidimensional y leer y visualizar cadenas de caracteres en un arreglo bidimensional.
		 */

		String[] palabras = {"hola", "mundo", "carro", "coche", "moto", "abc", "avion","pez","perro","gato"};


		int[] arregloEnteros = new int[10];
		String[][] arregloCadenas = new String[2][10];

		for (int i = 0; i < arregloEnteros.length; i++) {
			arregloEnteros[i] = (int) (Math.random() * 100);
		}

		for (int i = 0; i < arregloCadenas.length; i++) {
			for (int j = 0; j < arregloCadenas[i].length; j++) {
				arregloCadenas[i][j] = palabras[(int) (Math.random() * 10)];
			}
		}

		System.out.println("arreglo enteros (unidimensional)");
		for (int i = 0; i < arregloEnteros.length; i++) {
			System.out.println(arregloEnteros[i]);
		}

		System.out.println("arreglo cadenas (Bidimensional)");
		for (int i = 0; i < arregloCadenas.length; i++) {
			System.out.print(i+". ");
			for (int j = 0; j < arregloCadenas[i].length; j++) {
				System.out.print(arregloCadenas[i][j] + " ");
			}
			System.out.println();
		}




	}

}
