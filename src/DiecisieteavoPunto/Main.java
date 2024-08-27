package DiecisieteavoPunto;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        //HashMap no mantienen un orden de los elementos, por lo cual el orden 
        //en el que se almacenan depende de la clave hash interna. Sirve especialmente 
        //para cuando no se requiere un orden en los elementos pero si una búsqueda rápida.
        Map<String, String> hashMapProductos = new HashMap<>();
        hashMapProductos.put("COD1", "Laptop");
        hashMapProductos.put("COD2", "Celular");
        hashMapProductos.put("COD3", "Tablet");
        System.out.println("HashMap: " + hashMapProductos);

        //LinkedHashMap mantiene los elementos en su orden de inserción, además
        //de ser una lista doblemente enlazada. Se usa cuando se necesita mantener 
        //un orden y realizar una búsqueda rápida de los elementos.
        Map<String, String> linkedHashMapProductos = new LinkedHashMap<>();
        linkedHashMapProductos.put("COD1", "Laptop");
        linkedHashMapProductos.put("COD2", "Celular");
        linkedHashMapProductos.put("COD3", "Tablet");
        System.out.println("LinkedHashMap: " + linkedHashMapProductos);

        //TreeMap mantiene el orden de los elementos según un comparador proporcionado, 
        //lo que significa que los elementos se almacenan en una estructura de árbol. 
        //Se usa generalmente cuando se necesita un mapa ordenado según las claves.
        Map<String, String> treeMapProductos = new TreeMap<>();
        treeMapProductos.put("COD1", "Laptop");
        treeMapProductos.put("COD2", "Celular");
        treeMapProductos.put("COD3", "Tablet");
        System.out.println("TreeMap: " + treeMapProductos);
    }
}
