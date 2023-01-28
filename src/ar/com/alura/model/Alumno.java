package ar.com.alura.model;

public class Alumno {

    private String nombre;

    private String codigo;

    public Alumno(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    /**
     * modificamos el metodo to string para que deje de devolver el espacio en memoria
     * @return el nombre
     */
    @Override
    public String toString() {
        return this.nombre;
    }

    /**
     *modificamos el metodo equals para que verifique si el mombre del alumno es igual al que se recibe or parametro
     * @param obj
     * @return un bopolean si es o no igual
     */
    @Override
    public boolean equals(Object obj) {
        Alumno alumno = (Alumno) obj;
        return this.nombre.equals(alumno.getNombre());
    }

    /**
     * modificamos el metodo hashcode para que este retorne las cajas de agrupamiento
     * @return nombre (cajas de agrupamiento por cada igual que haya)
     */
    @Override
    public int hashCode() {
        return this.nombre.hashCode();
    }
    
    //al modificar tanto equals como haschode permitimos tener la capacidad 
    //de migrar para alguna otra interfaz sin la mayor preocupación de obtener resultados no esperados (list, set ...)
}
