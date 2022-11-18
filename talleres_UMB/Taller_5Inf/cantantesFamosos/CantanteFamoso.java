package cantantesFamosos;

public class CantanteFamoso {
	
	private String nombre;
	private String discoConMasVentas;
	private int cantVentas;
	
	
	public CantanteFamoso(String nombre, String discoConMasVentas, int cantVentas) {
		super();
		this.nombre = nombre;
		this.discoConMasVentas = discoConMasVentas;
		this.cantVentas = cantVentas;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDiscoConMasVentas() {
		return discoConMasVentas;
	}
	public void setDiscoConMasVentas(String discoConMasVentas) {
		this.discoConMasVentas = discoConMasVentas;
	}
	
	public int getCantVentas() {
		return cantVentas;
	}


	public void setCantVentas(int cantVentas) {
		this.cantVentas = cantVentas;
	}


	@Override
	public String toString() {
		return "nombre: " + nombre + ", | discoConMasVentas: " + discoConMasVentas + "#ventas: "+cantVentas+ "M\n";
	}

	

}
