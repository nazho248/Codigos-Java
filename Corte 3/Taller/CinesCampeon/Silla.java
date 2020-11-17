package CinesCampeon;

public class Silla {
	
	private boolean ocupado=false;
	private int numsilla;

	public Silla() {
	}
	
	

	public boolean isOcupado() {
		return ocupado;
	}
	
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public int getNumsilla() {
		return numsilla;
	}



	public void setNumsilla(int numsilla) {
		this.numsilla = numsilla;
	}



	@Override
	public String toString() {
		return "Silla: " + numsilla + "| Ocupada:  " + ocupado + "]";
	}
	
	public String toDisponible() {
		return "Silla: " + numsilla +  "]";
	}

		
	






}
