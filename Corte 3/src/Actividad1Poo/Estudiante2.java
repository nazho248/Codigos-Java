package Actividad1Poo;

import java.util.ArrayList;

public class Estudiante2 {
	
	private String nombre;
	private int semestre;
	private ArrayList<Materia> calificaciones;
	
	
	public Estudiante2() {
		
		calificaciones = new ArrayList<>();

	}
	
	public float Promedio() {
		float resultado=0;
		int totalcreditos=0;
		
		for (Materia nota : calificaciones) {
			resultado = (nota.getNota())*nota.getCreditos();
			totalcreditos= nota.getCreditos()+totalcreditos;
		}
		
		resultado = resultado/totalcreditos;
		return resultado;
		
	}
	
	


	public ArrayList<Materia> getCalificaciones() {
		return calificaciones;
	}


	public void setCalificaciones(ArrayList<Materia> calificaciones) {
		this.calificaciones = calificaciones;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	
	@Override
	public String toString() {
		return "Estudiante2 [nombre=" + nombre + ", semestre=" + semestre + ", calificaciones=" + calificaciones
				+ ", Promedio()=" + Promedio() + "]";
	}

}
