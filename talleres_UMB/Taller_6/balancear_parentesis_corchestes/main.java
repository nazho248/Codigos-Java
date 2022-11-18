package balancear_parentesis_corchestes;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		* Elabore un programa en Java  para evaluar una expresión matemática. Por ejemplo verificar si la expresión está balanceada en paréntesis o corchetes. usando pilas o colas
		* */

		System.out.println("Bienvenido al programa de evaluacion de expresiones matematicas");
		System.out.println("Ingrese la expresion");
		String expresion = sc.nextLine();
		Stack<Character> pila = new Stack<Character>();
		Queue<Character> cola = new LinkedList<Character>();
		// Recorrer la expresion y agregar los parentesis a la pila y los corchetes a la cola
for (int i = 0; i < expresion.length(); i++) {
			if (expresion.charAt(i) == '(' || expresion.charAt(i) == '[') {
				pila.push(expresion.charAt(i));
				cola.add(expresion.charAt(i));
			}
			if (expresion.charAt(i) == ')' || expresion.charAt(i) == ']') {
				if (pila.isEmpty()) {
					System.out.println("La expresion no esta balanceada");
					return;
				}
				if (expresion.charAt(i) == ')' && pila.peek() == '(') {
					pila.pop();
					cola.remove();
				}
				if (expresion.charAt(i) == ']' && pila.peek() == '[') {
					pila.pop();
					cola.remove();
				}
			}
		}

		if (pila.isEmpty()) {
			System.out.println("La expresion esta balanceada");
		} else {
			System.out.println("La expresion no esta balanceada");
		}

	}

}
