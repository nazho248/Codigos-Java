package ejercicios1sept;
import java.util.Scanner;

public class HarapientoDistinguido {

	public static void main(String[] args) {
		
		/* Almacenes �El harapiento distinguido� tiene una promoci�n: a todos
        los trajes que tienen un precio superior a $2500.00 se les aplicar� un
        descuento de 15 %, a todos los dem�s se les aplicar� s�lo 8 %.
        Realice un algoritmo para determinar el precio final que debe pagar
        una persona por comprar un traje y de cu�nto es el descuento que
        obtendr�.      */

			System.out.println(
					"Bienvenido a Almacenes harapiento Escriba el precio de su compra para verificar su descuento");
			int costo = scanner();
			/* verificacion valor positivo */
			while (costo < 0) {
				costo = scanner();
			}
			texto(descuento(costo) , costo);

	}
	/*
	 * SCANNER DE TECLADO*------------------------------------------------------------------------------------------------------------*/
	public static int scanner() {
		int precio = 0;
		System.out.println("introduce el precio:");
		Scanner entrada = new Scanner(System.in);
		precio = entrada.nextInt();
		if (precio < 0) {
			System.out.println("Has introducido un valor inv�lido, por favor vuelve a intentarlo");
			return precio;
		}

		return precio;
	}
	/* FIN SCANNER DE TECLADO------------------------------------------------------------------------------------------------------------*/

	/* CALCULO DESCUENTO------------------------------------------------------------------------------------------------------------*/
	public static int descuento(int precio) {
     int preciodescuento = 0;

		if( precio >= 2500) {
			preciodescuento = (int) (precio*0.15);
		}
		else {
	    preciodescuento =  (int) (precio*0.08);
		}
		return preciodescuento ;
	}


	/*  Fin CALCULO DESCUENTO ----------------------------------------------------------------------------- ------------------------------- */

	public static void texto(int descuento, int costo) {
		System.out.println("el descuento realizado fu� de:"+descuento+" para un total a pagar de "+(costo-descuento)+" pesos");
	}
}

