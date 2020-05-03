package cine;

public class Pelicula {

	private String titulo;
	private Genero genero;
	private int duracion;
	
	public Pelicula(String titulo, Genero genero, int duracion) {
		
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
	}
	
	/**
	 * @return título que identifica la Película.
	 */
	public String obtenerTitulo() {
		
		return titulo;
	}
	
	/**
	 * @return Género en el que fue catalogada la Película.
	 */
	public Genero obtenerGenero() {
		
		return genero;
	}
	
	/**
	 * @return minutos que dura la Película.
	 */
	public int obtenerDuracion() {
		
		return duracion;
	}

	public boolean esLargometraje() {
		
		return duracion > 30;
	}

	public boolean tiene(Genero unGenero) {

		return genero == unGenero;
	}
}
