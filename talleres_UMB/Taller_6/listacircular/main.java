package listacircular;
/*
* Adicione al programa una función que permita ordenar la lista circular previamente creada. Utilice librerías provistas por el lenguaje de programación. (nt n = nodo1.nombre.compareTo(nodo1.next.nombre);
* */

import java.util.Scanner;
import java.util.LinkedList;

public class main {

	public static void main(String[] args) {

		System.out.println("Bienvenido al programa de listas circulares");
		System.out.println("Ingrese el numero de nodos");
		Scanner sc = new Scanner(System.in);
		int numeroNodos = sc.nextInt();
		LinkedList<String> lista = new LinkedList<String>();
		//generar nodos aleatorios
		for (int i = 0; i < numeroNodos; i++) {
			//numero aleatorio entre 1 y 100
			int numeroAleatorio = (int) (Math.random() * 100 + 1);
			lista.add(String.valueOf(numeroAleatorio));
		}
		//imprimir lista
		System.out.println("Lista de nodos");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		//ordenar lista
		System.out.println("-------------------------------");
		lista.sort(null);
		//imprimir lista ordenada
		System.out.println("Lista de nodos ordenada");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

	}

}
