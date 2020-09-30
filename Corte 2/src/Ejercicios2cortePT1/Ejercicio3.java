package Ejercicios2cortePT1;

import java.util.Scanner;

public class Ejercicio3 {
	/* Se requiere un algoritmo para obtener un vector (C) de N elementos que contenga 
	  la suma de los elementos correspondientes de otros dos vectores (A y B).*/
	
	// (int) Math.floor(Math.random()*(9-(0)+1)+(0));

	public static void main(String[] args) {
		System.out.println("Inserte el tamaño del arreglo");
		 Scanner sc = new Scanner(System.in);

		 int max=100, min=0; // maximo y minimo numeros aleatorios
		 int datos = sc.nextInt();

		 int a[]= new int [datos];
		 int b[]= new int [datos];
		 int c []= new int [datos];
			String alinear = "| %-3s + %-3s  = %-3s %n";
			System.out.println("       A       B        C     ");
		 for (int i = 0; i < b.length; i++) {
			 
			a[i]= (int) Math.floor(Math.random()*(max-(min)+1)+(min));
			b[i]= (int) Math.floor(Math.random()*(max-(min)+1)+(min));
			c[i]= a[i]+b[i];
			System.out.print("("+(i+1)+")");

			System.out.format(alinear,a[i],b[i],c[i]);
		}
		 
		 System.out.println("-------------------");
		
	}

}
