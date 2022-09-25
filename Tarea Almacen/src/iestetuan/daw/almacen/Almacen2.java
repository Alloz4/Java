//EJERCICIO REALIZADO POR MARCOS ALLOZA GARC�A      1�DAW
package iestetuan.daw.almacen;

import java.util.Arrays;
import java.util.Iterator;

public class Almacen2 {
	static private final int LIBRE = 0;
	// Array con los valores almacenados
	private int tvalores[];
	private int valoresAlmacenados = 0;

	// Constructores sin par�metros creo una tabla de 10 elementos
	public Almacen2() {
		this(10); // Llamo al constructor con par�metros
	}

	// Constructor donde se fija tama�o m�ximo del Almac�n
	public Almacen2(int tamaño) {
		tvalores = new int[tamaño];
		init();
	}

	// Pone todas las posiciones a LIBRES
	public void init() {
		for (int i = 0; i < tvalores.length; i++) {
			tvalores[i] = Almacen2.LIBRE;
		}
		valoresAlmacenados = 0;
	}

	// Muestra una cadena con los valores de la tabla
	public String toString() {
		return Arrays.toString(tvalores);
	}

	// Devuelve el n�meros de posiciones libres
	public int numPosicionesLibres() {
		return tvalores.length - valoresAlmacenados;
	}

	// Devuelve el n�mero de posiones ocupadas
	public int numPosicionesOcupadas() {
		return valoresAlmacenados;
	}

	// Devuelve verdadero o falso si est� almacenado el valor en la tabla
	public boolean estaValor(int num) {
		for (int i = 0; i < valoresAlmacenados; i++) {
			if (num == tvalores[i]) {
				return true;
			}
		}
		return false;
	}

	// Almacena el valor el la tabla, devuelve false sin no puede almacenarlo
	public boolean ponValor(int num) {
		boolean colocado = false;
		if (!estaLleno()) {
			int pos = Arrays.binarySearch(tvalores, 0, valoresAlmacenados, num);
			if (pos < 0) {
				pos = pos * (-1) - 1;
			}
			for (int i = valoresAlmacenados; i > pos; i--) {
				tvalores[i] = tvalores[i - 1];
			}
			tvalores[pos] = num;
			valoresAlmacenados++;
			colocado = true;
		}
		return colocado;

	}

	// Elimina el elemento de la tabla, si no esta devuelve false
	public boolean sacarValor(int num) {
		boolean eliminado = false;
		int pos = Arrays.binarySearch(tvalores, 0, valoresAlmacenados, num);
		if (pos >= 0) {
			for (int i = pos; i < valoresAlmacenados - 1; i++) {
				tvalores[i] = tvalores[i + 1];
				tvalores[i + 1] = 0;
			}
			valoresAlmacenados--;
			eliminado = true;
		}
		return eliminado;
	}

	// Indica si el almac�n esta lleno
	public boolean estaLleno() {
		return tvalores.length == valoresAlmacenados;
	}

}
