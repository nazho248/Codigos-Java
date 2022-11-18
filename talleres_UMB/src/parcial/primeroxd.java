package parcial;

public class primeroxd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros [] = {2,3,1,5,4};
		int i, pos, aux;


		for(i=0; i<5; i++){
			pos = i;
			aux = numeros[i];

			while((pos>0) && (numeros[pos-1]<aux)){
				numeros[pos] = numeros[pos-1];
				pos--;
			}
			numeros[pos] = aux;

		}

					for(int j=0; j<5; j++){
				System.out.print(numeros[j]);
			}
	}




}
