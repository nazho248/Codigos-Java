package Tiendita_Clase;

public class Cliente {
	
	private int ID;
	private String nombre;
	
	public Cliente() {
		
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Cliente [ID=" + ID + ", nombre=" + nombre + "]";
	}
	
	
	
}
