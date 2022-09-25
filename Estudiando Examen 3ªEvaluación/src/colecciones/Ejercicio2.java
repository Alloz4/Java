package colecciones;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {

		ArrayList<Integer> listaValores = new ArrayList<Integer>();

		int tamaño = ((int) (Math.random() * (20 - 10 + 1) + 10));
		int suma = 0;
		int media = 0;
		int maximo = 0;
		int minimo = 100;

		for (int i = 0; i < tamaño; i++) {
			int aleatorio = (int) (Math.random() * 101);
			listaValores.add(aleatorio);
		}

		for (Integer valor : listaValores) {
			suma += valor;
			media = suma / listaValores.size();

			if (valor > maximo) {
				maximo = valor;
			}
			if (valor < minimo) {
				minimo = valor;
			}
		}

		System.out.println("Suma: " + suma);
		System.out.println("Media: " + media);
		System.out.println("M�ximo: " + maximo);
		System.out.println("M�nimo: " + minimo);
		System.out.println("Tama�o: " + listaValores.size());
	}

}
