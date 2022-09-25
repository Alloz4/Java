package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		ArrayList<String> lista_ordenada = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);
		int tamaño = 10;
		System.out.println("Introduce 10 palabras: ");
		for (int i = 0; i < tamaño; i++) {
			lista_ordenada.add(sc.next());
		}

		Collections.sort(lista_ordenada);

		for (String palabras : lista_ordenada) {
			System.out.print(palabras + " ");
		}
		sc.close();
	}

}
