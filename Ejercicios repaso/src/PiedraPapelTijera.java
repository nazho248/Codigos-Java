import java.util.Scanner;
public class PiedraPapelTijera {
	/*
	 * 5. En cada ronda del juego “piedra, papel o tijera”, los dos competidores deben elegir entre jugar
tijera, papel o piedra.
Las reglas para decidir quién gana la ronda son: tijera le gana a papel, papel le gana a piedra,
piedra le gana a tijera, y todas las demás combinaciones son empates.
El ganador del juego es el primero que gane tres rondas.
Escriba un programa que pregunte a cada jugador cuál es su jugada, muestre cuál es el marcador
después de cada ronda, y termine cuando uno de ellos haya ganado tres rondas. Los jugadores
deben indicar su jugada escribiendo tijera, papel o piedra
*/
	static int jugador1=0,jugador2=0, rondas=1;
	static Scanner sc = new Scanner(System.in);
	
public static void main(String[] args) {
	System.out.println("Bienvenido al programa para jugar piedra papel o tijera :3 ");
	System.out.println("Seran 3 rondas a ganar");
	//0 empate, 1 jugador 1 gana, 2 jugador 2 gana
	do {
		System.out.println("---------------------------- ronda #"+rondas+"------------------------------------");
		calculo(jugada());
		System.out.println("Puntuacion:");
		System.out.println("Jugador1: "+jugador1+" | jugador2:"+jugador2 );
	} while ((jugador1<3) &&  (jugador2<3));
	if (jugador1==3) {
		System.out.println("X-----------------------Gana jugador 1-----------------------X");	}
	else {
		System.out.println("X-----------------------Gana jugador 2-----------------------X");
	}
}

//---------------------------------------------------------------------
public static void calculo(int x) {
	rondas++;
	switch (x) {
	case 1:
		jugador1++;
		break;
	case 2:
		jugador2++;
		break;
	default:
		break;
	}
}

public static int jugada() {
	int jugada1, jugada2, ganador=0;
	datos("jugador 1");
	jugada1= scanner("", 3, 1);
	datos("jugador 2");
	jugada2= scanner("", 3, 1);
	System.out.println("XXX ");
	if ((jugada1==1&&jugada2==3)||( jugada1==2&&jugada2==1)||(jugada1==3&&jugada2==2)) {
		System.out.println("Gana jugador 1");
		ganador=1;
	}
	else if (jugada1==jugada2) {
		System.out.println("Empate");
	}
	else {
		System.out.println("Gana jugador 2");
		ganador=2;
	}
	return ganador;
}

public static void datos(String X) {
	System.out.println("Elige la opcion "+X+" \n"
			+ "1 - Piedra   | 2- Papel   |3-Tijera");
}

/* SCANNER DE TECLADO 2.0 con verificacion  INT :)*------------------------------------------------------------------------------------------------------------*/
//scanner
public static int scanner ( String x,int max,int min ){	
	int variable = 0;
	do {
		System.out.print(x);
		variable = sc.nextInt();
		if ((variable<min)||(variable>max)) {
			System.out.println("Dato invalido, vuelve a introducirlo");
		}
	} while (variable <min || variable >max);
	return variable;
}
/* FIN SCANNER DE TECLADO-------------------------------------------------------------------------------------------------------------*/	

}
