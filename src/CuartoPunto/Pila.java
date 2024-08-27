package CuartoPunto;

import java.util.Stack;

public class Pila<T> {
    private Stack<T> pila;

    public Pila() {
        this.pila = new Stack<>();
    }

    public void push(T elemento) {

        if (pila.isEmpty()) {
            
            pila.push(elemento);
            
        } else {
            
            T cima = pila.peek();
            if (cima.getClass().equals(elemento.getClass())) {
                pila.push(elemento);
                
            } else {
                throw new IllegalArgumentException("El tipo del elemento no coincide con el tipo del elemento en la cima de la pila.");
            }
        }
    }

    public T pop() {
        if (pila.isEmpty()) {
            System.out.println("La pila está vacía.");
            return null;
        } else {
            return pila.pop();
        }
    }

    public T peek() {
        if (pila.isEmpty()) {
            System.out.println("La pila está vacía.");
            return null;
        } else {
            return pila.peek();
        }
    }

    

    
}
