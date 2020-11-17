package Clase10novPOOHerencia;

public class Triangulo extends FormaDosD{
	
	public String estilo;
	
	public Triangulo() {
		super(); //constructor triangulo que trae las variables de formadosD
	}
	
	public double area() {
		double resultado= (ancho*altura)/2;
				return resultado;
	}
	
	public void mostrarEstilo() {
		System.out.println("El triangulo es: "+estilo);
	}

}
