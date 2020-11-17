package Clase10novPOOEjercicio3;

public class Publicacion {
	
	public float precio;
	public String nombre;
	
	
	public Publicacion() {
		super();
	}
	
	public void mostrar() {
		System.out.println("precio: "+this.precio+" nombre: "+this.nombre);
	}
	
	public Publicacion(float precio, String nombre) {
		super();
		this.precio = precio;
		this.nombre = nombre;
	}


	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
