package ar.com.alura;

import ar.com.alura.model.Curso;
import java.util.*;

public class Clase9 {

    public static final List<List<Integer>> listas = new ArrayList<List<Integer>>() {
        {
            add(new LinkedList<>());
            add(new ArrayList<>());
        }
    };

    public static void main(String[] args) {
        Curso curso1 = new Curso("Historia", 30);
        Curso curso2 = new Curso("Algebra", 10);
        Curso curso3 = new Curso("Aritmetica", 20);
        Curso curso4 = new Curso("Geometria", 50);

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        //creo un bucle que suma los tiempos, ignorando el curso Historia
        int suma = 0;
        for (Curso curso : cursos) {
            if (!curso.getNombre().equalsIgnoreCase("Historia")) {
                suma += curso.getTiempo();
            }
        }

        System.out.println(suma);

        
        System.out.println(cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Historia")).mapToInt(Curso::getTiempo).sum());
        //cursos.stream() -> crea un stream de cursos 
        //.filter(curso -> !curso.getNombre().equalsIgnoreCase("Historia")) -> filtra entre los nombres buscando el que tena como nombre Historia y lo ignora
        //.mapToInt(Curso::getTiempo) -> recorre todos los enteros obtenidos del getTiempo
        //.sum() suma todos los valores obtenidos
    }
}
