package parcial;
import java.util.Scanner;

public class AdivinaElNumero {

	public static void main(String[] args) {
		

		ejercicio4();
        
	}

	static void ejercicio4() {
	       Scanner entrada = new Scanner(System.in);
			
	        int random=(int) (Math.random()*100);
	        int numero =0, intentos=0;
	        
	        System.out.println("Bienvenido al juego adivina el numero");
	        System.out.println("Por favor empieza adivinando, digitando un numero");
	        
	        while(numero!=random) {
	            intentos++;
	            numero = entrada.nextInt();
	            
	            if (random < numero) {
	                System.out.println("VVVVV Coloca un numero menor VVVVV ");
	            }
	            
	            else{
	                System.out.println("^^^^^^^Coloca un numero mayor^^^^^^");
	            }
	        }
	            System.out.println("Has adivinado, el numero era "+random+" en "+intentos+" intentos");
		
	}
}


