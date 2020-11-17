package Super;

public class Factura {
	
	private int  precio;
	private Cliente cliente;
	private int numerofactura;

	
	public Factura() {
		super();
	}





	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public int getNumerofactura() {
		return numerofactura;
	}


	public void setNumerofactura(int numerofactura) {
		this.numerofactura = numerofactura;
	}
	
	@Override
	public String toString() {
		return "Factura [precio=" + precio + ", cliente=" + cliente + ", numerofactura=" + numerofactura + "]";
	}
	
}
