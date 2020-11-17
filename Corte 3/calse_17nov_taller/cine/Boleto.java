package cine;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Boleto extends Sala{
	
	private String nombre;
	private int  ID;
	private ArrayList<Silla> sillisas = new ArrayList<Silla>() ;
	

	public Boleto() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int  getID() {
		return ID;
	}
	public void setID(int  iD) {
		ID = iD;
	}
	//sillas ocupadas :3
	public ArrayList<Silla> getSillisas() {
		return sillisas;
	}
	public void setSillisas(ArrayList<Silla> sillisas) {
		this.sillisas = sillisas;
	}
	
	@Override
	public String toString() {
		
		return "Boleto ["+ ID +"] nombre=" + nombre +"  "+getPelicula()+"| Sala : "+(getNumero()+1)+"|   sillisas=" + sillisas +" ]";

	}

	
	
	
	/*@Override
	public String toString() {
		return "Boleto ["+ ID +"] nombre=" + nombre +"  "+getPelicula()+" Sala : "+(getNumero()+1)+"  Silla=" + getSillas() +" ]";
	}
	*/


}
