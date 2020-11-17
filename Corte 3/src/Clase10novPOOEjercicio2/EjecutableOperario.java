package Clase10novPOOEjercicio2;
import java.util.Scanner;
public class EjecutableOperario {
	
	public static void main(String[] args) {
		int opcion;
		String nombreEmp;
		
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Seleccione el tipo de empleado que desea crear \n"
					+ "1. Empleado (sin cargo)\n"
					+ "2. Operario \n"
					+ "3. Direvtivo \n"
					+ "4. Oficial \n"
					+ "5. Tecnico");
			
			System.out.print("Digite una opcion: ");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 0:
				System.out.println("Fin del programa");
				break;
			case 1:
				System.out.print("Digite el nombre: ");
				nombreEmp=sc.next();
				Empleado empleado = new Empleado ( nombreEmp);
				System.out.println(empleado.toString());
				break;
			case 2:
				System.out.print("Digite el nombre: ");
				nombreEmp=sc.next();
				Operario operario = new Operario ( nombreEmp);
				System.out.println(operario.toString());
				
				break;
			case 3:
				System.out.print("Digite el nombre: ");
				nombreEmp=sc.next();
				Directivo directivo = new Directivo( nombreEmp);
				System.out.println(directivo.toString());
				
				break;
			case 4:
				System.out.print("Digite el nombre: ");
				nombreEmp=sc.next();
				Oficial oficial = new Oficial ( nombreEmp);
				System.out.println(oficial.toString());
				
				break;
			case 5:
				System.out.print("Digite el nombre: ");
				nombreEmp=sc.next();
				Tecnico tecnico = new Tecnico ( nombreEmp);
				System.out.println(tecnico.toString());
				
				break;
			default:
				System.out.println("OPCION INVALIDA ");
				break;
			}
			System.out.println("----------------------------------------------");

		} while (opcion!=0);
		
		
	}

}
