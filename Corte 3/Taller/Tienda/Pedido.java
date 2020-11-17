package Tienda;

public class Pedido  {
	
	private int id;
	private Cliente cliente;
	private String fecha;
	private Boolean enviado=false;
	
	
	
	public Pedido() {
		
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public Boolean getEnviado() {
		return enviado;
	}



	public void setEnviado(Boolean enviado) {
		this.enviado = enviado;
	}



	@Override
	public String toString() {
		return "Pedido [id=" + id + ", cliente=" + cliente + ", fecha=" + fecha + ", enviado=" + enviado + "]";
	}




}
