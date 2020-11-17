package Clase10novPOOEjercicio2;

public class Tecnico  extends Operario{
	
	public Tecnico(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		return "Tipo Empleado: Tecnico , Nombre: " + getNombre();
	}
	

}
