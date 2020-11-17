package Clase10novPOOEjercicio3;

public class Disco extends Publicacion{
	
	public float duracion;

	public Disco(float precio, String nombre,float dur) {
		super(precio, nombre);
		this.duracion=dur;
	}
	
	

	public Disco() {
		super();
	}



	@Override
	public String toString() {
		return "Disco [duracion=" + duracion + ", precio=" + precio + ", nombre=" + nombre + "]";
	}
	
	

}
