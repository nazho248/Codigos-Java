package main;
//libreria para tiempo

import java.util.concurrent.TimeUnit;
//libreria para entrada de datos
import java.util.Scanner;
//libreria para generar numeros aleatorios
import java.util.Random;
//libreria para arraylist
import java.util.ArrayList;
//libreria para colas y pilas
import java.util.LinkedList;


public class Consola {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        /*simulador de colas en un almacen con 1 tipo de servicios: Pago de productos */

        //arraylist con datos de la siguiente forma [ [tiempo de llegada, tiempo de salida, tiempo de servicio] ]

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
        final float probabilidad = (float) clientes / (float) periodo; //es una constante por que no cambia a lo largo del programa y no debe cambiar
        // FIN CONFIGURACION DE LA SIMULACION

        //cola de clientes array int guardando tiempo de llegada y tiempo de servicio
        LinkedList<int[]> cola = new LinkedList<int[]>();

        //arrylist con array de 4 posiciones [tiempo de llegada, tiempo de servicio, tiempo de salida
        ArrayList<int[]> clientesAtendidosArray = new ArrayList<int[]>();

        //variables para guardar datos de cliente

        //VARIABLES DE DEPURACION Y VISTA
        boolean depurar = false; //para depurar el programa
        boolean imprimircadamin = true; //para imprimir cada minuto


        int opcion = -1;

        do {
            System.out.println("\n\n----------------------------------------");
            System.out.println("Bienvenido a la simulacion de cola de una caja en almacen de ropa");
            System.out.println("1. Modificar Parámetros");
            System.out.println("2. Iniciar Simulación");
            System.out.println("0. Salir");
            System.out.print("Digita una opcion: ");
            opcion = sc.nextInt();
            System.out.println("----------------------------------------");

            switch (opcion) {
                case 0:
                    System.out.println("Gracias por usar el programa");
                    break;
                case 1:
                    String[] variables = {"la velocidad (min/seg)", "el tiempo de simulacion (mins)", "clientes (clientes/periodo)",
                            "el periodo (mins)", "el Tiempo máximo de servicio(mins)", "el Tiempo mínimo de servicio (mins)",
                            "depurar programa (1. True/ 2. False)", "imprimir cada minuto (1. True/ 2. False)"};
                    int opcionsec = -1;
                    int[] configuracion = new int[2];
                    do {
                        System.out.println("\n\n\n\n******************************************");
                        System.out.println("Configuración de parámetros de la simulación");
                        System.out.println("1. Velocidad de la simulación");
                        System.out.println("2. Tiempo de simulación");
                        System.out.println("3. Clientes por periodo");
                        System.out.println("4. Periodo de tiempo ");
                        System.out.println("5. Tiempo máximo de servicio");
                        System.out.println("6. Tiempo mínimo de servicio");
                        System.out.println("7. Opciones de depuración");
                        System.out.println("0. Volver al menú principal");
                        System.out.print("Digita una opcion: ");
                        opcionsec = sc.nextInt();
                        System.out.println("******************************************\n\n\n\n");

                        switch (opcionsec) {
                            case 0:
                                System.out.println("----Volviendo al menú principal----");
                                break;
                            case 1:
                                System.out.println("Digita la velocidad de la simulación (min/seg): ");
                                velocidad = sc.nextInt();
                                break;
                            case 2:
                                System.out.println("Digita el tiempo de simulación (mins): ");
                                tiempo = sc.nextInt();
                                break;
                            case 3:
                                System.out.println("Digita el número de clientes por periodo: ");
                                clientes = sc.nextInt();
                                break;
                            case 4:
                                System.out.println("Digita el periodo de tiempo (mins): ");
                                periodo = sc.nextInt();
                                break;
                            case 5:
                                System.out.println("Digita el tiempo máximo de servicio (mins): ");
                                maxServicio = sc.nextInt();
                                break;
                            case 6:
                                System.out.println("Digita el tiempo mínimo de servicio (mins): ");
                                minServicio = sc.nextInt();
                                break;
                            case 7:
                                int opcionsecc = -1;
                                do {
                                    System.out.println("******************************************");
                                    System.out.println("Opciones de depuración");
                                    System.out.println("1. Depurar programa");
                                    System.out.println("2. Imprimir cada minuto");
                                    System.out.println("0. Volver al menú principal");
                                    System.out.print("Digita una opcion: ");
                                    opcionsecc = sc.nextInt();
                                    System.out.println("******************************************");
                                    switch (opcionsecc) {
                                        case 1:
                                            System.out.println("Depurar programa (1. True/ 2. False): ");
                                            depurar = sc.nextInt() == 1;
                                            break;
                                        case 2:
                                            System.out.println("Imprimir cada minuto (1. True/ 2. False): ");
                                            imprimircadamin = sc.nextInt() == 1;
                                            break;
                                        case 0:
                                            break;
                                        default:
                                            System.out.println("Opción no válida");
                                            break;
                                    }
                                    break;
                                } while (opcionsec != 0);
                                break;
                        }

                    } while (opcionsec != 0);
                    break;

                case 2:
                    simulacion(tiempo, velocidad, clientes, periodo, maxServicio, minServicio, probabilidad, cola, clientesAtendidosArray, depurar, imprimircadamin);
                    System.out.println("----------------------------------\n\n\nConfiguración de la simulación: ");
                    System.out.println("Velocidad: " + velocidad + " min/seg");
                    System.out.println("Tiempo de simulación: " + tiempo + " mins");
                    System.out.println("Clientes por periodo: " + clientes + " clientes/"+periodo+" mins");
                    System.out.println("Periodo de tiempo: " + periodo + " mins");
                    System.out.println("Tiempo máximo de servicio: " + maxServicio + " mins");
                    System.out.println("Tiempo mínimo de servicio: " + minServicio + " mins");
                    System.out.println("Depurar programa: " + depurar);
                    System.out.println("Imprimir cada minuto: " + imprimircadamin);


            }
        }while(opcion!=0);

    }

    public static void imprimirResultados(ArrayList<int[]> clientesAtendidosArray, int tiempo, int clientesAtendidos) {

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
            if (i - 1 >= 0) {
                int tiempocola = (clientesAtendidosArray.get(i - 1)[2] - clientesAtendidosArray.get(i)[0]);
                if (tiempocola < 0) {
                    tiempocola = 0
                    ;
                }
                System.out.println("Tiempo en cola: " + tiempocola);
            }
            System.out.println();
        }

    }

    public static void simulacion(int tiempo, int velocidad, int clientes, int periodo, int maxServicio, int minServicio, float probabilidad, LinkedList<int[]> cola, ArrayList<int[]> clientesAtendidosArray, boolean depurar, boolean imprimircadamin) {
        //Variable aleatoria

        //arraylist almacenando los tiempos de servicio para cada cliente
        ArrayList<Integer> TiempoServicioClientes = new ArrayList<Integer>();
        //variables de control
        int tiempoActual = 0;
        int clientesAtendidos = 0;
        int tiempoServicio = 0; //se guarda el tiempo de servicio del cliente

        Random r = new Random();
        for (int i = 0; i < tiempo; i++) {

            //Funcion imprimir reloj

            if(tiempoActual%velocidad==0 || imprimircadamin) {
                tiempo(tiempoActual);
            }

            //generar un numero aleatorio entre 0 y 1, si es menor a la probabilidad de que llegue un cliente se agrega a la cola
            float random = r.nextFloat();
            if (random < probabilidad) {
                //agrego un cliente a la cola, guardando su tiempo de llegada y tiempo de servicio
                int tiempoServicioCliente = r.nextInt(maxServicio - minServicio) + minServicio;
                cola.add(new int[]{tiempoActual, tiempoServicioCliente});
                TiempoServicioClientes.add(tiempoServicioCliente);
            }

            //Solo imprime los datos
            if(tiempoActual%velocidad==0 || imprimircadamin) {
                System.out.print("Cola: ");
                //imprimir clientes con un +
                if (depurar) {
                    for (int j = 0; j < cola.size(); j++) {
                        System.out.println();
                        System.out.println("+, tiempo de servicio: " + cola.get(j)[1] + " tiempo de llegada: " + cola.get(j)[0]);
                    }
                } else {
                    //imprimir clientes con un +
                    for (int j = 0; j < cola.size(); j++) {
                        System.out.print("+");
                    }
                    System.out.println();
                }

            }


            //si hay clientes en la cola
            if (cola.size() > 0) {
                //se le resta 1 al tiempo de servicio del primer cliente
                tiempoServicio = cola.get(0)[1];
                tiempoServicio--;

                //si el tiempo de servicio es menor a 0 se elimina el cliente de la cola
                if (tiempoServicio <= 0) {
                    //se agrega el cliente a la lista de clientes atendidos
                    clientesAtendidosArray.add(new int[]{cola.get(0)[0], TiempoServicioClientes.get(0), tiempoActual});
                    //se elimina el cliente de la cola
                    cola.remove(0);
                    //se elimina el tiempo de servicio del cliente
                    TiempoServicioClientes.remove(0);
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

            if (tiempoActual % velocidad == 0 && i % velocidad == 0) {
                dormir(1);
            }
            tiempoActual++;
        }

        //imprimir resultados
        imprimirResultados(clientesAtendidosArray, tiempo, clientesAtendidos);


    }

    public static void tiempo(int tiempototal) {

        int minutos = tiempototal;
        int horas = 0;

        //convertir el tiempo total a minutos y horas
        while (minutos >= 60) {
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

    public static void dormir(int segundos) {
        try {
            TimeUnit.SECONDS.sleep(segundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
