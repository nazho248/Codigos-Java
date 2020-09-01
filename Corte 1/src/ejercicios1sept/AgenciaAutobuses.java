package ejercicios1sept;
import java.util.Scanner;
public class AgenciaAutobuses {

	public static void main(String[] args) {
		/* Una compañía de viajes cuenta con tres tipos de autobuses (A, B y
           C), cada uno tiene un precio por kilómetro recorrido por persona, los
           costos respectivos son $2.0, $2.5 y $3.0. Se requiere determinar el
           costo total y por persona del viaje considerando que cuando éste se
           presupuesta debe haber un mínimo de 20 personas, de lo contrario el
           cobro se realiza con base en este número límite.
*/
		
		int personas, Km;
		double A=2, B=2.5, C=3 , precio;
		
		
		System.out.println("Bienvenido a la Agencia de Viajes");
		
		System.out.println("Por favor Introduzca el tipo de autobus. A cuesta: "+A+"$ , B cuesta: "+B+"$ y C cuesta: "+C+"$");
		Scanner entrada = new Scanner(System.in);
		String Tipo = entrada.nextLine();
		
		boolean x = Tipo.equals("A")==false;
		boolean y = Tipo.equals("B")==false;
		boolean z = Tipo.equals("C")==false;
		boolean o = Tipo.equals("a")==false;
		boolean p = Tipo.equals("b")==false;
		boolean q = Tipo.equals("c")==false;
		
		while ((x != false)&&(y != false)&&(z != false)&&(o != false)&&(p != false)&&(q != false)){
			System.out.println("Este autobús no existe, Por favor reinicie el programa");
			fin();
		}

		System.out.println("Ahora por favor introduzca el número de personas que va a viajar");
		
		 personas = scanner();
		/* verificacion valor positivo */
		while (personas < 0) {
			personas = scanner();
		}
		
		System.out.println("¿Cuantos kilometros va a viajar?");
		 Km = scanner();
		/* verificacion valor positivo */
		while (Km < 0) {
			Km = scanner();
		}
		
		
		double bus= evaluador(Tipo , A, B, C);
		
		if (personas <= 20) {
			 precio=(20*bus)*Km;
			
		}
		else {
			 precio= (personas*bus)*Km;
		}
		
		double pagar= precio/personas;
	    pagar = Math.round(pagar * 100);
	    pagar=pagar/100;
		System.out.println("El Costo del viaje es de: "+precio+"$ por lo que a cada persona le corresponde pagar: "+pagar+"$");
		
		
		}
		
		
	
	
	
	
	 /* SCANNER DE TECLADO*------------------------------------------------------------------------------------------------------------*/
	public static int scanner() {
		int numero = 0;
		System.out.println("introduce el número:");
		Scanner entrada = new Scanner(System.in);
		numero = entrada.nextInt();
		if (numero < 0) {
			System.out.println("Has introducido un valor inválido, por favor vuelve a intentarlo");
			return numero;
		}

		return numero;
	}
/* FIN SCANNER DE TECLADO-------------------------------------------------------------------------------------------------------------*/
	
	
	/* Evaluar tipo de Autobús*/
	 
	public static double evaluador(String bus, Double A, Double B,Double C) {
		double tipo = 0;
		if ((bus.equals("A"))||(bus.equals("a"))) {
			tipo=A;
		}
		else if ((bus.equals("B"))||(bus.equals("b"))) {
			tipo=B;
		}
		else {
			tipo=C;
		}
		
		return tipo;
	}
	
	
	
	/* Terminar programa */
	public static void fin() {
		
		System.out.println("fin del programa");
		System.exit(1);
	}
	
}

