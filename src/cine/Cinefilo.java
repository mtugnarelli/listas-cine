package cine;

import java.util.Iterator;
import java.util.List;

public class Cinefilo {

	/**
	 * @return devuelve la suma de todas las duraciones de las películas dadas.
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
}
