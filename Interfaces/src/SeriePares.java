
public class SeriePares implements Series {

	private int valorInicial;
	private int valorActual;
	private int contpares;

	public SeriePares() {
		this.valorInicial = 0;
		this.valorActual = 0;
	}

    public int getSiguiente() {
    	valorActual+=2;
        return valorActual;
    }

    public void reiniciar() {
        valorActual=valorInicial;
    }

    public void setComenzar(int x) {
    	this.valorInicial=x;
        this.valorActual=x;
    }
	public int getContador() {
		return contpares;
	}
}

