package Clase10novPOOHerencia;

public class Ejecutable {

	public static void main(String[] args) {
		
		Triangulo t1 = new Triangulo();
		Triangulo t2 = new Triangulo();
		Rectangulo r1=new Rectangulo();
		
		t1.altura=4.0;
		t1.ancho=4.0;
		t1.estilo="isoceles";
		
		t2.altura	=8;
		t2.ancho=12;
		t2.estilo="escaleno";
		
		r1.altura= 5;
		r1.ancho =5;
		
		System.out.println("Informacion para t1: ");
		t1.mostrarDimension();
		t1.mostrarEstilo();
		System.out.println("El area es: "+t1.area());
		System.out.println("----------------------------");
		
		System.out.println("Informacion para t2: ");
		t2.mostrarDimension();
		t2.mostrarEstilo();
		System.out.println("El area es: "+t2.area());
		System.out.println("----------------------------");
		
		System.out.println("Informacion de r1: ");
		r1.mostrarDimension();
		if (r1.Escuadrado()) {
			System.out.println(" Es cuadrado");
		}
		else {
			System.out.println("es rectangulo");
		}
		System.out.println("El area es: "+r1.area());
		
		if (t1 instanceof Triangulo) {
			System.out.println("t1 es un triangulo");
		}
		if(r1 instanceof Rectangulo) {
			System.out.println("dio true");
		}
		else {
			System.out.println("f1 no es rectangulo");
		}
		System.out.println(r1.getClass());

	}
	
	

}
