package CatorceavoPunto;

import java.util.ArrayList;
import java.util.List;

public class Main {

public static List<String> filtrarMayusculas(List<String> cadenas) {
   
    if (cadenas.isEmpty()) {
        return new ArrayList<>();
    }

    String primeraCadena = cadenas.get(0);

    List<String> resultado = filtrarMayusculas(cadenas.subList(1, cadenas.size()));

    if (!primeraCadena.isEmpty() && Character.isUpperCase(primeraCadena.charAt(0))) {

        resultado.add(0, primeraCadena);
    }

    return resultado;
}

public static void main(String[] args) {

    List<String> cadenas = new ArrayList<>();
    cadenas.add("manzana");
    cadenas.add("Banano");
    cadenas.add("cereza");
    cadenas.add("Mango");
    cadenas.add("mora");
    cadenas.add("Fresa");

    List<String> cadenasMayusculas = filtrarMayusculas(cadenas);

    System.out.println("Cadenas letra mayúscula: " + cadenasMayusculas);
}
}
