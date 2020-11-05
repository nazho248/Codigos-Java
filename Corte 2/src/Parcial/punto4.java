package Parcial;
import java.util.Scanner;
/*Defina una clase Persona, con atributos: nombre, edad, cedula, sexo, peso y
altura.
Implemente los siguientes constructores:
• Constructor por defecto (vacío).
• Constructor con todos los parámetros.
Implementar los siguientes métodos:
• calcularIMC(): calcular si la persona está en su peso ideal. Devuelve -1 si está
por debajo de su peso ideal, un 0 si está en su peso ideal y un 1 si tiene
sobrepeso.
• esMayorDeEdad(): indicar si es mayor de edad.
• Crear los métodos get y set de cada parámetro.*/

public class punto4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Bienvenido al creador de personas");
		//int numpersonas = sc.nextInt();
		//int creaciones[]= new int[numpersonas];
		
		System.out.println("Se procedera a crear una persona con datos introducidos");
		Persona persona1 = new Persona();
		

		System.out.print("Introduce su sexo (m) o (f): ");
		persona1.setSexo(sc.next());
		System.out.print("Introduce su nombre: ");
		persona1.setNombre(sc.next());
		System.out.print("Introduce su Cedula: ");
		persona1.setCedula(sc.next());
		System.out.print("Introduce su edad: ");
		do {
			persona1.setEdad(sc.nextInt());
		}while(persona1.getEdad()<0);
		System.out.print("Introduce su peso (Kg): ");
		do {
			persona1.setPeso(sc.nextInt());
		}while(persona1.getPeso()<0);
		System.out.println("Introduce su altura (cm): ");
		do {
			persona1.setAltura(sc.nextInt());
		}while(persona1.getAltura()<0);
		

		
		
		System.out.println("La persona creada es:");
		System.out.print("Nombre: "+persona1.getNombre());
		System.out.println(" de sexo  "+persona1.getSexo());
		System.out.println("Cedula: "+persona1.edad);
		System.out.print("Edad: "+persona1.getEdad());
		System.out.println(" "+persona1.esMayorDeEdad()+" es mayor de edad");
		System.out.println("Altura de "+persona1.getAltura()+" Cm");
		System.out.print("Su peso es de "+persona1.getPeso());
		System.out.println(" Peso en "+persona1.calcularIMC()+" (-1 infrapeso | 0 normal | 1 Sobrepeso)");
		System.out.println("");
		System.out.println("------------------------------------------------------------------------");
		
		System.out.println("A continuacion se generara una persona con datos estándar");
		Persona persona2 = new Persona();
		System.out.println("La persona creada es:");
		System.out.print("Nombre: "+persona2.getNombre());
		System.out.println(" su sexo es "+persona2.getSexo());
		System.out.println("Cedula: "+persona2.edad);
		System.out.print("Edad: "+persona2.getEdad());
		System.out.println(" "+persona2.esMayorDeEdad()+" es mayor de edad");
		System.out.println("Altura de "+persona2.getAltura()+" Cm");
		System.out.print("Su peso es de "+persona2.getPeso());
		System.out.println(" Peso en "+persona2.calcularIMC()+" (-1 infrapeso | 0 normal | 1 Sobrepeso)");
		
		System.out.println("--------------------------------------------------------------------------------------");
		
		System.out.println(persona1.toString()); //manera imprimir datos sin escribir todo lo de arriba
	
	}
	

}
