package algoritmos_secuenciales;
import java.util.Scanner;
public class septimo {

    public static void main(String[] args) {

       /*
       * 7.	Calcular el número de pulsaciones que una persona debe tener por cada 10 segundos de ejercicio, si la formula es:
			num. Pulsaciones = (220 - edad)/10
       * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al programa de calculo de pulsaciones");
        System.out.println("Ingrese la edad");
        int edad = sc.nextInt();
        int pulsaciones = (220 - edad) / 10;
        System.out.println("El numero de pulsaciones es: " + pulsaciones);



    }

}
