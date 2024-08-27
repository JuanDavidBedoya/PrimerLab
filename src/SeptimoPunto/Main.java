package SeptimoPunto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static List<Persona> mayoresDeEdad(List<Persona> personas) {
        
        if (personas.isEmpty()) {
            return new ArrayList<>();
        }

        Persona primera = personas.get(0);

        List<Persona> resto = mayoresDeEdad(personas.subList(1, personas.size()));

        if (primera.getEdad() >= 18) {
            resto.add(0, primera);
        }

        return resto;
    }

    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 16));
        personas.add(new Persona("Ana", 20));
        personas.add(new Persona("Luis", 17));
        personas.add(new Persona("Marta", 22));
        personas.add(new Persona("Carlos", 18));

        List<Persona> mayoresDeEdad = mayoresDeEdad(personas);

        System.out.println("Personas mayores de edad:");
        for (Persona persona : mayoresDeEdad) {
            System.out.println(persona);
        }
    }
}
