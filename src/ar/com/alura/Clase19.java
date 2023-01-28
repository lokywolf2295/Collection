
package ar.com.alura;

import ar.com.alura.model.*;
import java.util.Optional;

public class Clase19 {

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

        //metodo de recorrido usando Colection
        //curso1.getAlumnos().forEach(alumno -> System.out.println(alumno));

        Alumno alumnoMap = curso1.getAlumnoMap().get("003"); //obtenemos al alumno que tiene el codigo "003" de manera mas sencilla
        System.out.println(alumnoMap);
        
        //metodo de recorrido usando Map
        curso1.getAlumnoMap().forEach((codigo, alumno) -> { //va a recorrer cada objeto y esto hace que su performance baje
            System.out.println(alumno);
        });

    }
}
