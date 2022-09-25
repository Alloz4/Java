package Colecciones.src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import javax.security.auth.x500.X500Principal;

public class Eje03 {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();

		Random rd = new Random();

		int numelemento = 10 + rd.nextInt(11);

		for (int i = 0; i < numelemento; i++) {
			lista.add(rd.nextInt(101));
		}

		System.out.println(lista);

		// SUMA
		int suma = 0;
		// Forma de siempre
		/*
		 * for (int i = 0; i < lista.size(); i++) { suma += lista.get(i); }
		 */
		// Con el foreach

		for (int valor : lista) {
			suma += valor;
		}

		System.out.println("La suma es: " + suma);

		// Funcion lambda:

		// lista.removeIf(x -> x % 2 == 0);

		// Con un iterador:

		Iterator<Integer> it = lista.iterator();

		while (it.hasNext()) {

			Integer num = it.next();

			if (num % 2 == 0) {
				it.remove();
			}
		}

		System.out.println("Contenido sin pares = " + lista);
		
		//Poner a 0 los divisores de 3
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) % 3 == 0) {
				lista.set(i, 0);
			}
		}

		System.out.println("Contenido sin divisores de 3 = " + lista);

		//Poner 555 antes de un divisor de 5
		
		for (int i = 0; i < lista.size(); i++) {
			int num = lista.get(i);
			if (num!= 0 && num % 5 == 0) {
				lista.add(i,555);
				i++; //saltamos el número que insertamos
			}
		}
		
		System.out.println("Contenido con 555 en divisores de 5 = "+lista);
	}

}
