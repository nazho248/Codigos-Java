package supermercado;

public class Factura {
	
	private int numeroFactura;
	private Cliente persona;
	private int precio;
	
	
	public Factura() {
		
	}


	public int getNumeroFactura() {
		return numeroFactura;
	}


	public void setNumeroFactura(int numeroFactura) {
		this.numeroFactura = numeroFactura;
	}


	public Cliente getPersona() {
		return persona;
	}


	public void setPersona(Cliente persona) {
		this.persona = persona;
	}


	public int getPrecio() {
		if (precio<0) {
			System.out.println("Dato invalido");
		}
		
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Factura NumeroFactura: " + numeroFactura + " Nombre: " + persona + ", precio: " + precio + "$";
	}
	 

}
