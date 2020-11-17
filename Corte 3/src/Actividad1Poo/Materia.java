package Actividad1Poo;

import java.util.ArrayList;

public class Materia {
	
	private String Nombre;
	private int creditos;
	private float nota;
	
	
	
	public Materia() {
		super();
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getCreditos() {
		
		if (creditos>=1 && creditos<=5) {
			this.creditos=creditos;
		}
		else {
			this.creditos=0;
		}
		
		return this.creditos;
		
		
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Materia [Nombre=" + Nombre + ", creditos=" + creditos + ", nota=" + nota + "]";
	}


}
