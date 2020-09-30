package sept29;
import java.util.Scanner;

public class ejercicio4{
 
public static void main (String[] args) {

 Scanner sc = new Scanner(System.in);

  System.out.println("Digite el tamaño de la matriz");

    int tamano=sc.nextInt();

   int matriz [][]=new int [tamano][tamano];

    //llenar de numeros aleatorios
     
      
     for ( int i=0; i < matriz.length; i++){ 
          for ( int j=0; j<matriz[0].length; j++){
            
           matriz[i][j] = (int) Math.floor(Math.random()*(5-(-5)+1)+(-5));
}
}

    for (int i=0; i < matriz.length; i++){
          for (int j=0; j < matriz[0].length; j++){

             System.out.println(matriz[i][j]);
}

}
   
}
}