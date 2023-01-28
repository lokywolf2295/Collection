package ar.com.alura;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;

public class Clase13 {

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

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);
        listaAlumnos.add(alumno8);

        boolean valida = listaAlumnos.contains("Pedro Pedrito"); //contains devuelve un booleano si el elemento pasado por parametro se encuentra o no en la lista
        System.out.println(valida); //mostramos si se encuentra o no el valor
        
        //comparamos todos los elementos por su largo de letras
        String max = listaAlumnos.stream().max(Comparator.comparingInt(String::length)).get(); 
        System.out.println(max.length()); //mostramos el largo del nombre con mas letras

        listaAlumnos.removeIf(alumno -> "Pedro Pedrito".equalsIgnoreCase(alumno)); //comprobamos si en la lista está el alumno "Pedro Pedrito" y lo eliminamos

        listaAlumnos.forEach(alumno -> {
            System.out.println(alumno); //luego recorremos la lista y vemos que ya no está
        });
    }
}
