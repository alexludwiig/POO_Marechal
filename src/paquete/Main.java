package paquete;

//Hago los imports que necesito
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creo el Scanner para que el usuario ingrese el nombre por consola
        System.out.println("Ingresa el nombre del estudiante:");
        Scanner sn = new Scanner(System.in);
        String nombre = sn.next();

        //Creo el Scanner para que el usuario ingrese la edad por consola
        System.out.println("Ingresa la edad del estudiante:");
        Scanner se = new Scanner(System.in);
        int edad = se.nextInt();


        //Cierro los scanners que creé
        sn.close();
        se.close();

        /* Creando el objeto estudiante, utilizando el constructor creado en la clase "Estudiante",
         asignando las variables que escaneé previamente */
         Estudiante estudiante = new Estudiante(nombre, edad);

         //Printeo el objeto estudiante utilizando el método toString que se creó en la clase "Estudiante"
         System.out.println(estudiante);
    }
}