package cine;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PruebaCartelera {

	@Test
	public void obtenerPeliculas() throws ExcepcionEnElCine {
		
		Cartelera cartelera = new Cartelera("datos/peliculas.txt");
		
		List<Pelicula> peliculas = cartelera.obtenerPeliculas();
		
		Assert.assertFalse(peliculas.isEmpty());
		Assert.assertEquals(5, peliculas.size());
		
		comprobar(peliculas.get(0), "Matrix", Genero.ACCION, 136);
		comprobar(peliculas.get(1), "El señor de los anillos: Las dos torres", Genero.DRAMA, 179);
		comprobar(peliculas.get(2), "Vuelo de pájaros", Genero.COMEDIA, 3);
		comprobar(peliculas.get(3), "Pecados capitales", Genero.SUSPENSO, 127);
		comprobar(peliculas.get(4), "El origen", Genero.ACCION, 148);
	}
	
	private void comprobar(Pelicula pelicula, String titulo, Genero genero, int duracion) {
		
		Assert.assertEquals("titulo", titulo, pelicula.obtenerTitulo());
		Assert.assertEquals("genero", genero, pelicula.obtenerGenero());
		Assert.assertEquals("duracion", duracion, pelicula.obtenerDuracion());
	}
}
