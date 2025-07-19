package sv.edu.udb.spring_di.repository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import sv.edu.udb.spring_di.repository.domain.Movie;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Clase que simulara el acceso a un banco de datos
 * puediendo ser esto una base de datos o un archivo de texto.
 * un archivo excel, etc.
 * 
 */
@Component
public class MovieRepository {
//Lista de peliculas en memoria
private List<Movie> listMovies;


/**
 *Metodo inicializador en memoria
  *en este caso la lsita de peliculas

 */
@PostConstruct
private void init(){
final Movie movie_1 = Movie 
 .builder(){
    .id(1L)
    .name("Inception")
    .type("Sciencia Ficción")
    .releaseYear(2010)
    .build();
   final Movie movie_2 = Movie
   .builder()
   .id(2L)
   .name("Butterfly Effect")
   .releaseYear(2004)
   .build();
    final Movie movie_3 = Movie
    .builder()
    .id(3L)
    .name("Interstellar")
    .type("Sciencia Ficción")
    releaseYear(2014)
    .build();   
    this.listOfMovies = List.of(movie_1, movie_2, movie_3);
 
 }
/**
 * metodo para busquedad de peliculas 
 * 
 * @param id indentificador de la pelicula
 * @return la pelicula sino una error no existe la pelicula
 * 
 */
 public Movie findMovieById(final Long id)
 return this.listOfMovies
       .stream()
       .filter(Movie -> id.equals(movie.getId()))
         .findFirst()
         .orElseThrow
            (() -> new NoSuchElementException("Movie doesn´t exists" )); 



    
}







    
}
