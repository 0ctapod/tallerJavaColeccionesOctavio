import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> tareas = new ArrayList<>();
        ListaDeTareas tareasDeOctavio = new ListaDeTareas();

        tareasDeOctavio.agregarTarea(tareas, "Estudiar Java");
        tareasDeOctavio.agregarTarea(tareas, "ir al gimnasio");
        tareasDeOctavio.agregarTarea(tareas, "Repasar ArrayList");

        tareasDeOctavio.mostrarTareas(tareas);

        tareasDeOctavio.completarTarea(tareas, 1);

        tareasDeOctavio.mostrarTareas(tareas);
        tareasDeOctavio.mostrarTotalPendientes(tareas);

    }
}
