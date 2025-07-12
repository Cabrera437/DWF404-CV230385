package dwf.semana2.TodolList.servicio;

import dwf.semana2.TodolList.modelo.Tarea;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TareaServicio {
    private List<Tarea> tareas = new ArrayList<>();
    private Long siguienteId = 1L;

    public List<Tarea> obtenerTodas() {
        return tareas;
    }

    public Tarea agregarTarea(String descripcion) {
        Tarea tarea = new Tarea(siguienteId++, descripcion);
        tareas.add(tarea);
        return tarea;
    }

    public boolean eliminarTarea(Long id) {
        return tareas.removeIf(t -> t.getId().equals(id));
    }
}
