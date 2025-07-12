package dwf.semana2.TodolList.controlador;

import dwf.semana2.TodolList.modelo.Tarea;
import dwf.semana2.TodolList.servicio.TareaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tareas")
public class TareaControlador {

    @Autowired
    private TareaServicio tareaServicio;

    @GetMapping
    public List<Tarea> obtenerTareas() {
        return tareaServicio.obtenerTodas();
    }

    @PostMapping
    public Tarea crearTarea(@RequestParam String descripcion) {
        return tareaServicio.agregarTarea(descripcion);
    }

    @DeleteMapping("/{id}")
    public String eliminarTarea(@PathVariable Long id) {
        boolean eliminada = tareaServicio.eliminarTarea(id);
        return eliminada ? "Tarea eliminada correctamente" : "No se encontró la tarea con ID: " + id;
    }
}
