package cine;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Cartelera {

	private String archivo;
	
	public Cartelera(String archivo) {
		
		this.archivo = archivo;
	}
	
	public List<Pelicula> obtenerPeliculas() throws ExcepcionEnElCine {
		
		List<Pelicula> peliculas = new LinkedList<Pelicula>();

		try {
			
			BufferedReader lector = new BufferedReader(new FileReader(archivo));

			try {
				
				String linea = lector.readLine();
				
				while (linea != null) {
					
					linea = linea.trim();
					
					if (!linea.isEmpty()) {
						
						Pelicula unaPelicula = crearPelicula(linea);
						
						peliculas.add(unaPelicula);
					}
					
					linea = lector.readLine();
				}
				
			} finally {

				lector.close();
			}
		
		} catch (IOException e) {
			
			throw new ExcepcionEnElCine("No se pudo leer el archivo de peliculas", e);
		}
		
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