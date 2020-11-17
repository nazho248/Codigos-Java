package cine;

public class Pelicula {
	
	private String peli;
	private int duracion;
	
	
	
	
	public Pelicula() {
		super();
	}
	
	
	public String getPeli() {
		return peli;
	}
	public void setPeli(String peli) {
		this.peli = peli;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	@Override
	public String toString() {
		return "Pelicula: " + peli + " || duracion: " + duracion + " minutos";
	}
	

}
