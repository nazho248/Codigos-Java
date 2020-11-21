package proyecto;

public class Estudiante {
	
	private String nombre;
	private int numero;
	
	
	
	
	public Estudiante() {
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	@Override
	public String toString() {
		return "Estudiante: " + nombre ;
	}
	
	
	
}
