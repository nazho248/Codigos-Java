import java.util.Scanner;

public class DesigualdadTriangulas {
	/*
	 * 3. Los tres lados a, b y c de un triángulo deben satisfacer la desigualdad triangular: cada uno de los
lados no puede ser más largo que la suma de los otros dos.
Escriba un programa que reciba como entrada los tres lados de un triángulo, e indique:
• si acaso el triángulo es inválido; y
• si no lo es, qué tipo de triángulo es.
a+b > c 
b+c >a
c+a>b
	 * */
	
	static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	
	int a =0, b=0,c=0, veri=0;
	System.out.println("Bienvenido al calculador de desigualdades de triangulos.");
	System.out.println("Por favor introduce los lados del triangulo ");
	a= scanner("Introduce lado A: ", 99999, 1);
	b= scanner("Introduce lado B: ", 99999, 1);
	c=scanner("Introduce lado C: ", 99999, 1);

	//verificacion de los lados del triangulo
	veri = verificador(a,b,c)+veri;
	//System.out.print(veri);
	veri = verificador(b,c,a)+veri;
	//System.out.print(veri);
	veri= verificador(c,a,b)+veri;
	//System.out.print(veri);
	if (veri==0) {
		System.out.print("El triangulo de lados "+a+", "+b+", "+c+" es un triangulo ");
		
		//que triangulo es? :3 
		
		if (a==b) {
			if (b==c) {
				System.out.print("equilatero"); //3 lados iguales
			} else {
				System.out.print("isoceles");//2 lados iguales
			}
		} 
		else {
			System.out.print("escaleno");// sin lados iguales
		}
	}
	else {
		System.out.println("Triangulo insertado invalido");
	}
}//f


/* SCANNER DE TECLADO 2.0 con verificacion  INT :)*------------------------------------------------------------------------------------------------------------*/
//scanner
public static int scanner ( String x,int max,int min ){	
	int variable = 0;
	do {
		System.out.print(x);
		variable = sc.nextInt();
		if ((variable<min)||(variable>max)) {
			System.out.println("Dato invalido");
		}
	} while (variable <min);
	return variable;
}
/* FIN SCANNER DE TECLADO-------------------------------------------------------------------------------------------------------------*/	

public static int verificador(int x,int y, int z) {
	int suma = x+y, xd=1;
	if (suma >z) {
	xd=0;
	}
	return  xd;
}
	
}
