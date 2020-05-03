package cine;

import java.util.Iterator;
import java.util.List;

public class Cinefilo {

	/**
	 * @return la suma de todas las duraciones de las películas dadas.
	 */
	public int calcularDuracionTotal(List<Pelicula> peliculas) {

		int duracionTotal = 0;
		
		Iterator<Pelicula> iterador = peliculas.iterator();
		
		while (iterador.hasNext()) {
			
			Pelicula unaPelicula = iterador.next();
			
			duracionTotal += unaPelicula.obtenerDuracion();
		}
		
		return duracionTotal;
	}

	/**
	 * @return la cantidad de películas que tienen como Género 'generoElegido'.
	 */
	public int contarLasDelGenero(List<Pelicula> peliculas, Genero generoElegido) {

		int cuenta = 0;
		
		for (Pelicula unaPelicula : peliculas) {
			
			if (unaPelicula.obtenerGenero() == generoElegido) {
				
				cuenta++;
			}
		}
		
		return cuenta;
	}


	/**
	 * @return la primera Película cuyo Género sea 'generoElegido' o null si ninguna lo es.
	 */
	public Pelicula buscarLaPrimeraDelGenero(List<Pelicula> peliculas, Genero generoElegido) {

		Pelicula peliculaEncontrada = null;
		
		Iterator<Pelicula> iterador = peliculas.iterator();
		
		while (iterador.hasNext() && (peliculaEncontrada == null)) {
			
			Pelicula unaPelicula = iterador.next();
			
			if (unaPelicula.obtenerGenero() == generoElegido) {
				
				peliculaEncontrada = unaPelicula;
			}
		}
		
		return peliculaEncontrada;
	}

	/**
	 * @post deja en 'peliculas' solo aquellas que son cortometrajes.
	 */
	public void filtrarCortometrajes(List<Pelicula> peliculas) {

		Iterator<Pelicula> iterador = peliculas.iterator();
		
		while (iterador.hasNext()) {
			
			Pelicula unaPelicula = iterador.next();
			
			if (unaPelicula.obtenerDuracion() > 30) {
				
				iterador.remove();
			}
		}
	}
}
