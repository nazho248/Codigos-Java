package sept29;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		
		int existenciasVA[]= new int [10];
		int pedidosVB[]= new int[10];
		int requeridoVC[]= new int[10];
		
		for (int i = 0; i < pedidosVB.length; i++) {
			existenciasVA[i] = ( int) Math.floor(Math.random()* (100-(0)+1)+(0));
			pedidosVB[i] = ( int) Math.floor(Math.random()* (100-(0)+1)+(0));
		}
		
		for (int i = 0; i < requeridoVC.length; i++) {
			if ( existenciasVA[i]== pedidosVB[i]) {
				requeridoVC[i]= existenciasVA[i];
			}
			else {
				if(pedidosVB[i] >existenciasVA[i]) {
					requeridoVC[i]= (pedidosVB[i]-existenciasVA[i])*2;
				}
				else {
					requeridoVC[i] = pedidosVB[i];
				}
			}
			
		}
		
		System.out.println("ExistenciasVA");		
		for (int i = 0; i < existenciasVA.length; i++) {

			System.out.print(existenciasVA[i]+ " ");
		}
		System.out.println(" ");
		System.out.println("PedidosVB");
		
		for (int i = 0; i < pedidosVB.length; i++) {
			System.out.print(pedidosVB[i]+ " ");
		}
		System.out.println(" ");
		System.out.println("RequeridoVC");
		
		for (int i = 0; i < requeridoVC.length; i++) {
			System.out.print(requeridoVC[i]+ " ");
		}
	}

}
