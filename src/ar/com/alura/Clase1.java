
package ar.com.alura;

import java.util.ArrayList;

public class Clase1 {

     public static void main(String[] args) {

        //Creeo 4 variables de tipo String
        String variable1 = "Ejemplo 1";
        String variable2 = "Ejemplo 2";
        String variable3 = "Ejemplo 3";
        String variable4 = "Ejemplo 4";

        //Creo un ArrayList de tipo String
        ArrayList<String> listaString = new ArrayList<>();

        //Agrego las 4 variables al ArrayList
        listaString.add(variable1);
        listaString.add(variable2);
        listaString.add(variable3);
        listaString.add(variable4);

        //Muestro los elementos del ArrayList
        System.out.println(listaString);

    }
}
