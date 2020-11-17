package SuperSayans;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutable {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Profe no entiendo muy bien el ejercicio, asi que solo enfrento 2 sayayines y imprimo quien gana y la lista :(");
		System.out.println("Bienvenido al sistema de peleo Saiyajin");
		System.out.println("aqui pelearan 8 sayajines entre si");
		
		ArrayList<Sayayin> sayayines = new ArrayList<>();

		for (int i = 0; i <2; i++) {
			Sayayin sayayin = new Sayayin ();
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
			sayayines.add(sayayin);
		}
		
		//pelea greca
		if (sayayines.get(0).PoderTotal(sayayines.get(0).getPoderPelea(), sayayines.get(0).getNivelSayayin()) > 
		sayayines.get(sayayines.size()-1).PoderTotal   (/*Poder*/sayayines.get(sayayines.size()-1).getPoderPelea(),/*Nivel*/sayayines.get(sayayines.size()-1).getNivelSayayin())){
			System.out.println("Gana el primero");
			sayayines.get(sayayines.size()).setEstado(false);
			
		}
		else {
			System.out.println("gana el ultimo");
			sayayines.get(0).setEstado(false);

		}
		
		for (Sayayin sayayin : sayayines) {
			System.out.println(sayayin.toString());
			
		}
		
		
		

	}

}
