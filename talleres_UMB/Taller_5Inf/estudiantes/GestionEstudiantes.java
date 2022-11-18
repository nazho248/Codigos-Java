package estudiantes;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map.Entry;

public class GestionEstudiantes {
    /*
    * Crear una clase Estudiantes con los siguientes atributos: nombres, apellidos, dirección,
teléfono, carrera.
B.	Crear una clase GestionEstudiantes donde incluya un HashMap un código para el estudiante y
la clase Estudiantes.
Debe existir un menú de gestión donde cree el estudiante y lo asigne al HashMap y utilizar métodos para
 lo siguiente:
•	Inserta información.
•	Consultar información,
•	Modificar información
•	Borrar información.
•	Notas: las operaciones se deben realizar en el HashMap
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Estudiante> estudiantes = new HashMap<>();
        //insertar estudiantes generados
        Estudiante estudiante1 = new Estudiante("Juan", "Perez   ", "Calle 1", 123456, "Ingenieria Civil");
        Estudiante estudiante2 = new Estudiante("Maria","Gomez    ", "Calle 2", 123456, "Medicina");
        Estudiante estudiante3 = new Estudiante("Pedro", "Gonzalez", "Carrera 3", 123456, "Psicologia");
        estudiantes.put(1, estudiante1);
        estudiantes.put(2, estudiante2);
        estudiantes.put(3, estudiante3);

        int opcion = 0;
        do {
            //saltos de linea
            System.out.println("\n\n--------------------------------");
            System.out.println("Menu de opciones");
            System.out.println("1. Insertar informacion");
            System.out.println("2. Consultar informacion");
            System.out.println("3. Modificar informacion");
            System.out.println("4. Borrar informacion");
            System.out.println("5. Imprimir todos los estudiantes");
            System.out.println("6. Salir");
            System.out.print("-> ");
            opcion = sc.nextInt();
            System.out.println("--------------------------------\n\n");
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el codigo del estudiante");
                    System.out.print("-> ");
                    int codigo = sc.nextInt();
                    System.out.println("Ingrese el nombre del estudiante");
                    System.out.print("-> ");
                    String nombre = sc.next();
                    System.out.println("Ingrese el apellido del estudiante");
                    System.out.print("-> ");
                    String apellido = sc.next();
                    System.out.println("Ingrese la direccion del estudiante");
                    System.out.print("-> ");
                    String direccion = sc.next();
                    System.out.println("Ingrese el telefono del estudiante");
                    System.out.print("-> ");
                    int telefono = sc.nextInt();
                    System.out.println("Ingrese la carrera del estudiante");
                    System.out.print("-> ");
                    String carrera = sc.next();
                    Estudiante estudiante = new Estudiante(nombre, apellido, direccion, telefono, carrera);
                    estudiantes.put(codigo, estudiante);
                    break;
                case 2:
                    System.out.println("Ingrese el codigo del estudiante");
                    System.out.print("-> ");
                    codigo = sc.nextInt();
                    estudiante = estudiantes.get(codigo);
                    System.out.println("Nombre: " + estudiante.getNombres());
                    System.out.println("Apellido: " + estudiante.getApellidos());
                    System.out.println("Direccion: " + estudiante.getDireccion());
                    System.out.println("Telefono: " + estudiante.getTelefono());
                    System.out.println("Carrera: " + estudiante.getCarrera());
                    break;
                case 3:
                    System.out.println("Ingrese el codigo del estudiante");
                    System.out.print("-> ");
                    codigo = sc.nextInt();
                    estudiante = estudiantes.get(codigo);
                    System.out.println("Ingrese el nombre del estudiante");
                    System.out.print("-> ");
                    nombre = sc.next();
                    System.out.println("Ingrese el apellido del estudiante");
                    System.out.print("-> ");
                    apellido = sc.next();
                    System.out.println("Ingrese la direccion del estudiante");
                    System.out.print("-> ");
                    direccion = sc.next();
                    System.out.println("Ingrese el telefono del estudiante");
                    System.out.print("-> ");
                    telefono = sc.nextInt();
                    System.out.println("Ingrese la carrera del estudiante");
                    System.out.print("-> ");
                    carrera = sc.next();
                    estudiante = new Estudiante(nombre, apellido, direccion, telefono, carrera);
                    estudiantes.put(codigo, estudiante);
                    break;
                case 4:
                    System.out.println("Ingrese el codigo del estudiante");
                    System.out.print("-> ");
                    codigo = sc.nextInt();
                    estudiantes.remove(codigo);
                    break;
                case 5:
                    for (Entry<Integer, Estudiante> entry : estudiantes.entrySet()) {
                        System.out.println("Codigo: " + entry.getKey());
                        System.out.println("Nombre: " + entry.getValue().getNombres());
                        System.out.println("Apellido: " + entry.getValue().getApellidos());
                        System.out.println("Direccion: " + entry.getValue().getDireccion());
                        System.out.println("Telefono: " + entry.getValue().getTelefono());
                        System.out.println("Carrera: " + entry.getValue().getCarrera());
                        System.out.println("--------------------------------");
                    }
                    break;
                case 6:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 6);
    }
}
