import java.util.Scanner;

/**
 * Clase Test
 * 
 * Contiene un ejercicio de <b>excepciones</b>.
 * 
 * @author Marcos Alloza
 * 
 * @version 1.0
 *
 */
public class Test {

	static String tpalabros[] = { "caca", "culo", "pedo", "pis" };

	public static void main(String args[]) {
		boolean fin = false;
		String palabra;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tus mensajes, o pulsa . Para terminar:");
		do {
			try {
				palabra = leerLineaOK(sc);
				if (palabra.equals(".")) {
					System.out.println("Fin del programa");
					fin = true;
				} else {
					System.out.println("OK");
				}
			} catch (BurradasNOException e) {
				System.out.println(e.getMessage());
			}
		} while (fin != true);

	}

	/**
	 * Lee una línea 
	 * 
	 * @param sc Define el escáner para leer todo lo que pongamos.
	 * @return La cadena que se haya leído.
	 * @throws BurradasNOException Si la cadena contiene una de las palabras del
	 *                             array tpalabros.
	 */
	public static String leerLineaOK(Scanner sc) throws BurradasNOException {
		String cadena;
		cadena = sc.nextLine();
		for (int i = 0; i < tpalabros.length; i++) {
			if (cadena.indexOf(tpalabros[i]) >= 0) {
				throw new BurradasNOException();
			}
		}
		return cadena;
	}

}