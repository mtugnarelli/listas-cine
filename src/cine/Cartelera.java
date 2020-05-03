package cine;
import java.util.LinkedList;
import java.util.List;

public class Cartelera {

	private String archivo;
	
	public Cartelera(String archivo) {
		
		this.archivo = archivo;
	}
	
	public List<Pelicula> obtenerPeliculas() throws ExcepcionEnElCine {
		
		List<Pelicula> peliculas = new LinkedList<Pelicula>();

		Pelicula pelicula = new Pelicula(null, null, 0);
		
		peliculas.add(pelicula);
		
		return peliculas;

	}
}
