package supermercado;
import java.util.ArrayList;
import java.util.Scanner;
public class Supermercadillo {
	
	/*El supermercado “El Súper” requiere un programa para gestionar sus rifas, dicho
programa debe tener un menú con las siguientes opciones: a. Registrar Compra (Nombre
Cliente, Valor Compra, #Factura) b. Imprimir la lista de compras registradas c. Escoger un
cliente al azar como ganador e imprimir sus datos d. Terminar el programa*/
	
	//(int) Math.floor(Math.random()*(max-(min)+1)+(min)); FORMULA numero aleatorio entre maximo y minimo ;3
	
	
	

	
	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>(); 
		ArrayList<Factura> facturas = new ArrayList<Factura>();
		
		Scanner sc = new Scanner(System.in);
		int opcion=1,cont = 0, ganador, max, min=1, opcionsec=0,opciontre=0;
		int  factnum = 77034100;
	
		System.out.println("Bienvenido al Super donde mercar con la familia te puede hacer ganar :)");
		
		do {
			System.out.println("Digite la opcion que desea realizar");
			System.out.print("1. Registrar compra\n"
					+ "2. Imprimir lista compras registradas \n"
					+ "3. Ejecutar Rifa\n"
					+ "0. Terminar el programa\n"
					+ "-> ");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 0:
				System.out.println("Fin del programa");
				
				break;
			case 1:
				Cliente cliente = new Cliente();
				Factura factura = new Factura();
				System.out.println("$$  Registrando compra $$");
				
				if (cont==0) {
					cont++;
					System.out.print("Digite el nombre del cliente: ");
					cliente.setNombre(sc.next());
					cliente.setCont(cont);
					factura.setPersona(cliente);
					clientes.add(cliente);



				} //para la primera iteracion
				
				else {
					do {
					System.out.print("Desea: \n"
							+ "1. Registrar nuevo cliente \n"
							+ "2. Registrar compra con cliente ocasional\n"
							+ "-> ");
					
					opcionsec = sc.nextInt();
					switch (opcionsec) {
					case 1:
						factnum++;
						System.out.println("Registrando nuevo cliente");
						System.out.print("Digite el nombre del cliente: ");
						cliente.setNombre(sc.next());
						cliente.setCont(cont);
						clientes.add(cliente);
						factura.setPersona(cliente);



						cont++;
						break;
					case 2:
						System.out.println(clientes.size());
						
						System.out.println("--Lista de clientes Registrados:");
						for (Cliente clientela : clientes) {
							System.out.print((clientes.lastIndexOf(clientela)+1)+". ");
							System.out.println(clientela.toString());
						}
						do {
							System.out.print("Elige el numero de un cliente: ");
							opciontre = (sc.nextInt());
							
							if (opciontre>clientes.size() || opciontre<=0) {
								System.out.println("Opcion invalida, vuelve a intentarlo");
							}
						} while (opciontre>clientes.size() || opciontre<=0);
						
						factura.setPersona(clientes.get(opciontre-1));
						System.out.println("Cliente elegido: "+clientes.get(opciontre-1));
						break;
					default:
						System.out.println("Opcion invalida, vuelvelo a intentar");
						break;
					}
					} while (opcionsec ==3 );
				}
				//Etapa de precio 
				do {
					System.out.print("Digite el valor de la compra $$ : ");
					factura.setPrecio(sc.nextInt());
				} while (factura.getPrecio()<=0);
				factura.setNumeroFactura((factnum));
				facturas.add(factura);
				
				//-------------------------------------------------------------------------
				
				break;
			case 2:
				System.out.println("Compras Registradas :33");
				for (Factura sd : facturas) {
					System.out.print((facturas.lastIndexOf(sd)+1)+". ");
					System.out.println(sd.toString());
				}
				
				break;
			case 3:
				System.out.println("Imprimiendo ganador de la rifa :O");
				max = cont;
				ganador = (int) Math.floor(Math.random()*(max-(min)+1)+(min));
				System.out.println("El ganador es el cliente #"+ganador+" de "+max+" posiciones");
				System.out.println(clientes.get((ganador-1)));
				
				
				
				break;
				
			default:
				System.out.println("Opcion invalida, por favor vuelve a elegir una opción");
				break;
			}
			System.out.println("-----------------------------------------------------------------");
			
		} while (opcion!=0);
		
		
	}
	
	
}
