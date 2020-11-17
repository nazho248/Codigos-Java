package TorneoSaiyajin;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import SuperSayans.Sayayin;

public class Ejecutable {
	/*Se requiere hacer una simulación de un torneo entre 8 guerreros Saiyajin. Para esto debe
crear un programa que llene un array con 8 guerreros Saiyajin con valores random en sus
atributos.
La información que se requiere sobre cada guerrero saiyajin es: Nombre, Poder de Pelea
(1.000 a 10.000), Nivel de Super Saiyajin (1 a 3), Estado (Vivo, Muerto).
Para cada ronda del torneo, siempre se deben enfrentar el primero VS el ultimo guerrero
del array, sin tener en cuenta guerreros muertos y guerreros ya que lucharon en esta ronda.
En total el torneo debe tener 3 rondas. Cada vez que 2 Saiyajin se enfrentan debe imprimirse
los datos de los combatientes e indicar el ganador del combate.
Para definir el ganador de un combate, se debe comparar el poder total de ambos guerreros
teniendo en cuenta su nivel de Super Saiyajin de acuerdo a esta fórmula.
PODER TOTAL = PODER DE PELEA * NIVEL_SUPER_SAIYAJIN*/
	
	static 		Scanner sc = new Scanner(System.in);
	static 		ArrayList<Saiyajin> saiyajins = new ArrayList<Saiyajin>(); //lista introducida 
	static ArrayList<Saiyajin>enfrentamiento = new ArrayList<Saiyajin>(); //lista a enfrentarse
	static ArrayList<Saiyajin> ganadores = new ArrayList<Saiyajin>(); //lista ganadores ronda
static ArrayList<Saiyajin>perdedores = new ArrayList<Saiyajin>() ; //lista perdedores ronda 
	
	public static void main(String[] args) {

		System.out.println("sistema de torneo sayayin");
		System.out.println("Bienvenido al sistema de peleo Saiyajin");
		System.out.println("Se enfrentaran 8 sayayines llenados por pantalla a continuacion");

		for (int i = 0; i <8; i++) {
			Saiyajin sayayin = new Saiyajin ();
			System.out.println("introduce el nombre del sayayin "+(i+1));
			sayayin.setNombre(sc.next());
			System.out.println("introduce el nivel sayayin (de 1 a 3)");
			do {
				sayayin.setNivelSayayin(sc.nextInt());
			} while ((sayayin.getNivelSayayin()<=0)||(sayayin.getNivelSayayin()>3));
			System.out.println("Introduce el nivel de pelea");
			do {
				sayayin.setPoderPelea(sc.nextInt());
			} while ((sayayin.getPoderPelea()<1000)||(sayayin.getPoderPelea()>10000));
			saiyajins.add(sayayin);
		}
		enfrentamiento = (ArrayList<Saiyajin>)saiyajins.clone();
		System.out.println("Ejecutando torneoTorneo sayayin");
		System.out.println("Enfrentamientos");
		System.out.println("Ronda 1:");
		enfrentar(enfrentamiento.size());
		System.out.println("Ronda 2");
		enfrentamiento = (ArrayList<Saiyajin>)ganadores.clone();
		enfrentar(enfrentamiento.size());
		System.out.println("Ronda 3");
		enfrentamiento = (ArrayList<Saiyajin>)ganadores.clone();
		enfrentar(enfrentamiento.size());
		System.out.println("Sayayin Ganador:");
		System.out.println(ganadores.toString());
	}
	
	
	
	public static void enfrentar( int x) {
		ganadores.clear();
		perdedores.clear();
		int contultimo=1;
		 int contsay=0;
		 int consultar=0;
		 
		for (int i = 0; i <enfrentamiento.size(); i++) {
			Saiyajin ganadors = new Saiyajin();

			if (((i+1)==1)||((i+1)==3)||((i+1)==5)||(i+1)==7) {


				System.out.print("("+(contsay+1)+"). "+enfrentamiento.get(contsay).toPelear());
				System.out.print( " Vs ");
				contsay=contsay+1;
			}
			else {				
				System.out.print("("+(enfrentamiento.size()-contultimo+1)+"). "+enfrentamiento.get(enfrentamiento.size()-contultimo).toPelear());
				System.out.println("");
				contultimo++;
				// guardar ganador :)
				
				if (enfrentamiento.get(contsay-1).PoderTotal()>enfrentamiento.get(enfrentamiento.size()-contultimo+1).PoderTotal()) {
					System.out.print("I ");
					System.out.println("Gana el sayayin #"+(enfrentamiento.size()-contultimo+2));
					
				
					enfrentamiento.get(contsay).setEstado(false); //se murio el perdedor
					
					perdedores.add(enfrentamiento.get((contsay)));					
					ganadores.add(enfrentamiento.get((enfrentamiento.size()-contultimo-1)));
					


				}
				else { //gana el segundos
					System.out.print("II ");
					System.out.println("Gana el sayayin #"+((enfrentamiento.size()-contultimo+2)));
					
					enfrentamiento.get((enfrentamiento.size()-contultimo)).setEstado(false); //se murio el perdedor
					ganadores.add(enfrentamiento.get((enfrentamiento.size()-contultimo+1)));
					perdedores.add(enfrentamiento.get((contsay)));
					

				}
			}
		}



		
	}

}
