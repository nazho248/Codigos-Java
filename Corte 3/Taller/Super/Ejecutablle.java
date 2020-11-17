package Super;
import java.util.Scanner;
import java.util.ArrayList;

public class Ejecutablle {
	
	
	public static void main(String[] args) {
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		ArrayList<Factura>facturas=  new ArrayList<Factura>();
		Scanner sc = new Scanner(System.in);
		int opcion = 0, cont=0;
		
		
	
		do {
		System.out.println("Bienvenido al Super, que opcion deseas realizar ");
		System.out.println("1-Registrar compra");
		System.out.println("2-imprimir lista de compras registradas");
		System.out.println("3-Escoger cliente al azar");
		System.out.println("4- Finalizar programa");
		System.out.println("Digite la opcion");
		
		opcion = sc.nextInt();
		
		
		switch (opcion) {
		case 1:
			cont++;
			System.out.println("Registrando cliente");
			Cliente cliente = new Cliente();
			Factura factura = new Factura();
			System.out.println("Digite su nombre ");
			cliente.setNombre(sc.next());
			System.out.println("Digite el monto de la compra");
			factura.setPrecio(sc.nextInt());
			cliente.setNumerocliente(cont);
			factura.setNumerofactura((cont-1));
			factura.setCliente(cliente);
			clientes.add(cliente);
			facturas.add(factura);
			
			break;
		case 2:
			System.out.println("Imprimir facturas");
			for (Factura tirilla : facturas) {
				System.out.println(tirilla.toString());
			}
			
			break;
		case 3:
			System.out.println("Elegir cliente al azar");
			
			int aleatorio = (int) Math.floor(Math.random()*((cont-1)-(0)+1)+(0)); 
			System.out.println(clientes.get(aleatorio).toString());
			
			break;

		default:
			System.out.println("Digite una opcion valida");
			break;
		}
				
		} while (opcion!=4);

	}
}
