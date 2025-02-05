package prygestortareaspoo3;

import java.util.ArrayList;
import java.util.List;

public class Gestor {
     private final List<Tarea> tareas = new ArrayList<>();

    public void agregarTarea(String nombre, int prioridad) {
        for (Tarea tarea : tareas) {
            if (tarea.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("\n Error: La tarea ya existe.");
                return;
            }
        }
        if (prioridad < 1 || prioridad > 5) {
            System.out.println("\n Error: La prioridad debe estar entre 1 y 5.");
            return;
        }
        tareas.add(new Tarea(nombre, prioridad));
        System.out.println("\n Tarea agregada.");
    }

    public void mostrarTareas() {
    if (tareas.isEmpty()) {
        System.out.println("\n No hay tareas pendientes.");
        return;
    }
    for (int i = 1; i < tareas.size(); i++) {
    for (int j = 0; j < tareas.size() - i; j++) {
        if (tareas.get(j).getPrioridad() > tareas.get(j + 1).getPrioridad()) {
            tareas.set(j, tareas.set(j + 1, tareas.get(j)));
        }
    }
}
    for (Tarea tarea : tareas) {
        System.out.println("(Prioridad " + tarea.getPrioridad() + ") " + tarea.getNombre());
    }
}

    public void eliminarTarea(String nombre) {
        if (tareas.removeIf(tarea -> tarea.getNombre().equalsIgnoreCase(nombre))) {
            System.out.println("\n Tarea eliminada.");
        } else {
            System.out.println("\n Error: La tarea no existe.");
        }
    }

    public void completarTarea(String nombre) {
        if (tareas.removeIf(tarea -> tarea.getNombre().equalsIgnoreCase(nombre))) {
            System.out.println("\n Tarea completada y eliminada.");
        } else {
            System.out.println("\n Error: La tarea no existe.");
        }
    }
}
