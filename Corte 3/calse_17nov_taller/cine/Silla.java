package cine;

public class Silla extends Sala{
	
       private int posicionX;
       private int posiciony;
       private Boolean ocupado;
       private int numsilla;
       
       
       
       
	public int getNumsilla() {
		return numsilla;
	}
	public void setNumsilla(int numsilla) {
		this.numsilla = numsilla;
	}
	public int getPosicionX() {
		return posicionX;
	}
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}
	public int getPosiciony() {
		return posiciony;
	}
	public void setPosiciony(int posiciony) {
		this.posiciony = posiciony;
	}
	
	
	
	public Boolean getOcupado() {
		return ocupado;
	}
	public void setOcupado(Boolean ocupado) {
		this.ocupado = ocupado;
	}
	
	@Override
	public String toString() {
		return "Silla [num=" + numsilla + "]";
	}

	
	
	


}
