package ar.com.alura.model;

import java.util.*;

public class Curso {

    //Creo Mis variables privadas
    private String nombre;
    private int tiempo;
    private List<Aula> aulaList = new ArrayList<>();
    private Collection<Alumno> alumnos = new HashSet<>(); //agrego una coleccion de hashset
    //private Collection<Alumno> alumnos = new LinkedHashSet<>();
    private Map<String, Alumno> alumnoMap = new HashMap<>(); //ordena los objetos agregados por el metodo put a su conveniencia
    private Map<String, Alumno> alumnoLinkedMap = new LinkedHashMap<>(); //ordena los objetos agregados por el metodo put en orden

    //creo el constructor con sus parametros
    public Curso(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public Curso(String nombre, int tiempo, List<Aula> aulaList) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.aulaList = aulaList;
    }

    //creo los metodos getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public List<Aula> getAulaList() {
        return Collections.unmodifiableList(aulaList); //con esta sentencia no permitimos que se pueda modificar la lista
    }

    public void setAulaList(List<Aula> aulaList) {
        this.aulaList = aulaList;
    }

    public Collection<Alumno> getAlumnos() {
        return alumnos;
    }
    
     public Map<String, Alumno> getAlumnoMap() {
        return alumnoMap;
    }

    public void addAula(Aula aula) { //para modificarla tenemos que utilizar este metodo
        this.aulaList.add(aula);
    }

    /**
     * permite agregar cada alumno a la lista
     * @param alumno 
     */
    public void addAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
        this.alumnoMap.put(alumno.getCodigo() , alumno); //agrega al alumno mediante el metodo de hashMap llamado put
    }

    /**
     * verifica si el alumno recibido por parametro se encuentra en la lista de alumnos
     * @param alumno
     * @return boolean
     */
    public boolean verificaAlumno(Alumno alumno) {
        return this.alumnos.contains(alumno);
    } 

    //modifico el metodo toStrong de su clase padre
    @Override
    public String toString() {
        return this.nombre;
    }

}
