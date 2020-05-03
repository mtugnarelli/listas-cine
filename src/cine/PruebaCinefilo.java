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
	
	@Test
	public void contarLasDelGeneroAccion() {
		
		Cinefilo cinefilo = new Cinefilo();
		
		int peliculasDeAccion = cinefilo.contarLasDelGenero(peliculas, Genero.ACCION);
		
		Assert.assertEquals(2, peliculasDeAccion);
	}
	
	@Test
	public void buscarLaPrimeraDelGeneroSuspenso() {
		
		Cinefilo cinefilo = new Cinefilo();
		
		Pelicula peliculaDeSuspenso = cinefilo.buscarLaPrimeraDelGenero(peliculas, Genero.SUSPENSO);
		
		Assert.assertEquals("Pecados capitales", peliculaDeSuspenso.obtenerTitulo());
	}
	
	@Test
	public void removerCortometrajes() {
		
		Cinefilo cinefilo = new Cinefilo();
		
		cinefilo.filtrarCortometrajes(peliculas);
		
		Assert.assertEquals(1, peliculas.size());
		Assert.assertEquals("Vuelo de pájaros", peliculas.get(0).obtenerTitulo());
	}

	@Test
	public void buscarLaUltimaDelGeneroAccion() {
		
		Cinefilo cinefilo = new Cinefilo();
		
		Pelicula peliculaDeSuspenso = cinefilo.buscarLaUltimaDelGenero(peliculas, Genero.ACCION);
		
		Assert.assertEquals("El origen", peliculaDeSuspenso.obtenerTitulo());
	}

	@Test
	public void buscarGeneros() {
		
		Cinefilo cinefilo = new Cinefilo();
		
		List<Genero> generos = cinefilo.buscarGeneros(peliculas);
		
		Assert.assertEquals(4, generos.size());
	}
}
