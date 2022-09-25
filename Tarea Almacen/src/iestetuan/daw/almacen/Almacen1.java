package iestetuan.daw.almacen;

import java.util.Arrays;
import java.util.Iterator;

import javax.naming.ldap.SortControl;

/*
	 * Implementar un almac�n de enteros mediante una tabla de huecos
	 * se supone que no puede contener el valor 0 ya que indica posiciones libre.
	 */
public class Almacen1 {

	static private final int LIBRE = 0;
	// Array con los valores almacenados
	private int tvalores[];
	private int valoresAlmacenados = 0;

	// Constructores sin par�metros creo una tabla de 10 elementos
	public Almacen1() {
		this(10); // Llamo al constructor con par�metros
	}

	// Constructor donde se fija tama�o m�ximo del Almac�n
	public Almacen1(int tamaño) {
		tvalores = new int[tamaño];
		init();
	}

	// Pone todas las posiciones a LIBRES
	public void init() {
		for (int i = 0; i < tvalores.length; i++) {
			tvalores[i] = Almacen1.LIBRE;
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
		for (int i = 0; i < tvalores.length; i++) {
			if (num == tvalores[i]) {
				return true;
			}
		}
		return false;
	}

	// Almacena el valor el la tabla, devuelve false sin no puede almacenarlo
	public boolean ponValor(int num) {
		if (!estaLleno()) {
			for (int i = 0; i < tvalores.length; i++) {
				if (tvalores[i] == LIBRE) {
					tvalores[i] = num;
					break;
				}
			}
			valoresAlmacenados++;
			return true;
		}
		return false;
	}

	// Elimina el elemento de la tabla, si no esta devuelve false
	public boolean sacarValor(int num) {
		for (int i = 0; i < tvalores.length; i++) {
			if (num == tvalores[i]) {
				tvalores[i] = LIBRE;
				valoresAlmacenados--;
				return true;
			}
		}
		return false;
	}

	// Indica si el almac�n esta lleno
	public boolean estaLleno() {
		return tvalores.length == valoresAlmacenados;
	}

	// Para empaquetar la tabla(eliminar huecos), utilizamos el siguiente metodo:

	public void empaquetar() {
		int izq = 0;
		int dch = tvalores.length - 1;
		while (izq < dch) {
			if (tvalores[izq] == LIBRE && tvalores[dch] != LIBRE) {
				tvalores[izq] = tvalores[dch];
				tvalores[dch] = LIBRE;
				izq++;
				dch--;
			}
			if (tvalores[izq] != LIBRE) {
				izq++;
			}
			if (tvalores[dch] == LIBRE) {
				dch--;
			}
		}
	}
}
