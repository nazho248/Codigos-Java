package Actividad1Poo;
import java.util.Scanner;

public class Ejecutable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("Bienvenido al gestionador de notas Copernico para 10 alumnos");
		

		Estudiante estudiantes[] = new Estudiante[10];
		System.out.print("Inserte el semestre de los estudiantes: ");
		estudiantes[1].setSemestre(sc.nextInt());
		
		System.out.println("Tenga en cuenta que las notas van de 0 a 5");
		System.out.println("Y que los creditos son los mismos para todos los estudiantes");
		

		for (int i = 0; i < 2; i++) {   // estudiantes.length
			 estudiantes[i] = new Estudiante();
			 float notas[]=new float[5];
			 int creditos[]= new int[5];

			 
			System.out.println("Estudiante "+(i+1)+"---------------------------------------------------");			

			 System.out.print("Introduce el nombre del estudiante: ");
			 estudiantes[i].setNombre(sc.next());
			 
			 System.out.println("Materias de "+ estudiantes[i].getNombre());
			 for (int j = 0; j < 5; j++) {
				 
				String y= ("Nota "+(j+1)+": ");

				do {
					System.out.print(y);
					 notas[j]=sc.nextFloat();
					 if ((notas[j]<0)||(notas[j]>5)){
						 System.out.println("Dato invalido");
					 }
					 
				} while ((notas[j]<0)||(notas[j]>5));
				 
				 
					String x=("credito "+(j+1)+": ");
					 do {
						 
						creditos[j]=scanner(x ,500000,0);
						
					} while (creditos[j]<0);

				 
			}
			 estudiantes[i].setNotas(notas);
			 estudiantes[i].setCreditos(creditos);
			
			 
			
			
		}
		float maxnota =0;
		int posmaxnota=0;
		
		for (int i = 0; i < 2; i++) {
			System.out.println(estudiantes[i].toString());
			
			if (maxnota< estudiantes[i].promedio() ) {
				maxnota =estudiantes[i].promedio();
				posmaxnota=i;
			}
		}
		System.out.println("El estudiante con mayor promedio es: "+estudiantes[posmaxnota].getNombre()+", con un promedio de: "+estudiantes[posmaxnota].promedio());

		
		
	}
	
	//scanner -*-*-*-****-*-*-*--*-*-*-*-*-*-*--*----*-*-*--*-*--*-*-*-*-*--*-*-*-*-*-*
	
			public static int scanner ( String x,int max,int min ){	
				Scanner sc = new Scanner(System.in);
				int variable = 0;
				System.out.print(x);
				variable = sc.nextInt();
				
				if ((variable<min)||(variable>max)) {
					System.out.println("Dato invalido");
					return -4;
				}
				return variable;
	        }
	

}
