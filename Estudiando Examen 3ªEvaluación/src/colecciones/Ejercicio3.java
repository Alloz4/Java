package colecciones;

import java.util.ArrayList;

public class Ejercicio3 {

	public static void main(String[] args) {
		ArrayList<Integer> listaValores = new ArrayList<Integer>();

		int tamaño = ((int) (Math.random() * (20 - 10 + 1) + 10));
		int suma = 0;

		for (int i = 0; i < tamaño; i++) {
			int aleatorio = ((int) (Math.random() * 101));
			listaValores.add(aleatorio);
		}

		System.out.println(listaValores);

		for (Integer valor : listaValores) {
			suma += valor;
		}

		System.out.println("Suma: " + suma);

		System.out.println("Se borrar�n los n�meros pares: ");
		listaValores.removeIf(valor -> valor % 2 == 0);
		System.out.println(listaValores);

		System.out.println("Se reemplazar�n los n�meros que sean divisibles por 3 con el valor 0: ");

		listaValores.removeIf(valor -> valor % 3 == 0);
		System.out.println(listaValores);

		System.out.println(
				"Reemplazar los numeros que sean divisibles por 5 por el numero 555 en la posicion anterior: ");

		for (int i = 0; i < listaValores.size(); i++) {
			int valor = listaValores.get(i);
			if (valor != 0 && valor % 5 == 0) {
				listaValores.add(i, 555);
				i++; // He insertado debo saltar
			}
		}

		System.out.println("Lista generada: " + listaValores);
	}
}
