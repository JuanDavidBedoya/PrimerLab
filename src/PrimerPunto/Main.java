package PrimerPunto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 25, "Masculino"));
        personas.add(new Persona("Ana", 30, "Femenino"));
        personas.add(new Persona("Pedro", 25, "Masculino"));
        personas.add(new Persona("Maria", 20, "Femenino"));
        personas.add(new Persona("Luis", 30, "Masculino"));

        Collections.sort(personas);
        System.out.println("Lista ordenada por edad:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        List<ComparadorPorNombre> personasPorNombre = new ArrayList<>();
        for (Persona persona : personas) {
            personasPorNombre.add(new ComparadorPorNombre(persona));
        }

        Collections.sort(personasPorNombre);
        System.out.println("\nLista ordenada por nombre:");
        for (ComparadorPorNombre comparador : personasPorNombre) {
            System.out.println(comparador.getPersona());
        }

    }
}
