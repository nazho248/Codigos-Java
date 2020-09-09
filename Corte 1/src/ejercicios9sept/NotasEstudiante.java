package ejercicios9sept;
import java.util.Scanner;

public class NotasEstudiante {

	public static void main(String[] args) {
		double nota, sum=0, prom;
		int cont=0;
		System.out.println("Bienvenido al sistema de calificaciones \n"
				+ "Por Favor digite el nombre ");
		String nombre=palabra();
		
		System.out.println("Por Favor digite las 5 notas de "+nombre);
		
		while (cont<=4) {
			nota=-1;
			cont++;
			while ((nota<0) || (nota>5)) {
				nota=scanner(cont);
			}
			sum=sum+nota;
		}
		prom = sum/5;
		String text=condicional(prom);
		
		System.out.println("El promedio de "+nombre+" está "+text+" con un promedio de "+prom);
		

		 
		}
		
	
	
	 /* SCANNER DE TECLADO*------------------------------------------------------------------------------------------------------------*/
	public static double scanner(int x) {
		double numero = 0;
		System.out.println("introduce la nota "+x+":");
		Scanner entrada = new Scanner(System.in);
		numero = entrada.nextDouble();
		if ((numero < 0)||(numero>5)) {
			System.out.println("Has introducido un valor inválido, por favor vuelve a intentarlo");
			return numero;
		}

		return numero;
	}
/* FIN SCANNER DE TECLADO-------------------------------------------------------------------------------------------------------------*/
	
	 /* SCANNER DE TECLADO String*------------------------------------------------------------------------------------------------------------*/
	public static String palabra() {
		String name = "";
		Scanner entrada = new Scanner(System.in);
		name = entrada.next();
		return name;
	}
/* FIN SCANNER DE TECLADO String-------------------------------------------------------------------------------------------------------------*/
	
	public static String condicional(double prom) {
		String text="";
		
		 if (prom<3.0) {
			 text="Mal";
		 }
		 else if (prom>=3.0 && prom <=3.5) {
			 text="Regular";
		 }
		 else if (prom>=3.5 && prom <=4) {
			 text="Bien";
		 }
		 else if (prom>=4.0 && prom <=4.5) {
			 text="Muy bien";
		 }
		 else if (prom>=4.5 && prom <=5) {
			 text="Excelente";
		 }
		return text;
	}

}
