package supermercado;

public class Cliente {
	
	
	private String Nombre;
	private int cont;
	
	public Cliente() {
	}


	public String getNombre() {
		return this.Nombre;
	}


	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}


	public int getCont() {
		return cont;
	}


	public void setCont(int cont) {
		this.cont = cont;
	}


	@Override
	public String toString() {
		return Nombre+ " " ;
	}
}
