package TercerPunto;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String args[]){
        
        Map<Integer, Estudiante> mapaEstudiantes = new HashMap<>();

        Estudiante estudiante1 = new Estudiante("Juan", 20, "Masculino", 101);
        Estudiante estudiante2 = new Estudiante("Ana", 22, "Femenino", 102);
        Estudiante estudiante3 = new Estudiante("Luis", 21, "Masculino", 103);

        mapaEstudiantes.put(estudiante1.getMatricula(), estudiante1);
        mapaEstudiantes.put(estudiante2.getMatricula(), estudiante2);
        mapaEstudiantes.put(estudiante3.getMatricula(), estudiante3);

        int matriculaABuscar1 = 102;
        Estudiante estudianteEncontrado1 = mapaEstudiantes.get(matriculaABuscar1);

        if (estudianteEncontrado1 != null) {
            System.out.println("Estudiante encontrado: " + estudianteEncontrado1);
        } else {
            System.out.println("Estudiante con matrícula " + matriculaABuscar1 + " no encontrado.");
        }

        int matriculaABuscar2 = 104;
        Estudiante estudianteEncontrado2 = mapaEstudiantes.get(matriculaABuscar2);

        if (estudianteEncontrado2 != null) {
            System.out.println("Estudiante encontrado: " + estudianteEncontrado2);
        } else {
            System.out.println("Estudiante con matrícula " + matriculaABuscar2 + " no encontrado.");
        }
    }
}
