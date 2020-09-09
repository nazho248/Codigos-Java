package ejercicios9sept;
import java.util.Scanner;

public class NotasdelCurso {

	public static void main(String[] args) {
		double Notas=-1, sum=0, prom, nota, alumnos=-1, notamax=0;
		int posicion=0;
		System.out.println("Bienvenido al sistema de calificaciones\n"
				+ "Por favor digite el numero de notas a ingresar");
		while (Notas<0) {
			Notas=scanner(0);
		}
		System.out.println("Ahora por favor digite el numero de alumnos");
		while (alumnos<0) {
			alumnos=scanner(0);
		}
		//OBTENCION DE NOTASS
		for (int i = 1; i<= alumnos; i++) {
			sum=0;
			System.out.println("Digite las notas del alumno "+i);
			
			for (int j = 1; j <= Notas; j++) {
				nota=-1;
				while ((nota<0) || (nota>5)) {
					nota=scanner(j);
				}
				sum=sum+nota;
			}
			prom =sum/Notas;
			System.out.println("El promedio del estudiante "+i+" es de "+prom);
			if (prom>notamax) {
				notamax=prom;
				posicion=i;
			}
			
		}
		System.out.println("El promedio mas alto fue de "+notamax+" del estudiante "+posicion);

	
		}
		
	
	
	 /* SCANNER DE TECLADO*------------------------------------------------------------------------------------------------------------*/
	public static double scanner(int x) {
		double numero = 0;
		Scanner entrada = new Scanner(System.in);
		
		switch (x) {
		case 0: {        //PARA CUALQUIER NUMERO
			System.out.println("Introduce el numero");
			numero=entrada.nextInt();
			if(numero<0) {
				System.out.println("numero inválido, vuelve a intentarlo");
				return numero;

			}
			else {
				return numero;
			}
			}

			default:
				// PARA NOTAS ESTUDIANTES
				System.out.println("introduce la nota "+x+":");
				numero = entrada.nextDouble();
				if ((numero < 0)||(numero >5)) {
					System.out.println("Has introducido un valor inválido, por favor vuelve a intentarlo");
					return numero;
				}
				else {
					return numero;
				}
		}
		}

			
/* FIN SCANNER DE TECLADO-------------------------------------------------------------------------------------------------------------*/
	}


