package cafetera;

/**
 * Clase Cafetera
 *
 * Contiene informaci�n de <b>cafeteras</b>.
 *
 * @author Marcos Alloza Garc�a
 * @version 1.0
 */

public class Cafetera {

	// Atributos

	/**
	 * Capacidad m�xima de la cafetera
	 */
	private int capacidadMaxima;
	/**
	 * Capacidad actual de la cafetera
	 */
	private int capacidadActual;

	/**
	 * Constructor para cafetera con dos parametros:
	 * @param capacidadM�xima Define la capacidad m�xima de la cafetera
	 * @param cantidad        Define la cantidad actual de la cafetera
	 */
	Cafetera(int capacidadMaxima, int cantidad) {
		this.capacidadMaxima = capacidadMaxima;
		this.capacidadActual = (capacidadMaxima > cantidad) ? cantidad : capacidadMaxima;
	}

	/**
	 * Constructor para cafetera sin par�metros que establece la capacidad m�xima en
	 * 1000 y la capacidad actual en 0.
	 */
	Cafetera() {
		this(1000, 0);
	}

	/**
	 * Constructor para cafetera con un par�metro, poniendo la capacidad actual a 0.
	 * @param valor Define la capacidad m�xima de la cafetera
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
	 * M�todo que llena la cafetera, hace que la capacidad actual sea igual a la
	 * capacidad m�xima.
	 */
	public void llenarCafetera() {
		capacidadActual = capacidadMaxima;
	}

	/**
	 * M�todo que vac�a la cafetera, hace que la capacidad actual de cafe sea 0.
	 */
	public void vaciarCafetera() {
		capacidadActual = 0;
	}

	/**
	 * M�todo que sirve una taza de cafe. Si la cantidad actual de caf� �no alcanza�
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
	 * M�todo que agrega la cantidad indicada de caf� a la cafetera. Solo se llena
	 * hasta la capacidad m�xima.
	 * 
	 * @param vcafe Define la cantidad de caf� que se agrega a la cafetera
	 */
	public void agregarCafe(int vcafe) {
		capacidadActual += vcafe;
		if (capacidadActual > capacidadMaxima) {
			capacidadActual = capacidadMaxima;
		}

	}
}
