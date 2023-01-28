package ar.com.alura;

import java.util.HashSet;
import java.util.Set;

public class Clase11 {

    // TODO: https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
    // TODO: https://docs.oracle.com/javase/8/docs/api/index.html?java/util/Collection.html
    public static void main(String[] args) {

        String alumno1 = "Luis Miguel";
        String alumno2 = "Pepito los palotes";
        String alumno3 = "Juan Carlos";
        String alumno4 = "Pedro Pedrito";
        String alumno5 = "Gustavo Sanchez";
        String alumno6 = "Marcia Maria";

        Set<String> listaAlumnos = new HashSet<>(); //creo un HashSet de la clase set que almacena la lista de alumnos

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);

        for (String alumno : listaAlumnos) {
            System.out.println(alumno); //al imprimirse la lista esta no tiene el orden en la que se los agregó 
            //sinó que están de manera aleatoria segun los vaya encontrando en la lista
        }
    }
}