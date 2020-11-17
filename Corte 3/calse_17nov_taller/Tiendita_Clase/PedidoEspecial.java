package Tiendita_Clase;

import Super.Cliente;

public class PedidoEspecial extends Pedido{
	
	private String Origen;
	private Boolean materialOrganico;
	public String getOrigen() {
		return Origen;
	}
	public void setOrigen(String origen) {
		Origen = origen;
	}
	public Boolean getMaterialOrganico() {
		return materialOrganico;
	}
	public void setMaterialOrganico(Boolean materialOrganico) {
		this.materialOrganico = materialOrganico;
	}
	public PedidoEspecial() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PedidoEspecial [Origen=" + Origen + ", materialOrganico=" + materialOrganico + ", getCliente()="
				+ getCliente() + ", getFecha()=" + getFecha() + ", getEnviado()=" + getEnviado() + "]";
	}
	
	

	


	
}
