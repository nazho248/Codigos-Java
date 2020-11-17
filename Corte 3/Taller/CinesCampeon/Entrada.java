package CinesCampeon;
import java.util.ArrayList;

public class Entrada extends Sala{
	
	private int serial;
	private ArrayList<Silla> sillasO = new ArrayList<Silla>();
	
	
	public Entrada() {
	}
	
	
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
	}
	
	
	public ArrayList<Silla> getSillasO() {
		return sillasO;
	}
	public void setSillasO(ArrayList<Silla> sillasO) {
		this.sillasO = sillasO;
	}
	
	@Override
	public String toString() {
		return "Entrada [Pelicula : "+getPelicula()+"serial=" + serial + ", sillasO=" + sillasO + "]";
	}

}
