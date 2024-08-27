package SegundoPunto;

import java.util.Optional;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        
        TreeSet<Producto> productos = new TreeSet<>();

        productos.add(new Producto("COD1", "Producto 1", 100.0));
        productos.add(new Producto("COD2", "Producto 2", 150.0));
        productos.add(new Producto("COD3", "Producto 3", 200.0));
        productos.add(new Producto("COD4", "Producto 4", 250.0));

        String codigoABuscar1 = "COD3";
        Optional<Producto> productoEncontrado1 = productos.stream().filter(p -> p.getCodigo().equals(codigoABuscar1)).findFirst();

        if (productoEncontrado1.isPresent()) {
            System.out.println("\nProducto encontrado: " + productoEncontrado1.get());
        } else {
            System.out.println("\nProducto con código " + codigoABuscar1 + " no encontrado.");
        }

        String codigoABuscar2 = "COD5";
        Optional<Producto> productoEncontrado2 = productos.stream().filter(p -> p.getCodigo().equals(codigoABuscar2)).findFirst();

        if (productoEncontrado2.isPresent()) {
            System.out.println("\nProducto encontrado: " + productoEncontrado2.get());
        } else {
            System.out.println("\nProducto con código " + codigoABuscar2 + " no encontrado.");
        }
    }
}
