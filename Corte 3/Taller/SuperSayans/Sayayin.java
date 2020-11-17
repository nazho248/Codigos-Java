package SuperSayans;

public class Sayayin {
	
	private int poderPelea;
	private int nivelSayayin ;
	private String nombre;
	private boolean estado =true;
	
	public int PoderTotal(int poder, int nivel){
		int PoderTotal = poder*nivel;
		return PoderTotal;
	}
	
	
	
	public int getPoderPelea() {
		return poderPelea;
	}
	public void setPoderPelea(int poderPelea) {
		this.poderPelea = poderPelea;
		if ((this.poderPelea<1000)||(this.poderPelea>10000)) {
			System.out.println("Dato fuera de rango");
		}
	}
	public int getNivelSayayin() {
		return nivelSayayin;
	}
	public void setNivelSayayin(int nivelSayayin) {

		this.nivelSayayin = nivelSayayin;
		
		if ((this.nivelSayayin<=0)||(this.nivelSayayin>3)) {
			System.out.println("Dato fuera de rango");
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}



	@Override
	public String toString() {
		return "Sayayin [poderPelea=" + poderPelea + ", nivelSayayin=" + nivelSayayin + ", nombre=" + nombre
				+ ", estado=" + estado + "]";
	}
}
