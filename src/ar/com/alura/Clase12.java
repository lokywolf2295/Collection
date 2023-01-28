package ar.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class Clase12 {

    // TODO: https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
    // TODO: https://docs.oracle.com/javase/8/docs/api/index.html?java/util/Collection.html
    public static void main(String[] args) {

        String alumno1 = "Luis Miguel";
        String alumno2 = "Pepito los palotes";
        String alumno3 = "Juan Carlos";
        String alumno4 = "Pedro Pedrito";
        String alumno5 = "Gustavo Sanchez";
        String alumno6 = "Marcia Maria";
        String alumno7 = "Marcia Maria";
        String alumno8 = "Gustavo Sanchez";

        Collection<String> listaAlumnos = new HashSet<>();
        //Utilizamos la clase collection para hacer pruebas de si usaremos losmetodos de las clases set, list o sus demas clases
        //la diferencia entre HashSet y List es que la primera no acepta objetos repetidos, por ello evita duplicacion de datos
        //por otro lado List permite una busqueda de objetos mas eficiente ya que están en un orden y HashSet al no tener orden no se puede acceder a un objeto en concreto

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);
        listaAlumnos.add(alumno8);

        listaAlumnos.forEach(alumno -> {
            System.out.println(alumno); //se imprimen todos los valores menos los repetidos
        });

    }
}
