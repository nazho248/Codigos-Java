package Clase10novPOOEjercicio3;

public class Libro extends Publicacion{
	
	public int numeroPaginas;
	public int a�oPublicacion;
	
	
	
	public Libro(int x, String y, int z, int a) {
		super(x,y);
		numeroPaginas=z;
		a�oPublicacion=a;
	}



	@Override
	public String toString() {
		return "Libro [numeroPaginas=" + numeroPaginas + ", a�oPublicacion=" + a�oPublicacion + ", precio=" + precio
				+ ", nombre=" + nombre + "]";
	}
	
	

}
