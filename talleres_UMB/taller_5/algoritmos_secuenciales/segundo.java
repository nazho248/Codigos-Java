package algoritmos_secuenciales;

import java.util.Scanner;

public class segundo {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		* 2.	Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber
		*  cuánto deberá pagar finalmente por su compra.*/

		System.out.println("Bienvenido al programa de calculo de descuentos");
		System.out.println("Ingrese el valor de su compra");
		double compra = sc.nextDouble();
		double descuento = compra * 0.15;
		System.out.println("El valor de su descuento es: " + descuento);
		System.out.println("El valor de su compra con descuento es: " + (compra - descuento));

	}

}
