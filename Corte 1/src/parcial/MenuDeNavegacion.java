package parcial;

import java.util.Scanner;

public class MenuDeNavegacion {

	public static void main(String[] args) {
		int opcion=-1;
		
		System.out.println("Bienvenido al menu de navegación de mi parcial");
		System.out.println("por favor digite una opción  \n"
				+ "1- Comprobar si un año es Bisiesto o no \n"
				+ "2- Verificar una fecha y los dias del mes \n"
				+ "3- Calcular tabla de multiplicación del 0 al x \n"
				+ "4- Juego: Adivina el numero");
		
		while ((opcion<0)||(opcion>=4))
		 opcion = scanner(0, 4);
		
		switch (opcion) {
		case 1:
			Bisiesto ejercicio1 = new Bisiesto();
			ejercicio1.ejercicio1();

			break;
		case 2:
			Fecha ejercicio2 = new Fecha();
			ejercicio2.ejercicio2();
			
			break;
		case 3:
			TablaMultiplicar ejercicio3 = new TablaMultiplicar();
			ejercicio3.ejercicio3();
			
			break;
		case 4:
			AdivinaElNumero ejercicio4 = new AdivinaElNumero();
			ejercicio4.ejercicio4();
			break;

		default:
			break;
		}
		

	

	}
	


	/* SCANNER DE TECLADO------------------------------------------------------------------------------------------------------------*/
    public static int scanner(int lim, int lim2) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();
        if ((numero < lim) || (numero>lim2)) {
            System.out.println("Has introducido un valor no válido, por favor vuelve a intentarlo");
            return -1;
        }

        return numero;
    }
/* FIN SCANNER DE TECLADO-------------------------------------------------------------------------------------------------------------*/

}
