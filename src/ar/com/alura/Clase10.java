
package ar.com.alura;

import ar.com.alura.model.Curso;
import java.util.*;
import java.util.stream.Collectors;

public class Clase10 {
    
 public static final List<List<Integer>> listas = new ArrayList<List<Integer>>(){
        {
            add(new LinkedList<>());
            add(new ArrayList<>());
        }
    };

    public static void main(String[] args) {
        Curso curso1 = new Curso("Historia",30) ;
        Curso curso2 = new Curso("Algebra",10) ;
        Curso curso3 = new Curso("Aritmetica",20) ;
        Curso curso4 = new Curso("Geometria",50) ;
        Curso curso5 = new Curso("Fisica",60) ;
        Curso curso6 = new Curso("Quimica",80) ;
        Curso curso7 = new Curso("Quimica",70) ;
        Curso curso8 = new Curso("Fisica",30) ;


        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        cursos.add(curso5);
        cursos.add(curso6);
        cursos.add(curso7);
        cursos.add(curso8);

        
        System.out.println(cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Historia")).mapToInt(Curso::getTiempo).sum());

        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).average().getAsDouble()); //.average -> devuelve el promedio como un "OptionalDouble"; 
        //.getAsDouble -> convierte el OptionalDouble a double

        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt()); //.max -> devuelve el numero maximo; .getAsInt -> -> convierte el OptionalInt a int

        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).min().getAsInt()); //.min -> devuelve el numero minimo

        Map<String, List<Curso>> groupCurso = cursos.stream().collect(Collectors.groupingBy(Curso::getNombre)); //genera un map de la lista Curso que almacena todos los nombres de los cursos

        groupCurso.forEach((key , value) -> System.out.println(key + " - " + value.size())); //recorre la lista e imprime la llave (key) y la cantidad de veces que aparece su valor (value.size)

        System.out.println(cursos.parallelStream().mapToInt(Curso::getTiempo).sum());
        //.parallelStream -> genera un stream que separa en threads
        
        //??Para qu?? opci??n utilizar parallelStream y para cu??l no? 
        //Al tener cuatro threads, puede ser que el n??mero m??ximo ??l tenga como 50, porque ese fue el ??ltimo stream que obtuvo, y no 60, ah?? podemos hacer un error. 
        //Igual con el m??nimo. Si queremos un filtro con geometr??a o aritm??tica, va a ser m??s r??pido, porque ??l va a separar en cuatro threads, 
        //como que va a dividir en cuatro bloques nuestra lista y va a procurar aritm??tica mucho m??s r??pido.
        // La b??squeda ser?? mejor. Eso tambi??n tiene un recurso del CPU, el curso de los cores del servidor, para eso tambi??n es bueno saber en qu?? situaciones utilizarlo. 
        //Para eso tambi??n se tienen que hacer pruebas de tiempo y de performance. 

    }
}
