package torres_hanoi;
/*
 * 1.	Elabore un algoritmo que permita resolver el problema de las Torres de Hanoi. usando pilas.
  generando las torres de forma aleatoria con un numero de discos entre 3 y 10
 */

import java.util.Scanner;
import java.util.Stack;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido al programa de las torres de hanoi");
		System.out.println("Ingrese el numero de discos");
		int discos = sc.nextInt();
		Stack<Integer> torre1 = new Stack<>();
		Stack<Integer> torre2 = new Stack<>();
		Stack<Integer> torre3 = new Stack<>();
		//llenar las torres de forma aleatoria
		for (int i = 0; i < discos; i++) {
			int aleatorio = (int) (Math.random() * 3 + 1);
			if (aleatorio == 1) {
				torre1.push(i);
			} else if (aleatorio == 2) {
				torre2.push(i);
			} else {
				torre3.push(i);
			}
		}
		System.out.println("Torre 1: " + torre1);
		System.out.println("Torre 2: " + torre2);
		System.out.println("Torre 3: " + torre3);
		// menu de opciones: 1. mover disco de torre, 2. ver torres, 3. solucionar, 4. salir
		int opcion = 0;
		do {
			System.out.println("Menu de opciones");
			System.out.println("1. Mover disco de torre");
			System.out.println("2. Ver torres");
			System.out.println("3. Solucionar");
			System.out.println("4. Salir");
			opcion = sc.nextInt();

			switch (opcion) {
				case 1:
					System.out.println("Ingrese la torre de origen");
					int torreOrigen = sc.nextInt();
					System.out.println("Ingrese la torre de destino");
					int torreDestino = sc.nextInt();
					if (torreOrigen == 1 && torreDestino == 2) {
						if (torre1.isEmpty()) {
							System.out.println("La torre de origen esta vacia");
						} else if (torre2.isEmpty()) {
							torre2.push(torre1.pop());
						} else if (torre1.peek() < torre2.peek()) {
							torre2.push(torre1.pop());
						} else {
							System.out.println("No se puede mover el disco");
						}
					} else if (torreOrigen == 1 && torreDestino == 3) {
						if (torre1.isEmpty()) {
							System.out.println("La torre de origen esta vacia");
						} else if (torre3.isEmpty()) {
							torre3.push(torre1.pop());
						} else if (torre1.peek() < torre3.peek()) {
							torre3.push(torre1.pop());
						} else {
							System.out.println("No se puede mover el disco");
						}
					} else if (torreOrigen == 2 && torreDestino == 1) {
						if (torre2.isEmpty()) {
							System.out.println("La torre de origen esta vacia");
						} else if (torre1.isEmpty()) {
							torre1.push(torre2.pop());
						} else if (torre2.peek() < torre1.peek()) {
							torre1.push(torre2.pop());
						} else {
							System.out.println("No se puede mover el disco");
						}
					} else if (torreOrigen == 2 && torreDestino == 3) {
						if (torre2.isEmpty()) {
							System.out.println("La torre de origen esta vacia");
						} else if (torre3.isEmpty()) {
							torre3.push(torre2.pop());
						} else if (torre2.peek() < torre3.peek()) {
							torre3.push(torre2.pop());
						} else {
							System.out.println("No se puede mover el disco");
						}
					} else if (torreOrigen == 3 && torreDestino == 1) {
						if (torre3.isEmpty()) {
							System.out.println("La torre de origen esta vacia");
						} else if (torre1.isEmpty()) {
							torre1.push(torre3.pop());
						} else if (torre3.peek() < torre1.peek()) {
							torre1.push(torre3.pop());
						} else {
							System.out.println("No se puede mover el disco");
						}
					} else if (torreOrigen == 3 && torreDestino == 2) {
						if (torre3.isEmpty()) {
							System.out.println("La torre de origen esta vacia");
						} else if (torre2.isEmpty()) {
							torre2.push(torre3.pop());
						} else if (torre3.peek() < torre2.peek()) {
							torre2.push(torre3.pop());
						} else {
							System.out.println("No se puede mover el disco");
						}
					} else {
						System.out.println("Ingrese una torre valida");
					}
					break;
				case 2:
					System.out.println("Torre 1: " + torre1);
					System.out.println("Torre 2: " + torre2);
					System.out.println("Torre 3: " + torre3);
					break;
				case 3:
					solucionar(torre1, torre2, torre3, discos);
					break;
				case 4:
					System.out.println("Gracias por jugar");
					break;
			}

		}while (opcion != 4);

	}

	private static void solucionar(Stack<Integer> torre1, Stack<Integer> torre2, Stack<Integer> torre3, int discos) {
		//solve hanoi towers with 3 towers and n discs
		if (discos % 2 == 0) {
			while (torre3.size() != discos) {
				if (!torre1.isEmpty()) {
					torre2.push(torre1.pop());
					System.out.println("Torre 1: " + torre1);
					System.out.println("Torre 2: " + torre2);
					System.out.println("Torre 3: " + torre3);
				}
				if (!torre1.isEmpty()) {
					torre3.push(torre1.pop());
					System.out.println("Torre 1: " + torre1);
					System.out.println("Torre 2: " + torre2);
					System.out.println("Torre 3: " + torre3);
				}
				if (!torre2.isEmpty()) {
					torre3.push(torre2.pop());
					System.out.println("Torre 1: " + torre1);
					System.out.println("Torre 2: " + torre2);
					System.out.println("Torre 3: " + torre3);
				}
			}
		} else {
			while (torre3.size() != discos) {
				if (!torre1.isEmpty()) {
					torre3.push(torre1.pop());
					System.out.println("Torre 1: " + torre1);
					System.out.println("Torre 2: " + torre2);
					System.out.println("Torre 3: " + torre3);
					System.out.println("-------------------------------");

				}
				if (!torre1.isEmpty()) {
					torre2.push(torre1.pop());
					System.out.println("Torre 1: " + torre1);
					System.out.println("Torre 2: " + torre2);
					System.out.println("Torre 3: " + torre3);
					System.out.println("-------------------------------");

				}
				if (!torre2.isEmpty()) {
					torre3.push(torre2.pop());
					System.out.println("Torre 1: " + torre1);
					System.out.println("Torre 2: " + torre2);
					System.out.println("Torre 3: " + torre3);
				}
			}
		}
	}
}

