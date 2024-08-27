package QuinceavoPunto;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static Map<String, Integer> filtrarMinuscula(Map<String, Integer> mapa) {

        if (mapa.isEmpty()) {
            return new HashMap<>();
        }

        Map<String, Integer> resultado = new HashMap<>();

        Iterator<Map.Entry<String, Integer>> iterador = mapa.entrySet().iterator();

        if (iterador.hasNext()) {
            Map.Entry<String, Integer> entrada = iterador.next();
            String clave = entrada.getKey();
            Integer valor = entrada.getValue();

            Map<String, Integer> resto = filtrarMinuscula(removerEntrada(mapa));

            if (!clave.isEmpty() && Character.isLowerCase(clave.charAt(0))) {

                resultado.put(clave, valor);
            }
            
            resultado.putAll(resto);
        }

        return resultado;
    }

    private static Map<String, Integer> removerEntrada(Map<String, Integer> mapa) {
        Map<String, Integer> nuevoMapa = new HashMap<>(mapa);
        if (!nuevoMapa.isEmpty()) {
            Iterator<Map.Entry<String, Integer>> iterador = nuevoMapa.entrySet().iterator();
            if (iterador.hasNext()) {
                iterador.next();
                iterador.remove();
            }
        }
        return nuevoMapa;
    }

    public static void main(String[] args) {

        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("manzana", 1);
        mapa.put("Banano", 2);
        mapa.put("cereza", 3);
        mapa.put("Mango", 4);
        mapa.put("mora", 5);
        mapa.put("Fresa", 6);

        Map<String, Integer> mapaFiltrado = filtrarMinuscula(mapa);

        System.out.println("Mapa con claves letra minúscula: " + mapaFiltrado);
    }
}
