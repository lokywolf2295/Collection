
package ar.com.alura;

import java.util.ArrayList;

public class Clase2 {

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

        //Metodo de Ordenamiento con for normal
        for(int i = 0; i < listaString.size(); i++) {
            System.out.println(listaString.get(i));
        }

        //Metodo de Ordenamiento con for each
        for (String clase : listaString ) {
            System.out.println(clase);
        }

        //Metodo de Ordenamiento con for each usando función lambda
        listaString.forEach(clase -> {
            System.out.println(clase);
        });


    }
}
