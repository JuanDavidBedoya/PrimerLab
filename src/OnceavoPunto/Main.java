package OnceavoPunto;

import java.util.ArrayList;
import java.util.List;

public class Main {

public static List<Producto> quicksort(List<Producto> productos) {

    if (productos.size() <= 1) {
        return productos;
    }

    Producto pivote = productos.get(productos.size() - 1);
    List<Producto> menores = new ArrayList<>();
    List<Producto> mayores = new ArrayList<>();

    for (int i = 0; i < productos.size() - 1; i++) {
        Producto producto = productos.get(i);
        if (producto.getPrecio() <= pivote.getPrecio()) {
            menores.add(producto);
        } else {
            mayores.add(producto);
        }
    }

    List<Producto> resultado = new ArrayList<>();
    resultado.addAll(quicksort(menores)); 
    resultado.add(pivote); 
    resultado.addAll(quicksort(mayores));

    return resultado;
}

public static void main(String[] args) {

    List<Producto> productos = new ArrayList<>();
    productos.add(new Producto("Producto 1", 15));
    productos.add(new Producto("Producto 2", 8.5));
    productos.add(new Producto("Producto 3", 12));
    productos.add(new Producto("Producto 4", 5));
    productos.add(new Producto("Producto 5", 20));

    List<Producto> productosOrdenados = quicksort(productos);

    System.out.println("Lista de productos ordenada por precio:");
    for (Producto producto : productosOrdenados) {
        System.out.println(producto);
    }
}
}
