package oct06;

public class ejercicioarreglo2 {

	public static void main(String[] args) {
		/*Se requiere determinar cuántos ceros se encuentran en un arreglo de cuatro
		renglones y cuatro columnas, las cuales almacenan valores comprendidos
		entre 0 y 9*/
		
		// (int) Math.floor(Math.random()*(9-(0)+1)+(0));
		
		int tablita [][]= new int [4][4];
		int cont = 0 ;
		
		for (int i = 0; i < tablita.length; i++) {
			System.out.println("columna "+ (i+1));
			for (int j = 0; j < tablita.length; j++) {

				tablita[i][j]= (int) Math.floor(Math.random()*(9-(0)+1)+(0));
				System.out.print(j+" = "+ tablita[i][j]);
				System.out.println(" ");
			}
			
		}

		for (int i = 0; i < tablita.length; i++) {

			for (int j = 0; j < tablita.length; j++) {
				if (tablita [i][j] == 0) {
					
					cont = cont+1;
				}
			}
			
		}
		
		System.out.println("hay "+ cont+" ceros en el arreglo");
		

	}

}
