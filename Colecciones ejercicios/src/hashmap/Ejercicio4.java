package hashmap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio4 {

	public static void main(String[] args) {

		HashMap<String, String> eliza = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);

		// Introducimos las palabras con su clave:

		eliza.put("HOLA", "Hola, �qu� tal?");
		eliza.put("ENCANTADO", "Encantado de conocerte yo tambi�n");
		eliza.put("ADIOS", "Adi�s, espero volverte a ver pronto");
		eliza.put("HORA", "Lo siento, no llevo reloj");
		eliza.put("NOMBRE", "Mi nombre es Eliza");
		String equivocacion = "Lo siento, no te comprendo";

		Set<String> claves = eliza.keySet();

		System.out.println("Conectando con el sistema ELIZA...");
		boolean fin = false;

		do {
			System.out.print("<");
			String linea = sc.nextLine();
			// Paso todo a mayusculas;
			linea = linea.toUpperCase();

			boolean encontrado = false;

			for (String palabraclave : claves) {
				// Si la linea contiene la entrada en al clave
				if (linea.indexOf(palabraclave) >= 0) {
					// if ( linea.contains(palabraclave)){ // Otra forma
					System.out.println(">" + eliza.get(palabraclave));
					encontrado = true;
					if (palabraclave.contentEquals("ADIOS")) {
						fin = true;
					}
					break;
				}
			}
			if (!encontrado) {
				System.out.println(equivocacion);
			}
		} while (!fin);
		System.out.println(" Fin de conexi�n.");

		sc.close();

	}
}
