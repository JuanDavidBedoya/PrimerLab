package TreceavoPunto;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static Set<Integer> filtrarPares(Set<Integer> conjunto) {

        if (conjunto.isEmpty()) {
            return new HashSet<>();
        }

        Integer numero = conjunto.iterator().next();
        Set<Integer> resto = new HashSet<>(conjunto);
        resto.remove(numero);

        Set<Integer> resultado = filtrarPares(resto);

        if (numero % 2 == 0) {
            resultado.add(numero);
        }

        return resultado;
    }

    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

        Set<Integer> numerosPares = filtrarPares(numeros);

        System.out.println("Números pares: " + numerosPares);
    }
}
