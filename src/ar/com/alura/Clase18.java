
package ar.com.alura;

import ar.com.alura.model.*;
import java.util.Optional;

public class Clase18 {

    public static void main(String[] args) {

        Curso curso1 = new Curso("Historia",30) ;

        Alumno alumno1 = new Alumno("Luis Miguel", "001");
        Alumno alumno2 = new Alumno("Pepito los palotes", "002");
        Alumno alumno3 = new Alumno("Juan Carlos", "003");
        Alumno alumno4 = new Alumno("Pedro Pedrito", "004");
        Alumno alumno5 = new Alumno("Gustavo Sanchez", "005");
        Alumno alumno6 = new Alumno("Marcia Maria", "006");
        Alumno alumno7 = new Alumno("Claudia Patricia", "007");

        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);
        curso1.addAlumno(alumno7);

        //creamos un objeto de la clase Optional que devuelve un opcional de alumno en donde se comprueba de si existe o no el codigo "003"
        Optional<Alumno> alumno = curso1.getAlumnos().stream().filter(a -> "03".equalsIgnoreCase(a.getCodigo())).findFirst(); //.findFirst devuelve el primer onjeto encontrado

        if(alumno.isPresent()){ //si el alumno está presente se imprime ese alumno
            System.out.println(alumno.get()); // si no utilizamos el isPresent y el objeto buscado no se encuentra obtenemos un: java.util.NoSuchElementException
        }

        Alumno alumnoMap = curso1.getAlumnoMap().get("003"); //obtenemos al alumno que tiene el codigo "003" de manera mas sencilla

        System.out.println(alumnoMap);

    }
}
