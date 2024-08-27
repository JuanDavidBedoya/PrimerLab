package CuartoPunto;

public class Main {
    public static void main(String[] args) {
        
        Pila<Object> pila = new Pila<>();

        pila.push(1);  
        pila.push(2);  

        pila.pop();
        pila.pop();

        pila.push("Hola");  
        pila.push("Mundo"); 

        pila.pop();
        pila.pop();

        pila.push(42);

        System.out.println("Elemento en la cima de la pila de cadenas: " + pila.peek());

        //Para verficiar que realmente funcionan los requerimientos del código puede comentar las lineas 17 y 18.
        
    }
}
