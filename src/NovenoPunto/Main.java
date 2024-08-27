package NovenoPunto;

import java.util.Stack;

public class Main {

    public static Stack<Integer> filtrarPila(Stack<Integer> pila) {

        if (pila.isEmpty()) {
            return new Stack<>();
        }

        Integer elemento = pila.pop();

        Stack<Integer> resultado = filtrarPila(pila);

        if (elemento > 5) {
            resultado.push(elemento);
        }

        return resultado;
    }

    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(7);
        pila.push(3);
        pila.push(9);
        pila.push(1);

        Stack<Integer> pilaFiltrada = filtrarPila(pila);

        System.out.println("Pila filtrada:");
        while (!pilaFiltrada.isEmpty()) {
            System.out.println(pilaFiltrada.pop());
        }
    }
}