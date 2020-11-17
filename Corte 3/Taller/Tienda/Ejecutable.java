package Tienda;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;


public class Ejecutable {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

		int opcion =0;
		int idpedido=0;
		int cont=0;
		
		do {
			System.out.println("Digite la opcion a realizar ");
			System.out.println("1. Crear clientes");
			System.out.println("2. Crear pedido normal");
			System.out.println("3. Crear pedido especial");
			System.out.println("4. Marcar orden como recibida");
			System.out.println("5. Listar clientes");
			System.out.println("6. Listar ordenes");
			System.out.println("0. TERMINAR");
			opcion = sc.nextInt();
			
			switch (opcion) {
			 case 0:
				 System.out.println("Fin del programa");
				break;
				
			 case 1:
				 cont++;
				 Cliente cliente = new Cliente();
				 System.out.println("Escribe el nombre del cliente");
				 cliente.setNombre(sc.next());
				 cliente.setID(cont);
				 clientes.add(cliente);
				break;
			 case 2:
				 int codigo;
				 idpedido++;
				 PedidoNormal pedidoNormal = new PedidoNormal();
				 pedidoNormal.setId(idpedido);
				 pedidoNormal.setFecha((new Date()).toString());
				for (Cliente  cli : clientes) {
					System.out.println(cli.getID()+" - "+cli.toString());
				}
				System.out.println("Elige el cliente a crear el pedido normal");
				codigo = sc.nextInt();
				for (Cliente  cli : clientes) {
					if (cli.getID()==codigo) {
						pedidoNormal.setCliente(cli);
						break;
					}
				}
				pedidos.add(pedidoNormal);
				
				break;
			 case 3:
				 int codigox=0;
				 idpedido++;
				 PedidoEspecial pedidoEspecial = new PedidoEspecial();
				 pedidoEspecial.setId(idpedido);
				 System.out.println("Digite el origen del pedido especial");
				 pedidoEspecial.setOrigen(sc.next());
				 System.out.println("El pedido, ¿es organico? 1 para si, 0 para no");
				 int organico=sc.nextInt();
				 if (organico ==1) {
					boolean organicbool = true;
					pedidoEspecial.setMaterialOrganico(organicbool);
				}
				 else {
					pedidoEspecial.setMaterialOrganico(false);
				}
				 
				 pedidoEspecial.setFecha((new Date()).toString());
				for (Cliente  cli : clientes) {
					System.out.println(cli.getID()+" - "+cli.toString());
				}
				System.out.println("Elige el id del cliente para crear la orden especial");
				codigox = sc.nextInt();
				for (Cliente  cli : clientes) {
					if (cli.getID()==codigox) {
						pedidoEspecial.setCliente(cli);
						break;
					}
				}
				pedidos.add(pedidoEspecial);
				
				break;
			 case 4:
				 int entregado=0;
				 for (Pedido pedido : pedidos) {
					 System.out.println(pedido.getId()+"-"+pedido.toString());					
				}
				 System.out.println("Elige el id para marcar como entregado");
				 entregado = sc.nextInt();
				 for (Pedido pedido : pedidos) {
					 if (pedido.getId()==entregado) {
						 pedido.setEnviado(true);
						break;
					}
					
				}
				
				break;
			 case 5:
				 for (Cliente  cli : clientes) {
					System.out.println( cli.toString());
					
				}
				
				break;
			 case 6:
				 for (Pedido pedido : pedidos) {
					 System.out.println(pedido.toString());
					
				}
				
				break;

			default:
				System.out.println("opcion invalida");
				break;
			}
		} while (opcion!=0);
		

		}

}
