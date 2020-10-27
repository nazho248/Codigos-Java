package oct27ObjetoPersona;
import java.util.ArrayList;
import java.util.Scanner;

import Parcial.Persona;

public class EjecutableArraylist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Persona  personas_A[] = new Persona[3];
		
		ArrayList<Persona> listaPersonas = new ArrayList<>();
		
		for (int i = 0; i < 3; i++) {
			Persona persona = new Persona();
			
			System.out.println("Digite el nombre");
			persona.nombre=sc.next();
			System.out.println("Digite la edad");
			persona.edad=sc.nextInt();
	
			listaPersonas.add(persona); //guarda la persona creada en la lista array
			/*listaPersonas.add(personas_A[0]); //array a arraylist*/
		}
		

		
		
		for (Persona per: listaPersonas ) {
			System.out.println(per.toString());
		}
	}

}
