package arraylist;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {

		int suma = 0;
		int media = 0;
		int maximo = 0;
		int minimo = 100;
		int tamaño = (int) (Math.random() * (20 - 10 + 1) + 10);

		ArrayList<Integer> lista = new ArrayList<Integer>();

		for (int i = 0; i < tamaño; i++) {
			lista.add((int) (Math.random() * 101));
		}

		System.out.print("Lista generada: ");

		for (Integer num : lista) {
			System.out.print(num + " ");
		}

		System.out.println("\n");

		for (Integer num : lista) {
			suma += num;
		}

		for (Integer num : lista) {
			if (num > maximo) {
				maximo = num;
			}
		}

		for (Integer num : lista) {
			if (num < minimo) {
				minimo = num;
			}
		}

		System.out.println("La suma total es : " + suma);
		System.out.println("La media es : " + suma / tamaño);
		System.out.println("El minimo es : " + minimo);
		System.out.println("El maximo es : " + maximo);
	}

}
