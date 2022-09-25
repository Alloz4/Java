
public class SeriePotencia5 implements Series {

	private int multiploInicial;
	private int multiploActual;
	private int contmultiplos;

	public SeriePotencia5() {
		this.multiploInicial = 5;
		this.multiploActual = 5;
	}

	public int getSiguiente() {
		multiploActual *= 5;
		contmultiplos++;
		return multiploActual;
	}

	public void reiniciar() {
		multiploActual = multiploInicial;
	}

	public void setComenzar(int x) {
		this.multiploInicial = x;
		this.multiploActual = x;

	}
	public int getContador() {
		return contmultiplos;
	}
}
