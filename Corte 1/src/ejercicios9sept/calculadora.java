package ejercicios9sept;
import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		System.out.println("Bienvenido usuario \n"
				+ "por favor digite la opcion a realizar \n"
				+ "1 - Suma \n"
				+ "2 - Resta \n"
				+ "3 - Multiplicacion \n"
				+ "4 - División ");
		int opcion = scanner();
		System.out.println("Ahora se procedera a pedir 2 numeros \n"
				+ "Digite el numero 1");
		double num1= scanner();
		System.out.println("Digite el numero 2");
		double num2=scanner();
		double result=0;
		String elecc="" , op="";
		
		switch(opcion) {
		case 1:  //suma
			result= num1+num2;
			elecc="suma";
			op="+";
			
			break;
		case 2: //resta
			result= num1-num2;
			elecc="resta";
			op="-";
			break;
		case 3:  //mult
			result=num1*num2;
			elecc="multiplicación";
			op="*";
			break;
		case 4:	 //division
			result=num1/num2;
			elecc="division";
			op="/";
			break;
		}
		
		System.out.println("La "+elecc+" entre num 1 "+op+ " num 2 es de "+result);
	}
	
		
		 /* SCANNER DE TECLADO*------------------------------------------------------------------------------------------------------------*/
		public static int scanner() {
		int numero;
			Scanner entrada = new Scanner(System.in);
			numero = entrada.nextInt();

			return numero;
		}
	/* FIN SCANNER DE TECLADO-------------------------------------------------------------------------------------------------------------*/

}


