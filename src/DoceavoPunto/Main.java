package DoceavoPunto;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Integer> recorridoEnOrden(Nodo nodo) {
        List<Integer> resultado = new ArrayList<>();
        
        if (nodo == null) {
            return resultado;
        }

        resultado.addAll(recorridoEnOrden(nodo.izquierdo));

        resultado.add(nodo.valor);

        resultado.addAll(recorridoEnOrden(nodo.derecho));

        return resultado;
    }

    public static void main(String[] args) {
  
        Nodo raiz = new Nodo(10);
        raiz.izquierdo = new Nodo(5);
        raiz.derecho = new Nodo(15);
        raiz.izquierdo.izquierdo = new Nodo(2);
        raiz.izquierdo.derecho = new Nodo(7);
        raiz.derecho.izquierdo = new Nodo(12);
        raiz.derecho.derecho = new Nodo(20);

        List<Integer> elementosOrdenados = recorridoEnOrden(raiz);

        System.out.println("Elementos del árbol en orden ascendente:");
        for (int valor : elementosOrdenados) {
            System.out.println(valor);
        }
    }
}
