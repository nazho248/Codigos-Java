package oct27ObjetoPersona;

import Parcial.Persona;

public class Ejecutable {
	public static void main(String[] args) {
		
		
		Persona persona1= new Persona("Alejandro", 15, "1234567879", 66f, 117f, "m");
		persona1.setTexto("Modificado en la persona 1");
		
		Persona persona2= new Persona ("Maria", 14, "22434567879", 51f, 158f,"m");
		persona2.setTexto("Modificado en la persona 2");
		
		System.out.println("Impresion de datos");
		System.out.println(persona1.getClass());
		
		
		System.out.println(persona1.toString());
		System.out.println(persona1.getTexto());
		
		System.out.println(persona2.toString());
		System.out.println(persona2.getTexto());
	}

}
