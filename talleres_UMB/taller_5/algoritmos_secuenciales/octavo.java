package algoritmos_secuenciales;
import java.util.Scanner;
public class octavo {

    public static void main(String[] args) {

        /*
        8.	Calcular el nuevo salario de un obrero si obtuvo un incremento del 25% sobre su salario anterior.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al programa de calculo de salario");
        System.out.println("Ingrese el salario anterior");
        double salarioAnterior = sc.nextDouble();
        double incremento = salarioAnterior * 0.25;
        double salarioNuevo = salarioAnterior + incremento;
        System.out.println("El salario nuevo es: " + salarioNuevo);

    }

}
