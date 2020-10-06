package oct06;

public class ordenamientoburbuja {
	
	public static void main(String[] args) {
		
		int numeros [] = new int [] {1,6,3,2,9};
		int aux;
		for (int i = 0; i < numeros.length; i++) {
			for (int j = i+1; j < numeros.length; j++) {
				
				if (numeros[i]>numeros[j]) {
					
					aux = numeros[i];
					numeros[i]=numeros[j];
					numeros[j]=aux;
						
				}
				
			}
		}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
			
		}
	}

}
