package Clase10novPOOEjercicio3;

public class Libro extends Publicacion{
	
	public int numeroPaginas;
	public int aņoPublicacion;
	
	
	
	public Libro(int x, String y, int z, int a) {
		super(x,y);
		numeroPaginas=z;
		aņoPublicacion=a;
	}



	@Override
	public String toString() {
		return "Libro [numeroPaginas=" + numeroPaginas + ", aņoPublicacion=" + aņoPublicacion + ", precio=" + precio
				+ ", nombre=" + nombre + "]";
	}
	
	

}
