import java.util.Scanner;
public class CalculadoraCalorias {
	/*. 
	 * Escriba un programa que recomiende el número de calorías que una persona debe comer cada día.
        Las calorías son unidades de energía que se encuentran en todos los alimentos. Base su
        recomendación sobre el peso de la persona y si la persona tiene un estilo de vida activo o sedentario
        (inactivo). Si la persona es sedentaria, el factor de actividad de esa persona es 13. Si la persona está
        activa, el factor de actividad de esa persona es 15. Multiplique el factor de actividad por el peso de
        la persona para obtener el número recomendado de calorías. Además, si la persona es menor de 25
       años requiere un 15% más de calorías, en cambio, si es mayor de 60 requiere 5% menos de calorías.

	 * */
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean sedentario=false;
		int  peso=0, ewe, edad;
		System.out.println("Bienvenido al recomendador ");
		do {
			peso = scanner("Introduce tu peso:  ",200,1);
		} while (peso<=0);
		do {
			edad = scanner("Introduce tu edad:  ",130,1);
		} while (peso<=0);
		do {
		System.out.print("¿Eres sedentario?    1| si , 2|no:  ");
		ewe = sc.nextInt();
		switch (ewe) {
		case 1:
			sedentario = true;
			break;
		case 2:
			sedentario = false;
			break;
		default:
			System.out.println("Opcion invalida");
			break;
		}
		} while ((ewe!=1) && (ewe!=2));
		//fin do while
		double  factoredad,factorsedendario;
		//Factor Edad
		if (edad<=25) {
			factoredad=1.15;
		}
		else if (edad>=60) {
			factoredad=0.95f;
		} else {
			factoredad=1f;
		}
		//Factor Sedentarismo
		if (sedentario) {
			factorsedendario=13;
		}
		else {
			factorsedendario=15;
		}
		System.out.println("Las calorias que debes consumir son: " +( Math.floor( ((peso*factorsedendario)*factoredad)*100))/100);
	}
	
	
	/* SCANNER DE TECLADO*------------------------------------------------------------------------------------------------------------*/
	//scanner
	public static int scanner ( String x,int max,int min ){	
		Scanner sc = new Scanner(System.in);
		int variable = 0;
		System.out.print(x);
		variable = sc.nextInt();
		
		if ((variable<min)||(variable>max)) {
			System.out.println("Dato invalido");
			return -1;
		}
		return variable;
	}
	/* FIN SCANNER DE TECLADO-------------------------------------------------------------------------------------------------------------*/	
}
