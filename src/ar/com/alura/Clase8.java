package ar.com.alura;

import java.util.*;

public class Clase8 {

    //creo una lista que permite enteros
    public static final List<List<Integer>> listas = new ArrayList<List<Integer>>() {
        {
            add(new LinkedList<>());//agrego un LinkedLisy y ArrayList
            add(new ArrayList<>());
        }
    };

    public static void main(String[] args) {
        for (List<Integer> lista : listas) { //recorro todos los objetos tipo lista dentro de las listas
            final String nombreImplementacion = lista.getClass().getSimpleName(); //almacenamos si el objeto analizado se trata del Linkedlist o el Arraylist
            //add
            long inicio = System.currentTimeMillis(); //inicia el conteo de tiempo
            for (int i = 0; i < 1000000; i++) {
                lista.add(i); //agrega cada elemento a el linkedlist en la primera ronda y luego al arraylist en la segunda del for padre
            }
            long fin = System.currentTimeMillis(); //finaliza el conteo
            long duracion = fin - inicio; //calcula el tiempo transcurrido
            System.out.println(nombreImplementacion + " add: " + duracion); //imrpime el mensaje informando el nombre de la implementación y el tiempo en que tardó en hacerlo

            //get
            inicio = System.currentTimeMillis();
            for (int i = 0; i < 1000000; i++) {
                lista.get(i); //obtiene cada elemento
            }
            fin = System.currentTimeMillis();
            duracion = fin - inicio;
            System.out.println(nombreImplementacion + " get: " + duracion);

            //remove
            inicio = System.currentTimeMillis();
            for (int i = 999999; i >= 0; i--) {
                lista.remove(i); //elimina cada elemento
            }
            fin = System.currentTimeMillis();
            duracion = fin - inicio;
            System.out.println(nombreImplementacion + " remove: " + duracion);

            //LINKEDLIST  A <-> B1 <-> B2 <-> C <-> D
            /*
                LinkedList add: 99
                LinkedList get: 993093
                LinkedList remove: 18
             */ //representacion grafica del tiempo que tarda cada uno en milisegundos
            
            //ARRAYLIST A -> B1 -> B -> C -> D
            /*
                ArrayList add: 38
                ArrayList get: 12
                ArrayList remove: 17
            *///representacion grafica del tiempo que tarda cada uno en milisegundos
        }

    }
}
