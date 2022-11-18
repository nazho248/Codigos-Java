package cantantesFamosos;
import java.util.Scanner;
import java.util.ArrayList;
public class mainCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		ListaCantantesFamosos CantantesFamososCol = new ListaCantantesFamosos();
		CantantesFamososCol.agregarCantanteFamoso(new CantanteFamoso("Juanes", "La vida es un ratico", 55));
		CantantesFamososCol.agregarCantanteFamoso(new CantanteFamoso("Shakira", "La tortuga", 60));
		CantantesFamososCol.agregarCantanteFamoso(new CantanteFamoso("Maluma", "Felices los 4", 100));
		CantantesFamososCol.agregarCantanteFamoso(new CantanteFamoso("Carlos Vives", "La bicicleta", 120));
		CantantesFamososCol.agregarCantanteFamoso(new CantanteFamoso("J Balvin", "Mi gente",30));
		CantantesFamososCol.agregarCantanteFamoso(new CantanteFamoso("Ozuna", "Dile que tu me quieres",24));
		CantantesFamososCol.agregarCantanteFamoso(new CantanteFamoso("Sebastian Yatra", "Traicionera",20));
		CantantesFamososCol.agregarCantanteFamoso(new CantanteFamoso("Bad Bunny", "Si veo a tu mama",300));
		CantantesFamososCol.agregarCantanteFamoso(new CantanteFamoso("Nicky Jam", "Hasta el amanecer", 150));


		/*

		*insertar un cantante famoso
		* 1. Imprimir la lista de cantantes famosos
		* 2. imprimir la lista de cantantes ordenados por su cantidad de ventas
		* F.Eliminar cantantes
		* G.	Modificar Nombre del cantante
		* H.	Incluir en el menú la posibilidad de generar una lista con los cantantes con más discos vendidos de mayor a menor.

		* */
		
		int opcion = 0;
		do {
			System.out.println("\n\n--------------------------------");
			System.out.println("Menu de navegacion");
			System.out.println("1. Insertar un cantante famoso");
			System.out.println("2. Imprimir la lista de cantantes famosos");
			System.out.println("3. Imprimir la lista de cantantes ordenados por su cantidad de ventas");
			System.out.println("4. Eliminar cantantes");
			System.out.println("5. Salir");
			System.out.println("Introduce una opcion: ");
			System.out.print("-> ");
			 opcion = sc.nextInt();
			System.out.println("--------------------------------\n\n");

			switch (opcion) {
			case 1:
				System.out.println("Introduce el nombre del cantante: ");
				String nombre = sc.next();
				System.out.println("Introduce el nombre del disco: ");
				String disco = sc.next();
				System.out.println("Introduce la cantidad de ventas: ");
				int ventas = sc.nextInt();
				CantantesFamososCol.agregarCantanteFamoso(new CantanteFamoso(nombre, disco, ventas));
				break;
			case 2:
				System.out.println(CantantesFamososCol);
				break;
			case 3:
				//ordenar por ventas e imprimirlos
				ListaCantantesFamosos cantantesOrdenados = CantantesFamososCol.ordenarPorVentas();
				System.out.println(cantantesOrdenados.toString());
				break;
			case 4:
				System.out.println("Introduce la posicion del cantante a eliminar: ");
				int pos = sc.nextInt();
				String NombreCantante;
				try{
					NombreCantante = CantantesFamososCol.get(pos).getNombre();
					CantantesFamososCol.eliminarCantanteFamoso(pos);
					System.out.println("El cantante "+NombreCantante+" ha sido eliminado");
				} catch(Exception e){
					System.out.println("Posicion invalida");
				}
				break;
			case 5:
				System.out.println("Gracias por usar el programa");
				System.exit(0);
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}

		} while (opcion != 5);




	}

}
