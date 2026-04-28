import java.util.ArrayList;
import java.util.List;

public class ListaDeTareas {

    List<String> tareas = new ArrayList<>();

    public void agregarTarea(String tarea) {
        tareas.add(tarea);
        System.out.println("\nSu tarea: " + tarea + " ha sido agregada");
    }

    public void mostrarTareas() {
        System.out.println("\n=========================================");
        System.out.println("Lista de tareas pendientes\n");

        if (tareas.isEmpty()) {
            System.out.println("No hay tareas pendientes.");
        } else {
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println((i + 1) + ". " + tareas.get(i));
            }
        }
        System.out.println("=========================================\n");
    }

    public void completarTarea(int posicion) {
        if (posicion >= 0 && posicion < tareas.size()) {
            String tareaCompletada = tareas.remove(posicion);
            System.out.println("Tarea completada y eliminada: " + tareaCompletada);
        } else {
            System.out.println("La posición ingresada no existe.");
        }
    }

    public void mostrarTotalPendientes() {
        System.out.println("Total de tareas pendientes: " + tareas.size() + "\n");
    }
}


