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
		
		Pelicula primerPelicula = peliculas.get(0);
		
		Assert.assertEquals("Matrix", primerPelicula.obtenerTitulo());
		Assert.assertEquals(Genero.ACCION, primerPelicula.obtenerGenero());
		Assert.assertEquals(136, primerPelicula.obtenerDuracion());
	}
}
