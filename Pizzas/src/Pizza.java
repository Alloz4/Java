
public class Pizza {
	static int numpizzasPedidas = 0;
	static int numpizzasServidas = 0;
	private TamañoPizza tamaño;
	private TipoPizza tipo;
	private EstadoPizza estado;

	public static int getNumpizzasPedidas() {
		return numpizzasPedidas;
	}

	public static int getNumpizzasServidas() {
		return numpizzasServidas;
	}

	public Pizza(TipoPizza tipo, TamañoPizza tamaño) {
		this.tamaño = tamaño;
		this.tipo = tipo;
		this.estado = EstadoPizza.PEDIDA;
		numpizzasPedidas++;
	}

	public void sirve() {
		if (estado == EstadoPizza.PEDIDA) {
			estado = EstadoPizza.ENTREGADA;
			numpizzasServidas++;
		}
	}

	public String toString() {
		return tipo + "" + tamaño + "" + estado;
	}
}
