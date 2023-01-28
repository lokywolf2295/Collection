package ar.com.alura;

import ar.com.alura.model.*;
import java.util.Iterator;

public class Clase16 {

    public static void main(String[] args) {

        Curso curso1 = new Curso("Historia", 30);

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
        
        System.out.println("Con ForEach Lambda");
        curso1.getAlumnos().forEach(alumno -> System.out.println(alumno)); //recorremos la lista curso1 obteniendo sus alumnos con un foreach lambda

        Iterator<Alumno> alumnoIterator = curso1.getAlumnos().iterator(); //creamos un iterator para almacenar la cantidad de objetos que tiene la lista

        System.out.println("\nCon While usando Iterator");
        while (alumnoIterator.hasNext()) {//en cada recorrida abanza un puesto mas
            System.out.println(alumnoIterator.next());//imprimiendo cada alumno
        }
    }
}
