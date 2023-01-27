
package ar.com.alura.model;

public class Curso {

    //Creo Mis variables privadas
    private String nombre;
    private int tiempo;
    
    //creo el constructor con sus parametros
    public Curso(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
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

    //modifico el metodo toStrong de su clase padre
    @Override
    public String toString(){
        return this.nombre;
    }
}
