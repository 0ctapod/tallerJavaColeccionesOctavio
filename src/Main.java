import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ListaDeTareas tareasDeOctavio = new ListaDeTareas();

        tareasDeOctavio.agregarTarea("Estudiar Java");
        tareasDeOctavio.agregarTarea("ir al gimnasio");
        tareasDeOctavio.agregarTarea("Repasar ArrayList");

        tareasDeOctavio.mostrarTareas();

        tareasDeOctavio.completarTarea(0);

        tareasDeOctavio.mostrarTareas();
        tareasDeOctavio.mostrarTotalPendientes();

    }
}
