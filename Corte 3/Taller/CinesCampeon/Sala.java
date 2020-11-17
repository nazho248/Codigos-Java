package CinesCampeon;
import java.util.ArrayList;

public class Sala {
	
	private String pelicula;
	private int numSala;
	private ArrayList<Silla > sillas = new ArrayList<Silla>();
	private int sillasdisponibles=20;
	
	
	public Sala() {
		
		for (int i = 0; i <20; i++) {
			Silla silla = new Silla();
			silla.setNumsilla((i+1));
			sillas.add(silla);
		}
		
	}
	
	
	
	public int getSillasdisponibles() {
		return sillasdisponibles;
	}
	public void setSillasdisponibles(int sillasdisponibles) {
		this.sillasdisponibles = sillasdisponibles;
	}
	public String getPelicula() {
		return pelicula;
	}
	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}
	public int getNumSala() {
		return numSala;
	}
	public void setNumSala(int numSala) {
		this.numSala = numSala;
	}
	public ArrayList<Silla> getSillas() {
		return sillas;
	}
	public void setSillas(ArrayList<Silla> sillas) {
		this.sillas = sillas;
	}
	
	@Override
	public String toString() {
		return "Sala [pelicula=" + pelicula + ", numSala=" + numSala + ", sillas=" + sillas + ", sillasdisponibles="
				+ sillasdisponibles + "]";
	}
	
	public String Sala() {
		return "Sala [pelicula=" + pelicula + ", Sala=" + numSala  + ", sillasdisponibles="
				+ sillasdisponibles + "]";
	}
	

}
