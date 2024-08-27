package DecimoPunto;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static Queue<Producto> filtrarCola(Queue<Producto> cola) {

        if (cola.isEmpty()) {
            return new LinkedList<>();
        }

        Producto producto = cola.poll();

        Queue<Producto> resultado = filtrarCola(cola);

        if (producto.getPrecio() < 10) {
            resultado.add(producto);
        }

        return resultado;
    }

    public static void main(String[] args) {

        Queue<Producto> colaProductos = new LinkedList<>();
        colaProductos.add(new Producto("Producto 1", 15));
        colaProductos.add(new Producto("Producto 2", 8.5));
        colaProductos.add(new Producto("Producto 3", 9));
        colaProductos.add(new Producto("Producto 4", 12));
        colaProductos.add(new Producto("Producto 5", 5));

        Queue<Producto> colaFiltrada = filtrarCola(colaProductos);

        System.out.println("Cola filtrada:");
        for (Producto producto : colaFiltrada) {
            System.out.println(producto);
        }
    }
}
