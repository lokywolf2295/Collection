
package ar.com.alura.model;

import java.util.*;

public class Curso {

    //Creo Mis variables privadas
    private String nombre;
    private int tiempo;
    private List<Aula> aulaList = new ArrayList<>();
    
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
    
    public void addAula(Aula aula){ //para modificarla tenemos que utilizar este metodo
        this.aulaList.add(aula);
    }


    //modifico el metodo toStrong de su clase padre
    @Override
    public String toString(){
        return this.nombre;
    }

}
