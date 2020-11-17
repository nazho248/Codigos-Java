package Actividad1Poo;

import java.util.Arrays;

public class Estudiante {
	/*
	 * Defina una clase Estudiante, con atributos: nombre y calificaciones, implemente métodos get y 
	 * set para acceso a atributos e implemente validaciones.*/
	
	/*Use la clase Estudiante para crear un programa ejecutable que le permita administrar las notas finales 
	 *  de 5 materias para 10 estudiantes (tener en cuenta los créditos de las materias).*/
	
	/*El programa debe permitir registrar las notas de los estudiantes y presentar el promedio por estudiante y el mejor promedio del curso, 
	 * imprimiendo en pantalla el nombre del mejor estudiante.*/
	
	
	private static int semestre;
	private String nombre;
	private float notas[]= new float[5];
	private  int  creditos[]=new int[5];
	
	
	
	
	
	
	
	public static int getSemestre() {
		return semestre;
	}
	public static void setSemestre(int semestre) {
		Estudiante.semestre = semestre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float[] getNotas() {
		return notas;
	}
	public void setNotas(float[] notas) {
		this.notas = notas;
	}
	public int[] getCreditos() {
		return creditos;
	}
	public void setCreditos(int[] creditos) {
		this.creditos = creditos;
	}
	
	public float promedio() {
		int totalc=0;
		float prom=0;
		for (int i = 0; i < this.creditos.length; i++) {
			//suma creditos
			totalc=totalc+creditos[i];
			prom= prom+(this.notas[i]*this.creditos[i]);
		}
		
		prom= prom/totalc;
		
		return prom;
	}
	
	
	
	@Override
	public String toString() {
		return "Estudiante [nombre=" + this.nombre +" semestre="+this.semestre +", notas=" + Arrays.toString(this.notas) + ",Creditos= "+Arrays.toString(creditos) +" Promedio= "+promedio()+ " ]";
	}
	
	public String eweEwe() {
		return "Creditos= "+Arrays.toString(creditos);
	}
	
	

	
	
	

	

}
