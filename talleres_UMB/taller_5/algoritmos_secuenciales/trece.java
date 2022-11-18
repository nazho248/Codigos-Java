package algoritmos_secuenciales;
import  java.util.Scanner ;

public class trece {

    public static void main (String[] args){
        /*
        13.	Un estudiante desea saber cuál será su promedio general en las tres materias más difíciles que cursa
         y cuál será el promedio que obtendrá en cada una de ellas. Estas materias se evalúan como se muestra a continuación:
            	La calificación de Matemáticas se obtiene de la sig. Manera:
            •	Examen 90%
            •	Promedio de tareas 10%
            •	En esta materia se pidió un total de tres tareas.
            	La calificación de Física se obtiene de la sig. Manera:
            •	Examen 80%
            •	Promedio de tareas 20%
            •	En esta materia se pidió un total de dos tareas.
            	La calificación de Química se obtiene de la sig. Manera:
            •	Examen 85%
            •	Promedio de tareas 15%
            •	En esta materia se pidió un promedio de tres tareas.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al programa de calculo de promedios");
        System.out.println("Ingrese la nota del examen de matematicas");
        double examenMatematicas = sc.nextDouble();
        System.out.println("Ingrese la nota de la tarea 1 de matematicas");
        double tarea1Matematicas = sc.nextDouble();
        System.out.println("Ingrese la nota de la tarea 2 de matematicas");
        double tarea2Matematicas = sc.nextDouble();
        System.out.println("Ingrese la nota de la tarea 3 de matematicas");
        double tarea3Matematicas = sc.nextDouble();
        double promedioTareasMatematicas = (tarea1Matematicas + tarea2Matematicas + tarea3Matematicas) / 3;
        double promedioMatematicas = (examenMatematicas * 0.9) + (promedioTareasMatematicas * 0.1);
        System.out.println("El promedio de matematicas es: " + promedioMatematicas);
        System.out.println("Ingrese la nota del examen de fisica");
        double examenFisica = sc.nextDouble();
        System.out.println("Ingrese la nota de la tarea 1 de fisica");
        double tarea1Fisica = sc.nextDouble();
        System.out.println("Ingrese la nota de la tarea 2 de fisica");
        double tarea2Fisica = sc.nextDouble();
        double promedioTareasFisica = (tarea1Fisica + tarea2Fisica) / 2;
        double promedioFisica = (examenFisica * 0.8) + (promedioTareasFisica * 0.2);
        System.out.println("El promedio de fisica es: " + promedioFisica);
        System.out.println("Ingrese la nota del examen de quimica");
        double examenQuimica = sc.nextDouble();
        System.out.println("Ingrese la nota de la tarea 1 de quimica");
        double tarea1Quimica = sc.nextDouble();
        System.out.println("Ingrese la nota de la tarea 2 de quimica");
        double tarea2Quimica = sc.nextDouble();
        System.out.println("Ingrese la nota de la tarea 3 de quimica");
        double tarea3Quimica = sc.nextDouble();
        double promedioTareasQuimica = (tarea1Quimica + tarea2Quimica + tarea3Quimica) / 3;
        double promedioQuimica = (examenQuimica * 0.85) + (promedioTareasQuimica * 0.15);
        System.out.println("El promedio de quimica es: " + promedioQuimica);
        double promedioGeneral = (promedioMatematicas + promedioFisica + promedioQuimica) / 3;
        System.out.println("El promedio general es: " + promedioGeneral);



    }
}
