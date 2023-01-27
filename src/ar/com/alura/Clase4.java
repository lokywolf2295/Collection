package ar.com.alura;

import ar.com.alura.model.Curso;
import java.util.ArrayList;

public class Clase4 {

    public static void main(String[] args) {

        //creo 4 objetos de la clase curso
        Curso curso1 = new Curso("Geometria",30) ;
        Curso curso2 = new Curso("Fisica",10) ;
        Curso curso3 = new Curso("Quimica",20) ;
        Curso curso4 = new Curso("Historia",50) ;

        //creo una lista y agrego los objetos
        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        //imprimo la lista
        System.out.println(cursos); //cabe aclarar que si no modifico el metodo toString solo se ve la referencia al espacio en memoria

    }

}
