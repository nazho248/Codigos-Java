package corregir;

public class Estudiante {
	


	    private String nombre;
	    private float calificacion[]= new float [5];
	    private int creditos;

	    public int getCreditos() {
	        return creditos;
	    }
	    public void setCreditos(int creditos) {
	        this.creditos = creditos;
	    }
	    public String getNombre() {
	        return nombre;
	    }
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
	    public float[] getCalificacion() {
	        return calificacion;
	    }
	    public void setCalificacion(float[] calificacion) {
	        this.calificacion = calificacion;
	    }

	    }


