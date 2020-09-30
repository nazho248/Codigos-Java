package Ejercicios2CortePT2;
import java.util.Scanner;
import javax.swing.JOptionPane;
/*Realice un algoritmo que lea dos vectores de cien elementos
 *  y que calcule la suma de éstos guardando su resultado en otro 
 *  vector, el cual se debe presentar en forma impresa.*/

public class ejercicio7 {
	public static void main(String[] args) {
		 execute7();
		}
	
	public static void execute7(){
		 Scanner sc = new Scanner(System.in);
		 ventanainfo("Suma de arreglo de 100 espacios");

		 int max=100, min=0; // maximo y minimo numeros aleatorios
		 int datos = 100;

		 int a[]= new int [datos];
		 int b[]= new int [datos];
		 int c []= new int [datos];

			int opcion = ventanita();				
			switch (opcion) {
			
			case 1: //Hacer sufrir a la profe  :3
				
				ventanainfo("introducir valores para el vector 1");
				System.out.println("Vector 1");
				for (int i = 0; i < c.length; i++) {
				System.out.print("("+(i+1)+") ");
				a[i]=sc.nextInt();
				}
				ventanainfo("introducir valores para el vector 2");
				System.out.println("------------Vector 2---------------------");
				for (int i = 0; i < c.length; i++) {
					System.out.print("("+(i+1)+") ");
					b[i]=sc.nextInt();
					c[i]= a[i]+b[i];	
				}
				break;
				
			case 2:
				//llenar datos aleatoriamente
				 for (int i = 0; i < b.length; i++) {
					a[i]= (int) Math.floor(Math.random()*(max-(min)+1)+(min));
					b[i]= (int) Math.floor(Math.random()*(max-(min)+1)+(min));
					c[i]= a[i]+b[i];
				}
				 break;
			default:
				ventanainfo("Fin del programa");
				  System.exit(0);
				break;
			}

			ventanainfo("se ha impreso el resultado en la consola :)");
		 //imprimir
		String alinear = "(%-2s) %-3s + %-3s= %-3s %n";
		System.out.println("     A     B     C     ");
		 for (int i = 0; i < c.length; i++) {
				System.out.format(alinear,(i+1),a[i],b[i],c[i]);
		}
		 System.out.println("-------------------");
	}
	
	public static int ventanita() {
		Object opcion = JOptionPane.showInputDialog(null,"Desea introducir los datos?",
				   "Elija", JOptionPane.QUESTION_MESSAGE, null,
				  new Object[] { "Seleccione","Si", "No (Generar Aleatoriamente)" },"Seleccione");
		
		if (opcion.equals("Si")){		
			return 1;
		}
		else if (opcion.equals("No (Generar Aleatoriamente)")) {
			return 2;
		}
		else {
		return 0;
		}

	}
	
	public static void ventanainfo(String x) {
		JOptionPane.showMessageDialog(null,x);

	}
	

	
	}


