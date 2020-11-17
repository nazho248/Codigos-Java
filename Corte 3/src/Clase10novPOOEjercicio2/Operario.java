package Clase10novPOOEjercicio2;

public class Operario extends Empleado {
	
	

	public Operario(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Tipo Empleado: Operario, Nombre: " + getNombre();
	}
	
	
	
}
