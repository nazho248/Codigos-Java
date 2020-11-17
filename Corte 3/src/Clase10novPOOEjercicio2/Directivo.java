package Clase10novPOOEjercicio2;

public class Directivo extends Empleado {
	
	public Directivo(String nombre) {
		super(nombre);
	}
	
	
	@Override
	public String toString() {
		return "Tipo Empleado: Directivo , Nombre: " + getNombre();
	}
	

}
