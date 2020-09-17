package parcial;
import java.util.Scanner;

public class Bisiesto{
	
	
    public static void main(String [] args1){
    	ejercicio1();
    

    }
    

    
        
   	 static void ejercicio1() {
     	int ano=-1;
    	
     	System.out.println("Bienvenido al calculador de año Bisiesto");
     	System.out.println("Por favor digite el año")
     	;
     	while (ano<0) {
     	ano=scanner();
     	}
     	
         if ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)) {
             System.out.println( "El año "+ano+" es bisiesto");
         }

         else 
         {
             System.out.println("El año "+ano+"  no es bisiesto");
         }
		
	}




	/* SCANNER DE TECLADO*------------------------------------------------------------------------------------------------------------*/
    	public static int scanner() {
    		int numero;
    		System.out.println("introduce el número:");
    		Scanner entrada = new Scanner(System.in);
    		numero = entrada.nextInt();
    		if (numero <= 0) {
    			System.out.println("Has introducido un valor no válido, por favor vuelve a intentarlo");
    		}

    		return numero;
    	}
    /* FIN SCANNER DE TECLADO-------------------------------------------------------------------------------------------------------------*/	
 }