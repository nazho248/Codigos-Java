package Ejercicios2CortePT2;

public class ejercicio8 {
	
	/*Se tiene en un arreglo cien elementos representando calificaciones
	 *de los estudiantes de una escuela. Realice un algoritmo que lea el 
	 *arreglo y calcule la calificación promedio del grupo, además, que
	 *cuente los estudiantes queobtuvieron calificaciones arriba del promedio 
	 *del grupo. Represéntelo mediante diagrama de flujo, diagrama N/S y pseudocódigo.*/
	
	//Math.floor(Math.random()*(max-(min)+1)+(min));
	
	public static void main(String[] args) {
		execute8();
		
	}
	public static void execute8() {
		System.out.println("Bienvenido al calculador de promedio de 100 estudiantes aleatorios \n"
				+ "y saber cuantos pasaron sobre el promedio (si es igual al promedio no se cuenta)");
		float datos[]=new float[2]; //0 para sumatoria y 1 para contador
		float notas []= new float [100];
		notas= rellenador(notas,4);
		imprimir(notas);
		datos=calculador(notas);
		texto("El promedio del curso es ", datos, "y hay", "estudiantes sobre el promedio");
		
	}
	public static void texto(String txt1, float[] dato, String txt2, String txt3){
		System.out.print(txt1+" ");
		System.out.print(dato[0]);
		System.out.print(" "+txt2+" ");
		System.out.print(dato[1]);
		System.out.print(" "+txt3+". ");
	}
	
	
	
	public static float[] calculador(float[] x) {
		float suma=0;
		float contador=0;
		for (int i = 0; i < x.length; i++) {
			suma=x[i]+suma;
		}
		float promedio= Math.round((suma/100)*10);
		promedio= promedio/10;
		for (int i = 0; i < x.length; i++) {
			if (x[i]>=promedio) {
				contador=contador+1;
			}
		}
		contador= (int)Math.floor(contador);
		float calculo[]= {promedio,contador};
		
		return calculo;
	}
	//rellenador de arrays
	public static float[] rellenador(float[] notas, float max) {
		
		for (int i = 0; i < notas.length; i++) {
			notas[i]= Math.round((Math.random()*(max-(0)+1)+(0))*10);	
			notas[i]=notas[i]/10;
		}
		return notas;
	}
	public static void imprimir(float[]x) {
		
		String alinear = "(%-2s) %-2s %n";
		
		for (int i = 0; i < x.length; i++) {
			System.out.format(alinear,(i+1),x[i]);
		}
	}

}
