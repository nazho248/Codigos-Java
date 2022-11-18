package main;
//libreria para tiempo
import java.util.concurrent.TimeUnit;
//libreria para entrada de datos
import java.util.Scanner;
//libreria para generar numeros aleatorios
import java.util.Random;
//libreria para arraylists
import java.util.ArrayList;
//libreria para colas y pilas
import java.util.LinkedList;


public class Netbeans {

    public static void main(String[] args) {

        /*simulador de colas en un almacen con 2 tipos de servicios: Pago de productos y pago de servicios online*/

        //los datos obtenidos de la tienda durante 83 minutos son los siguientes:

        //arraylist con datos de la siguiente forma [ [tiempo de llegada, tiempo de salida, tiempo de servicio] ]

        //Variable aleatoria
        Random r = new Random();

        // CONFIGURACION DE LA SIMULACION
        //1 minuto = 1 segundo
        int velocidad = 5;
        //tiempo de simulacion (8 horas) 480 minutos
        int tiempo = 20;
        // clientes cada periodo
        int clientes = 5;
        //periodo de tiempo (mins)
        int periodo = 20;
        //tiempo max servicio
        int maxServicio = 5;
        //tiempo min servicio
        int minServicio = 2;
        //probabilidad convirtiendo clientes a float y periodo a float para que de decimal
        final  float probabilidad = (float)clientes/(float)periodo; //es una constante por que no cambia a lo largo del programa y no debe cambiar
        // FIN CONFIGURACION DE LA SIMULACION


        //variables de control
        int tiempoActual = 0;
        int clientesAtendidos = 0;
    
        
        //cola de clientes array int guardando tiempo de llegada y tiempo de servicio
        LinkedList<int[]> cola = new LinkedList<int[]>();

        //arrylist con array de 4 posiciones [tiempo de llegada, tiempo de servicio, tiempo de salida
        ArrayList<int[]> clientesAtendidosArray = new ArrayList<int[]>();

        //variables para guardar datos de cliente
        int tiempoServicio = 0; //se guarda el tiempo de servicio del cliente

        //VARIABLES DE DEPURACION Y VISTA
        boolean depurar = false; //para depurar el programa
        boolean imprimircadamin = false; //para imprimir cada minuto
        for (int i = 0; i < tiempo; i++) {

            //Funcion imprimir reloj
            tiempo(tiempoActual);

            //generar un numero aleatorio entre 0 y 1, si es menor a la probabilidad de que llegue un cliente se agrega a la cola
            float random = r.nextFloat();
            if (random < probabilidad) {
                //agrego un cliente a la cola, guardando su tiempo de llegada y tiempo de servicio
                cola.add(new int[]{tiempoActual, r.nextInt(maxServicio-minServicio)+minServicio});
            }

            //imprimir la cola
            System.out.print("Cola: ");
            //imprimir clientes con un +
            if( depurar){
                for (int j = 0; j < cola.size(); j++) {
                    System.out.println();
                    System.out.println("+, tiempo de servicio: " + cola.get(j)[1]+" tiempo de llegada: "+cola.get(j)[0]);
                }
            }else{
                //imprimir clientes con un +
                for (int j = 0; j < cola.size(); j++) {
                    System.out.print("+");
                }
                System.out.println();
            }



            //si hay clientes en la cola
            if (cola.size() > 0) {
                //se le resta 1 al tiempo de servicio del primer cliente
                tiempoServicio = cola.get(0)[1];
                tiempoServicio --;

                //si el tiempo de servicio es menor a 0 se elimina el cliente de la cola
                if  (tiempoServicio <= 0) {
                    //se agrega el cliente a la lista de clientes atendidos
                    clientesAtendidosArray.add(new int[]{cola.get(0)[0], cola.get(0)[1], tiempoActual});
                    //se elimina el cliente de la cola
                    cola.remove(0);
                    if (depurar) {
                        System.out.println("Cliente atendido");
                    }
                    //se aumenta el numero de clientes atendidos
                    clientesAtendidos++;
                }
                //si el tiempo de servicio es mayor a 0 se actualiza el tiempo de servicio del cliente
                else {
                    cola.get(0)[1] = tiempoServicio;
                }
            }

            //duermo el programa y agrego 1 unidad de tiempo
            
            if ( tiempoActual%velocidad == 0 && i%velocidad == 0) {
                dormir(1);
            }
            tiempoActual++;
        }

        //imprimir datos de clientes atendidos

        System.out.println("\n\n\n-------------------------");
        System.out.println("Clientes atendidos: " + clientesAtendidos);


        //arrylist con array de 3 posiciones [tiempo de llegada, tiempo de servicio, tiempo de salida]

        //imprimir datos de clientes atendidos de forma formateada

        System.out.println("\n-------------------------");
        for (int i = 0; i < clientesAtendidosArray.size(); i++) {
            System.out.println("Cliente: " + i);
            System.out.println("Tiempo de llegada: " + clientesAtendidosArray.get(i)[0]);
            System.out.println("Tiempo de servicio: " + clientesAtendidosArray.get(i)[1]);
            System.out.println("Tiempo de salida: " + clientesAtendidosArray.get(i)[2]);
            if (i-1 >=0){
                int tiempocola = (clientesAtendidosArray.get(i-1)[2] - clientesAtendidosArray.get(i)[0]);
                if (tiempocola < 0){
                    tiempocola = 0
                    		;
                }
                System.out.println("Tiempo en cola: " + tiempocola);
            }
            System.out.println();
        }



    }


    public static void tiempo(int tiempototal){

        int minutos= tiempototal;
        int horas = 0;

        //convertir el tiempo total a minutos y horas
        while (minutos >= 60){
            minutos = minutos - 60;
            horas++;
        }

        System.out.println("----------------------");
        //imprimir de la forma HH:MM
        if (minutos < 10) {
            System.out.println("Tiempo: " + horas + ":0" + minutos);
        } else {
            System.out.println("Tiempo: " + horas + ":" + minutos);
        }

    }

    public static void dormir(int segundos){
        try {
            TimeUnit.SECONDS.sleep(segundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
