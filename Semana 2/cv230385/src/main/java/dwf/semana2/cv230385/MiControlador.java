package dwf.semana2.cv230385;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;




@RestController
@RequestMapping("/api/datos")
public class MiControlador {
  @Autowired
    private MiServicio miServicio;

    @GetMapping
    public List<String> obtenerDatos() {
        return miServicio.obtenerDatos();
    }

    @PostMapping
    public String AgregarDato(@RequestBody String nuevoDato){
        miServicio.AgregarDato(nuevoDato);
        return "Dato agregado correctamente:" + nuevoDato;
        
    }







    
}
