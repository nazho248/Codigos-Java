package Clase10novPOOHerencia;

public class Rectangulo extends FormaDosD {
	
	public boolean Escuadrado() {
		if (ancho==altura) {
			return true;
		}
		return false;
	}
	
	public double area () {
		double area= this.altura*this.ancho;
		return area;
		
	}

}
