package dwf.semana2.cv230385;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class MiServicio {
    private final List<String> datos = new ArrayList<>();
    public MiServicio() {
        // Datos iniciales
        datos.add("Elemento 1");
        datos.add("Elemento 2");

    }
    public List<String> obtenerDatos() {
         return datos;
    }



    public void AgregarDato(String nuevoDato) {
        datos.add(nuevoDato);
    }



}
