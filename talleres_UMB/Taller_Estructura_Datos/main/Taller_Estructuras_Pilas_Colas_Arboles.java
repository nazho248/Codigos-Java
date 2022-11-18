package main;
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.TreeSet;

public class Taller_Estructuras_Pilas_Colas_Arboles {

    static Scanner sc = new Scanner(System.in);
    static Stack pila = null;
    static LinkedList cola = null;
    static TreeSet arbol = null;

    public static void main(String[] args) {
        // TODO code application logic here



        int opcion = 0;
        do{
            System.out.println("\n\n------------------------------------------");
            System.out.println("Bienvenido al taller de estructuras de datos sobre: Pilas, Colas y Arboles");
            System.out.println("1. Pilas");
            System.out.println("2. Colas");
            System.out.println("3. Arboles");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            System.out.println("------------------------------------------\n\n");
            switch(opcion){
                case 1:
                    menuPilas();
                    break;
                case 2:
                    menuColas();
                    break;
                case 3:
                    menuArboles();
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(opcion != 4);
    }

    public static void menuPilas(){
        int opcion = 0;
        do{
            System.out.println("\n\n------------------------------------------");
            System.out.println("Menu de pilas");
            System.out.println("1. Crear una pila");
            System.out.println("2. Agregar un elemento a la pila");
            System.out.println("3. Eliminar un elemento de la pila");
            System.out.println("4. Mostrar el elemento superior de la pila");
            System.out.println("5. Mostrar el tamaño de la pila");
            System.out.println("6. Mostrar si la pila esta vacia");
            System.out.println("7. Mostrar los elementos de la pila");
            System.out.println("8. Salir");
            System.out.print("Ingrese una opcion: ");
            System.out.println("------------------------------------------\n\n");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    crearPila();
                    break;
                case 2:
                    agregarElementoPila();
                    break;
                case 3:
                    eliminarElementoPila();
                    break;
                case 4:
                    mostrarElementoSuperiorPila();
                    break;
                case 5:
                    mostrarTamanioPila();
                    break;
                case 6:
                    mostrarSiPilaVacia();
                    break;
                case 7:
                    mostrarElementosPila();
                    break;
                case 8:
                    System.out.println("Regresando al menu principal");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(opcion != 8);
    }

    public static void menuColas(){
        int opcion = 0;
        do{
            System.out.println("\n\n------------------------------------------");
            System.out.println("Menu de colas");
            System.out.println("1. Crear una cola");
            System.out.println("2. Agregar un elemento a la cola");
            System.out.println("3. Eliminar un elemento de la cola");
            System.out.println("4. Mostrar el elemento superior de la cola");
            System.out.println("5. Mostrar el tamaño de la cola");
            System.out.println("6. Mostrar si la cola esta vacia");
            System.out.println("7. Mostrar los elementos de la cola");
            System.out.println("8. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            System.out.println("------------------------------------------\n\n");
            switch(opcion){
                case 1:
                    crearCola();
                    break;
                case 2:
                    agregarElementoCola();
                    break;
                case 3:
                    eliminarElementoCola();
                    break;
                case 4:
                    mostrarElementoSuperiorCola();
                    break;
                case 5:
                    mostrarTamanioCola();
                    break;
                case 6:
                    mostrarSiColaVacia();
                    break;
                case 7:
                    mostrarElementosCola();
                    break;
                case 8:
                    System.out.println("Regresando al menu principal");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(opcion != 8);
    }

    public static void menuArboles(){
        int opcion = 0;
        do{
            System.out.println("\n\n------------------------------------------");
            System.out.println("Menu de Arboles");
            System.out.println("1. Crear un arbol");
            System.out.println("2. Agregar un elemento al arbol");
            System.out.println("3. Eliminar un elemento del arbol");
            System.out.println("4. Mostrar el tamaño del arbol");
            System.out.println("5. Mostrar si el arbol esta vacio");
            System.out.println("6. Mostrar los elementos del arbol");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            System.out.println("------------------------------------------\n\n");
            switch(opcion){
                case 1:
                    crearArbol();
                    break;
                case 2:
                    agregarElementoArbol();
                    break;
                case 3:
                    eliminarElementoArbol();
                    break;
                case 4:
                    mostrarTamanioArbol();
                    break;
                case 5:
                    mostrarSiArbolVacio();
                    break;
                case 6:
                    mostrarElementosArbol();
                    break;
                case 7:
                    System.out.println("Regresando al menu principal");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(opcion != 7);
    }

    public static void crearPila(){
        pila = new Stack<int[]>();
        System.out.println("Pila creada");
    }

    public static void agregarElementoPila(){
        if(pila == null){
            System.out.println("Primero debe crear una pila");
        }else{
            System.out.print("Ingrese el elemento a agregar: ");
            int elemento = sc.nextInt();
            pila.push(elemento);
            System.out.println("Elemento agregado");
        }
    }

    public static void eliminarElementoPila(){
        if(pila == null){
            System.out.println("Primero debe crear una pila");
        }else{
            pila.pop();
            System.out.println("Elemento eliminado");
        }
    }

    public static void mostrarElementoSuperiorPila(){
        if(pila == null){
            System.out.println("Primero debe crear una pila");
        }else{
            System.out.println("El elemento superior es: " + pila.peek());
        }
    }

    public static void mostrarTamanioPila(){
        if(pila == null){
            System.out.println("Primero debe crear una pila");
        }else{
            System.out.println("El tamaño de la pila es: " + pila.size());
        }
    }

    public static void mostrarSiPilaVacia(){
        if(pila == null){
            System.out.println("Primero debe crear una pila");
        }else{
            if(pila.isEmpty()){
                System.out.println("La pila esta vacia");
            }else{
                System.out.println("La pila no esta vacia");
            }
        }
    }


    public static void mostrarElementosPila(){
        if(pila == null){
            System.out.println("Primero debe crear una pila");
        }else{
            System.out.println("Los elementos de la pila son: " + pila.toString());
        }
    }

    public static void crearCola(){
        cola = new LinkedList<int[]>();
        System.out.println("Cola creada");
    }

    public static void agregarElementoCola(){
        if(cola == null){
            System.out.println("Primero debe crear una cola");
        }else{
            System.out.print("Ingrese el elemento a agregar: ");
            int elemento = sc.nextInt();
            cola.add(elemento);
            System.out.println("Elemento agregado");
        }
    }

    public static void eliminarElementoCola(){
        if(cola == null){
            System.out.println("Primero debe crear una cola");
        }else{
            cola.remove();
            System.out.println("Elemento eliminado");
        }
    }

    public static void mostrarElementoSuperiorCola(){
        if(cola == null){
            System.out.println("Primero debe crear una cola");
        }else{
            System.out.println("El elemento superior es: " + cola.peek());
        }
    }

    public static void mostrarTamanioCola(){
        if(cola == null){
            System.out.println("Primero debe crear una cola");
        }else{
            System.out.println("El tamaño de la cola es: " + cola.size());
        }
    }

    public static void mostrarSiColaVacia(){
        if(cola == null){
            System.out.println("Primero debe crear una cola");
        }else{
            if(cola.isEmpty()){
                System.out.println("La cola esta vacia");
            }else{
                System.out.println("La cola no esta vacia");
            }
        }
    }

    public static void mostrarElementosCola(){
        if(cola == null){
            System.out.println("Primero debe crear una cola");
        }else{
            System.out.println("Los elementos de la cola son: " + cola.toString());
        }
    }

    public static void crearArbol(){
        arbol = new TreeSet<int[]>();
        System.out.println("Arbol creado");
    }

    public static void agregarElementoArbol(){
        if(arbol == null){
            System.out.println("Primero debe crear un arbol");
        }else{
            System.out.print("Ingrese el elemento a agregar: ");
            int elemento = sc.nextInt();
            arbol.add(elemento);
            System.out.println("Elemento agregado");
        }
    }

    public static void eliminarElementoArbol(){
        if(arbol == null){
            System.out.println("Primero debe crear un arbol");
        }else{
            System.out.print("Ingrese el elemento a eliminar: ");
            int elemento = sc.nextInt();
            arbol.remove(new int[]{elemento});
            System.out.println("Elemento eliminado");
        }
    }

    public static void mostrarElementoSuperiorArbol(){
        if(arbol == null){
            System.out.println("Primero debe crear un arbol");
        }else{
            System.out.println("El elemento superior es: " + arbol.first());
        }
    }

    public static void mostrarTamanioArbol(){
        if(arbol == null){
            System.out.println("Primero debe crear un arbol");
        }else{
            System.out.println("El tamaño del arbol es: " + arbol.size());
        }
    }

    public static void mostrarSiArbolVacio(){
        if(arbol == null){
            System.out.println("Primero debe crear un arbol");
        }else{
            if(arbol.isEmpty()){
            System.out.println("El arbol esta vacio");
            }else{
                System.out.println("El arbol no esta vacio");
            }
        }
    }

    public static void mostrarElementosArbol(){
        if(arbol == null){
            System.out.println("Primero debe crear un arbol");
        }else{
            System.out.println("Los elementos del arbol son: " + arbol.toString());
        }
    }


}
