package algoritmos_secuenciales;
import java.util.Scanner;
public class decimo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /* Algoritmos Secuenciales
        10.	Tres personas deciden invertir su dinero para fundar una empresa.
         Cada una de ellas invierte una cantidad distinta. Obtener el porcentaje que cada quien invierte con respecto a la cantidad total invertida.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al programa de calculo de inversiones");
        System.out.println("Ingrese la cantidad de inversion de la primera persona");
        double inversion1 = sc.nextDouble();
        System.out.println("Ingrese la cantidad de inversion de la segunda persona");
        double inversion2 = sc.nextDouble();
        System.out.println("Ingrese la cantidad de inversion de la tercera persona");
        double inversion3 = sc.nextDouble();
        double inversionTotal = inversion1 + inversion2 + inversion3;
        double porcentaje1 = (inversion1 / inversionTotal) * 100;
        double porcentaje2 = (inversion2 / inversionTotal) * 100;
        double porcentaje3 = (inversion3 / inversionTotal) * 100;
        System.out.println("El porcentaje de inversion de la primera persona es: " + porcentaje1);
        System.out.println("El porcentaje de inversion de la segunda persona es: " + porcentaje2);
        System.out.println("El porcentaje de inversion de la tercera persona es: " + porcentaje3);



    }
}
