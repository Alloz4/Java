package cafetera;

/**
 * Clase Cafetera
 *
 * Contiene información de <b>cafeteras</b>.
 *
 * @author Marcos Alloza García
 * @version 1.0
 */

public class Cafetera {

	// Atributos

	/**
	 * Capacidad máxima de la cafetera
	 */
	private int capacidadMaxima;
	/**
	 * Capacidad actual de la cafetera
	 */
	private int capacidadActual;

	/**
	 * Constructor para cafetera con dos parametros:
	 * @param capacidadMáxima Define la capacidad máxima de la cafetera
	 * @param cantidad        Define la cantidad actual de la cafetera
	 */
	Cafetera(int capacidadMaxima, int cantidad) {
		this.capacidadMaxima = capacidadMaxima;
		this.capacidadActual = (capacidadMaxima > cantidad) ? cantidad : capacidadMaxima;
	}

	/**
	 * Constructor para cafetera sin parámetros que establece la capacidad máxima en
	 * 1000 y la capacidad actual en 0.
	 */
	Cafetera() {
		this(1000, 0);
	}

	/**
	 * Constructor para cafetera con un parámetro, poniendo la capacidad actual a 0.
	 * @param valor Define la capacidad máxima de la cafetera
	 */
	Cafetera(int valor) {
		this(valor, 0);
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public int getCapacidadActual() {
		return capacidadActual;
	}

	/**
	 * Método que llena la cafetera, hace que la capacidad actual sea igual a la
	 * capacidad máxima.
	 */
	public void llenarCafetera() {
		capacidadActual = capacidadMaxima;
	}

	/**
	 * Método que vacía la cafetera, hace que la capacidad actual de cafe sea 0.
	 */
	public void vaciarCafetera() {
		capacidadActual = 0;
	}

	/**
	 * Método que sirve una taza de cafe. Si la cantidad actual de café “no alcanza”
	 * para llenar la taza, se sirve lo que quede.
	 * 
	 * @param vtaza Define la cantidad de cafe de la taza
	 */
	public void servirTaza(int vtaza) {
		capacidadActual -= vtaza;
		if (capacidadActual < 0) {
			capacidadActual = 0;
		}

	}

	/**
	 * Método que agrega la cantidad indicada de café a la cafetera. Solo se llena
	 * hasta la capacidad máxima.
	 * 
	 * @param vcafe Define la cantidad de café que se agrega a la cafetera
	 */
	public void agregarCafe(int vcafe) {
		capacidadActual += vcafe;
		if (capacidadActual > capacidadMaxima) {
			capacidadActual = capacidadMaxima;
		}

	}
}
