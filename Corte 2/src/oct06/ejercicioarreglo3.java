package oct06;

public class ejercicioarreglo3 {
	
	public static void main(String[] args) {
		/*En un arreglo se tienen registradas las ventas de cinco empleados durante
        cinco días de la semana. Se requiere determinar cuál fue la venta mayor
        realizada.*/
		
		int tablita [][]= new int [5][5];
		int maximo = 0, min =1000  ;
		int cont = 0, contmin=0;
		int dia = 0, diamin=0;
		
		String dias[]= {"Lunes","Martes","Miercoles","Jueves","Viernes"};
		String persona[]= {"pepe","gonzalo","maria","fernando","xd"};
		
		for (int i = 0; i < tablita.length; i++) {
			System.out.println(" ");
			System.out.println(persona[i]+"------------------------------------------------------------");
			
			for (int j = 0; j < tablita.length; j++) {
				System.out.print("|"+dias[j]  +"=");
					tablita[i][j]= (int) Math.floor(Math.random()*(1000-(0)+1)+(0));
					System.out.print(tablita[i][j]+"$");
			}
			//evaluar maxima venta
		}
		
		for (int i = 0; i < tablita.length; i++) {
			
			for (int j = 0; j < tablita.length; j++) {
				
				if (tablita[i][j]>maximo) {
					maximo = tablita [i][j];
					cont = (i);
					dia = (j);
				}
				
				else if (tablita[i][j]<min) {
					min = tablita[i][j];
					contmin= (i);
					diamin=(j);
					
				}
				

			}
			
		}
		System.out.println("");
		System.out.println("______________________________________________________ ");
		System.out.println("la maxima venta fue del empleado "+persona[cont]+" en el dia "+dias[dia]+" con un costo de "+maximo+"$");
		System.out.println("la minima venta fue del empleado "+persona[contmin]+" en el dia "+ dias[diamin] +" con un costo de "+min+"$");

		
		
	}

}
