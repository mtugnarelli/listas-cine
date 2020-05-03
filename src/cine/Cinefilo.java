package cine;

import java.util.List;

public class Cinefilo {

	/**
	 * @return devuelve la suma de todas las duraciones de las películas dadas.
	 */
	public int calcularDuracionTotal(List<Pelicula> peliculas) {

		int duracionTotal = 0;
		
		for (int i = 0; i < peliculas.size(); i++) {
			
			Pelicula unaPelicula = peliculas.get(i);
			
			duracionTotal += unaPelicula.obtenerDuracion();
		}
		
		return duracionTotal;
	}
}
