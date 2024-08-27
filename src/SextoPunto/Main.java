package SextoPunto;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        
        PriorityQueue<Tarea> colaTareas = new PriorityQueue<>();

        colaTareas.add(new Tarea("Llamar al cliente", 1));
        colaTareas.add(new Tarea("Revisar correos", 4));
        colaTareas.add(new Tarea("Preparar informe", 2));
        colaTareas.add(new Tarea("Reunión con el equipo", 3));
 
        System.out.println("Tareas ordenadas por prioridad:");
        while (!colaTareas.isEmpty()) {
            Tarea tarea = colaTareas.poll(); 
            System.out.println(tarea);
        }
    }
}
