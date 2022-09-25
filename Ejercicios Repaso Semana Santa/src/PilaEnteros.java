public class PilaEnteros {

	private int pila[];
	private int contador = 0;

	public PilaEnteros(int tamaño) {
		pila = new int[tamaño];
	}

	public boolean push(int valor) {
		boolean cabe = false;
		for (int i = 0; i < pila.length; i++) {
			if (pila[i] == 0) {
				pila[i] = valor;
				cabe = true;
				contador++;
				break;
			}
		}
		return cabe;
	}

	public int pop() {

		if (estaVacio()) {
			return -1;
		}

		int ultimo = pila[contador - 1];

		for (int i = 0; i < pila.length; i++) {
			if (ultimo == pila[i]) {
				pila[i] = 0;
				contador--;
			}
		}
		return ultimo;
	}

	public int peek() {

		if (estaVacio()) {
			return -1;
		}

		int ultimo = pila[contador - 1];
		for (int i = 0; i < pila.length; i++) {
			if (ultimo == pila[i]) {
				contador--;
				return ultimo;
			}
		}
		return -1;
	}

	public boolean estaLleno() {
		return contador == pila.length;
	}

	public boolean estaVacio() {
		if (contador == 0) {
			return true;
		} else {
			return false;
		}
	}

}
