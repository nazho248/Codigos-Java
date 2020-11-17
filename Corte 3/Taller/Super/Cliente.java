package Super;

public class Cliente {
	
	private String Nombre;
	private int numerocliente;
	
	
	
	
	public Cliente() {
		super();
	}




	public String getNombre() {
		return Nombre;
	}




	public void setNombre(String nombre) {
		Nombre = nombre;
	}




	public int getNumerocliente() {
		return numerocliente;
	}




	public void setNumerocliente(int numerocliente) {
		this.numerocliente = numerocliente;
	}




	@Override
	public String toString() {
		return "Cliente [Nombre=" + Nombre +  "]";
	}

	

}
