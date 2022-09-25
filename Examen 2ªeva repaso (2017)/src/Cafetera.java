public class Cafetera {
	private int capacidadMaxima;
	private int cantidadActual;

	public Cafetera() {
		this(0, 1000);
	}

	public Cafetera(int capacidadMaxima) {
		this(0, capacidadMaxima);
	}

	public Cafetera(int cantidadActual, int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
		if (cantidadActual > capacidadMaxima) {
			this.cantidadActual = capacidadMaxima;
		} else {
			this.cantidadActual = cantidadActual;
		}
	}
	
	public void llenarCafetera() {
		cantidadActual = capacidadMaxima;
	}
	
	public void servirTaza (int cantidad) {
		cantidadActual-=cantidad;
		if (cantidad < 0) {
			cantidadActual = 0;
		}
	}
	
	public void vaciarCafetera() {
		cantidadActual = 0;
	}
	
	public void agregarCafe(int cantidad) {
		cantidadActual+=cantidad;
		if (cantidadActual > capacidadMaxima) {
			cantidadActual = capacidadMaxima;
		}
	}
}