package cine;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PruebaCinefilo {

	private List<Pelicula> peliculas;
	
	@Before
	public void cargarPeliculas() throws ExcepcionEnElCine {
	
		peliculas = new Cartelera("datos/peliculas.txt").obtenerPeliculas();
	}
	
	@Test
	public void calcularDuracionTotal() {
		
		Cinefilo cinefilo = new Cinefilo();
		
		int duracionTotal = cinefilo.calcularDuracionTotal(peliculas);
		
		Assert.assertEquals(593, duracionTotal);
	}
}
