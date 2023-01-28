
package ar.com.alura;

import ar.com.alura.model.*;
import java.util.ArrayList;
import java.util.List;

public class Clase7 {

    public static void main(String[] args) {

        Curso curso1 = new Curso("Java",30) ;
        curso1.addAula(new Aula("ArrayList"));
        curso1.addAula(new Aula("List"));
        curso1.addAula(new Aula("LinkedList"));
        curso1.addAula(new Aula("Inmutable"));

        List<Aula> aulaList = curso1.getAulaList();


        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);//solo se puede agregar el curso
        
        //aulaList.add(new Aula("Inmutable")); //no así cada aula de esta manera, solo con el metodo addAula
        //si lo dejamos así arrojaría un UnsupportedOperationException.

        System.out.println(aulaList);
    }
}
