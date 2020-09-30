package Ejercicios2CortePT2;
import javax.swing.JOptionPane;

public class navegador2Parte {
	public static void main(String[] args) {
		//importar ejercicios
		ejercicio5 exe5 = new ejercicio5();
		ejercicio6 exe6 = new ejercicio6();
		ejercicio7 exe7 = new ejercicio7();
		ejercicio8 exe8 = new ejercicio8();
		int opcion = 1;
		exe7.ventanainfo("Bienvenido al menu de navegacion de mi taller :3");
		exe7.ventanainfo("Dale en salir cuando quieras dejar de ejecutar mis programas");
		
		while  (opcion!=5) {
		 opcion = opciones();
		
		switch (opcion) {
		case 1:
			exe7.ventanainfo("Ejecutando ejercicio 5 en consola");
			System.out.println("--------------------Ejercicio 5--------------------");
			exe5.execute5();
			break;
		case 2:
			exe7.ventanainfo("Ejecutando ejercicio 6 en consola");
			System.out.println("--------------------Ejercicio 6--------------------");
			exe6.execute6();
			break;
		case 3:
			exe7.ventanainfo("Ejecutando ejercicio 7");
			System.out.println("--------------------Ejercicio 7--------------------");
			exe7.execute7();
			break;
		case 4:
			exe7.ventanainfo("Ejecutando ejercicio 8 en consola");
			System.out.println("--------------------Ejercicio 8--------------------");
			exe8.execute8();
			break;
		default:
			break;
		}
		}
		exe7.ventanainfo("Gracias por usar este navegador :3");
		System.exit(0);
		
		
	}
	
	public static int opciones() {
		Object opcion = JOptionPane.showInputDialog(null,"Elija el punto a ejecutar",
				   "Seleccione uno", JOptionPane.QUESTION_MESSAGE, null,
				  new Object[] { "Seleccione","Ejercicio 5", "Ejercicio 6","Ejercicio 7","Ejercicio 8","Salir" },"Seleccione");
		if (opcion.equals("Ejercicio 5")) {
			opcion=1;
		}
		else if (opcion.equals("Ejercicio 6")) {
			opcion=2;
		}
		else if (opcion.equals("Ejercicio 7")) {
			opcion=3;
		}
		else if (opcion.equals("Ejercicio 8")) {
			opcion=4;
		}
		else if (opcion.equals("Salir")) {
			opcion=5;
		}
		else {
			opcion=0;
		}
		
		return (int) opcion;
	}
	
		
	}


