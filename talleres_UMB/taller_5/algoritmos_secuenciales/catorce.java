package algoritmos_secuenciales;
import java.util.Scanner;
public class catorce {

    public static void main(String[] args){
        /*
        * 14.	En un hospital existen tres áreas: Ginecología, Pediatría, Traumatología. El presupuesto anual del hospital se reparte conforme a la sig. tabla:
			Área			Porcentaje del presupuesto
			Ginecología			39.75%
			Traumatología		              31.65%
			Pediatría			28.6%
		Obtener la cantidad de dinero que recibirá cada área, para cualquier monto presupuestal.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al programa de calculo de presupuesto");
        System.out.println("Ingrese el presupuesto");
        double presupuesto = sc.nextDouble();
        double ginecologia = presupuesto * 0.3975;
        double traumatologia = presupuesto * 0.3165;
        double pediatria = presupuesto * 0.286;
        System.out.println("El presupuesto para ginecologia es: " + ginecologia);
        System.out.println("El presupuesto para traumatologia es: " + traumatologia);
        System.out.println("El presupuesto para pediatria es: " + pediatria);
        

    }

}
