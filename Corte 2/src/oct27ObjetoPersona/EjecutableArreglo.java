package oct27ObjetoPersona;
import java.util.Scanner;

import Parcial.Persona;

public class EjecutableArreglo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Persona personas [] = new Persona [3];
		
		for (int i = 0; i < personas.length; i++) {
			personas[i] = new Persona();
			System.out.println("Digite el nombre");
			personas[i].nombre=sc.next();
			System.out.println("Digite la edad");
			personas[i].edad=sc.nextInt();
			/*System.out.println("Digite el sexo");
			personas[i].sexo=sc.next();
			System.out.println("Digite la cedula");
			personas[i].cedula=sc.next();*/
			
		}
		
		
		int cont =0;
		for (int i = 0; i < personas.length; i++) {
			
			if (personas[i].esMayorDeEdad()=="Si"){
				cont = cont+1;
			}
			System.out.println(personas[i].toString());
		}
		
		System.out.println("hay "+cont+" mayores de edad");
		
	}

}
