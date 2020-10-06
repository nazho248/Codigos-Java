package oct06;
import java.util.Scanner;
public class xd {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Eres un inutil que no sabe sumar");
		System.out.println("por eso haces una calculadora para sumar");
		System.out.println("inserte el primer numero para sumar");
		String num1 = sc.next();
		System.out.println("inserte el segundo numero");
		String num2 = sc.next();
		
		String suma = num1+num2;

		
		
		System.out.println(num1+"+"+num2+"="+suma);
		System.out.println("y aun asi te queda mal :(");
	}

}
