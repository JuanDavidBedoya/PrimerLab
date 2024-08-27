package DieciseisavoPunto;

import java.util.Stack;
import java.util.function.Predicate;

public class Main {

    public static <T> Stack<T> filtrarPila(Stack<T> pila, Predicate<T> condicion) {
 
        if (pila.isEmpty()) {
            return new Stack<>();
        }

        T elemento = pila.pop();

        Stack<T> resultadoRestante = filtrarPila(pila, condicion);

        Stack<T> resultado = new Stack<>();

        if (condicion.test(elemento)) {
            resultado.add(elemento);
        }

        while (!resultadoRestante.isEmpty()) {
            resultado.add(resultadoRestante.pop());
        }

        return resultado;
    }

    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        Predicate<Integer> condicion = x -> x > 3;

        Stack<Integer> pilaFiltrada = filtrarPila(pila, condicion);

        System.out.println("Pila filtrada: " + pilaFiltrada);
    }
}

