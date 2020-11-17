package Clase10novPOOEjercicio2;

public class Oficial extends Operario {
	
	public Oficial(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		return "Tipo Empleado: Oficial , Nombre: " + getNombre();
	}
	
	

}
