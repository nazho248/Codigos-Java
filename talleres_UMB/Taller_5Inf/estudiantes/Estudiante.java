package estudiantes;

public class Estudiante {

	private String nombres;
	private String apellidos;
	private String direccion;
	private int telefono;
	private String carrera;
	

	public Estudiante(String nombres, String apellidos, String direccion, int telefono, String carrera) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.carrera = carrera;
	}
	
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Estudiante [nombres=" + nombres + ", apellidos=" + apellidos + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", carrera=" + carrera + "]";
	}

	
}
