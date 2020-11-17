package Clase10novPOOEjercicio3;
import java.util.ArrayList;
public class Ventas {
	
	public ArrayList<Publicacion> publicaciones;
	
	public Ventas() {
		this.publicaciones = new ArrayList<Publicacion>();
	}
	
	
	public void agregarVenta(Publicacion publicacion) {
		publicaciones.add(publicacion);
	}
	
/*	public void mostrar() {
		for (Publicacion publicacion : publicaciones) {
			System.out.println(publicacion.mostrar());
		}
	}
*/
}
