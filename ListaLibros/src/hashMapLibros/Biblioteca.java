package hashMapLibros;

/**
 * Write a description of class Biblioteca here.
 *  Ejemplo de uso de ArrayList
 * @author (Alberto Lopez) 
 * @version (1.0)
 */

import java.util.Scanner;
import java.util.Collection;
import java.util.HashMap;

public class Biblioteca {
	public static void main(String argv[]) {

		HashMap<String, Libro> disponibles = new HashMap<String, Libro>();
		HashMap<String, Libro> prestados = new HashMap<String, Libro>();

		Scanner sc = new Scanner(System.in);

		// Rellenar las listas con valores de prueba
		Libro libro1 = new Libro(19, "El Quijote", " Cervantes", Genero.NOVELA, 2012);
		Libro libro2 = new Libro(20, "El Buscón", "Quevedo", Genero.NOVELA, 1997);
		Libro libro3 = new Libro(21, "Romeo y Julieta", "Shakespeare ", Genero.TEATRO, 1997);
		Libro libro4 = new Libro(22, "Mio Cid", "Anónimo", Genero.POESIA, 1989);
		Libro libro5 = new Libro(30, "Harry Potter I", "J. K. Rowling", Genero.NOVELA, 1998);
		Libro libro6 = new Libro(34, "Guerra y Paz", "León Tolstoi", Genero.NOVELA, 1975);
		Libro libro7 = new Libro(19, "El Decamerón", "Giovanni Boccaccio", Genero.CUENTOS, 1992);
		
		disponibles.put(libro1.titulo, libro1);
		disponibles.put(libro1.titulo, libro1);
		disponibles.put(libro3.titulo, libro3);
		disponibles.put(libro4.titulo, libro4);

		System.out.println("Libros disponibles:");
		// Ordenacion de objetos --> Interfaz Comparable
		verCatalogo(disponibles.values());

		prestados.put(libro5.titulo, libro5);
		prestados.put(libro6.titulo, libro6);
		prestados.put(libro7.titulo, libro7);

		System.out.println("Libros prestados:");
		verCatalogo(prestados.values());

		// Pedir datos al usuarios y probar el mÃ©todo prestarLibro

		System.out.println("¿Que libro desea?:");
		String titulo = sc.nextLine();
		int resu = prestarLibro(titulo, prestados, disponibles);
		if (resu == 0)
			System.out.println("El libro no está en el catalogo");
		else if (resu == -1)
			System.out.println("El libro está prestado");
		else
			System.out.println("Su prestamo ha sido anotado");

		System.out.println("Libros disponibles:");
		verCatalogo(disponibles.values());

		System.out.println("Libros prestados:");
		verCatalogo(prestados.values());
		
		sc.close();
	}

	private static void verCatalogo(Collection<Libro> lista) {
		
		int i = 1;
		for (Libro l : lista) {
			System.out.println((i) + ":" + l);
			i++;
		}

	}

	// Primera version: realizo una busqueda secuencial

	/*
	 * Devuelve: 0 si no existe el libro en niguna de la listas 1 Si puede
	 * prestarlo, el libro pasa de ldisponibles a lprestados -1 Si ya esta prestado.
	 */

	public static int prestarLibro(String titulo, HashMap<String, Libro> lprestados,
												  HashMap<String, Libro> ldisponibles) {

		// Busco en ambas listas
		Libro libroprestado = lprestados.get(titulo);
		Libro librodisponible = ldisponibles.get(titulo);

		if (libroprestado == null && librodisponible == null)
			return 0; // No esta en catalogo
		if (libroprestado != null)
			return -1; // Esta prestado

		ldisponibles.remove(librodisponible.titulo);
		lprestados.put(librodisponible.titulo,librodisponible);
		return 1;
	}

}
