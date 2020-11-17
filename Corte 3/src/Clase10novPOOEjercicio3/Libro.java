package Clase10novPOOEjercicio3;

public class Libro extends Publicacion{
	
	public int numeroPaginas;
	public int añoPublicacion;
	
	
	
	public Libro(int x, String y, int z, int a) {
		super(x,y);
		numeroPaginas=z;
		añoPublicacion=a;
	}



	@Override
	public String toString() {
		return "Libro [numeroPaginas=" + numeroPaginas + ", añoPublicacion=" + añoPublicacion + ", precio=" + precio
				+ ", nombre=" + nombre + "]";
	}
	
	

}
