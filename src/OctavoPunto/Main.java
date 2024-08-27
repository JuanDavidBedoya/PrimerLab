package OctavoPunto;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Map<Integer, String> clavesPares(Map<Integer, String> mapa) {

        if (mapa.isEmpty()) {
            return new HashMap<>();
        }

        Map<Integer, String> resultado = new HashMap<>();

        Map.Entry<Integer, String> entrada = mapa.entrySet().iterator().next();

        mapa.remove(entrada.getKey());

        if (entrada.getKey() % 2 == 0) {
            resultado.put(entrada.getKey(), entrada.getValue());
        }

        resultado.putAll(clavesPares(mapa));

        return resultado;
    }

    public static void main(String[] args) {

        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Uno");
        mapa.put(2, "Dos");
        mapa.put(3, "Tres");
        mapa.put(4, "Cuatro");
        mapa.put(5, "Cinco");

        Map<Integer, String> mapaFiltrado = clavesPares(mapa);

        System.out.println("Mapa filtrado (claves pares):");
        for (Map.Entry<Integer, String> entrada : mapaFiltrado.entrySet()) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }
    }
}