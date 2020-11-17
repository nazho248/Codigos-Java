package cine;
import java.util.ArrayList;

public class Sala {
	
	private  int numero;
	private Pelicula pelicula;
	private int sillasdisponibles=20;
	private ArrayList<Silla> sillas;

	


	public int getSillasdisponibles() {
		return sillasdisponibles;
	}


	public void setSillasdisponibles(int sillasdisponibles) {
		this.sillasdisponibles = sillasdisponibles;
	}


	public Sala() {
		super();
		this.sillas=new ArrayList<>() ;

	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}


	
	public ArrayList<Silla> getSillas() {	
		return sillas;
	}


	public void setSillas(ArrayList<Silla> sillas) {
		this.sillas = sillas;
	}





	@Override
	public String toString() {
		return "--------Sala numero: " + numero + "  " + pelicula + ", Sillas Disponibles=" + sillasdisponibles + "---------";
	}
	
	public String toSala() {
		
		return "Sala "+numero+ " - "+pelicula +"";

	}
	

	



}
	
