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
		
		Pelicula pelicula = crearPelicula("  Matrix  , ACCION  , 136  ");
		
		peliculas.add(pelicula);
		
		return peliculas;
	}
	
	private Pelicula crearPelicula(String linea) throws ExcepcionEnElCine {

		String[] campos = linea.split(",");
		
		try {
			
			String titulo = campos[0].trim();
			Genero genero = Genero.valueOf(campos[1].trim());
			int duracion = Integer.parseInt(campos[2].trim());
			
			return new Pelicula(titulo, genero, duracion);
			
		} catch (Exception e) {
			
			throw new ExcepcionEnElCine("El formato es incorrecto", e);
		}
	}
}
