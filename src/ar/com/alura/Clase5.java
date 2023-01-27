
package ar.com.alura;

import ar.com.alura.model.Curso;
import java.util.*;
import java.util.stream.Collectors;

public class Clase5 {

    public static void main(String[] args) {

        //creo 4 objetos de la clase curso
        Curso curso1 = new Curso("PHP",30) ;
        Curso curso2 = new Curso("Ruby",10) ;
        Curso curso3 = new Curso("JavaScript",20) ;
        Curso curso4 = new Curso("Java",50) ;

        //creo una lista y agrego los objetos
        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        //imprimo la lista
        System.out.println(cursos);

        //metodo de ordenamiento
        Collections.sort(cursos,Comparator.comparing(Curso::getNombre));
        System.out.println(cursos);
        
         //metodo de ordenamiento reverso
        Collections.sort(cursos,Comparator.comparing(Curso::getNombre).reversed());
        System.out.println(cursos);
        
        //metodo de ordenamiento utilizando la función lambda
        List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
        System.out.println(cursoList);
    }
}
