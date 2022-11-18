package algoritmos_secuenciales;
import java.util.Scanner;

public class doce {

    public static void main(String[] args){

        /*
        * 12.	Todos los lunes, miércoles y viernes, una persona corre la misma ruta y cronometra los tiempos obtenidos.
         Determinar el tiempo promedio que la persona tarda en recorrer la ruta en una semana cualquiera./
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al programa de calculo de tiempo promedio");
        System.out.println("Ingrese el tiempo del lunes");
        double lunes = sc.nextDouble();
        System.out.println("Ingrese el tiempo del miercoles");
        double miercoles = sc.nextDouble();
        System.out.println("Ingrese el tiempo del viernes");
        double viernes = sc.nextDouble();
        double promedio = (lunes + miercoles + viernes) / 3;
        System.out.println("El tiempo promedio es: " + promedio);

    }


}
