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
	}
}
