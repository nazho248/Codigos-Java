package algoritmos_secuenciales;
import java.util.Scanner;

public class primero {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		/**
		 * 1.	Un vendedor recibe un sueldo base más un 10% extra por comisión de sus ventas,
		 * el vendedor desea saber cuánto dinero obtendrá por concepto de comisiones por las
		 * tres ventas que realiza en el mes y el total que recibirá en el mes tomando en
		 * cuenta su sueldo base y comisiones.
		 */
		System.out.println("Bienvenido al programa de calculo de comisiones");
		System.out.println("Ingrese el valor de su sueldo base");
		double sueldoBase = sc.nextDouble();
		System.out.println("Ingrese el valor de la primera venta");
		double venta1 = sc.nextDouble();
		System.out.println("Ingrese el valor de la segunda venta");
		double venta2 = sc.nextDouble();
		System.out.println("Ingrese el valor de la tercera venta");
		double venta3 = sc.nextDouble();
		double comision = (venta1 + venta2 + venta3) * 0.1;

		System.out.println("El valor de su comision es: " + comision);
		System.out.println("El valor de su sueldo mas comision es: " + (sueldoBase + comision));

	}

}
