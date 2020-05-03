package cine;

public class ExcepcionEnElCine extends Exception {

	private static final long serialVersionUID = 1L;

	public ExcepcionEnElCine(String detalle, Exception causa) {

		super(detalle, causa);
	}
}
