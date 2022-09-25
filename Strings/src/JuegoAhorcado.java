
//EJERCICIO REALIZADO POR MARCOS ALLOZA GARCÍA	1ºDAW
import java.util.Arrays;
import java.util.Scanner;

public class JuegoAhorcado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String intentos = "AHORCADO";
		StringBuilder ahorcado = new StringBuilder();
		String nombrepeli;
		boolean juegoacabado = false;

		System.out.println("JUEGO DEL AHORCADO\n");
		System.out.print("Introduce una película: ");
		nombrepeli = sc.nextLine();
		char[] palabratrozos = desguazaPalabra(nombrepeli);
		char[] palabraguiones = palabraEscondida(palabratrozos);

		do {

			System.out.print("Película a Adivinar: ");
			System.out.print(palabraguiones);
			System.out.println(" ERROR: " + ahorcado);
			System.out.print("Introduce una letra: ");
			char letra = sc.next().toLowerCase().charAt(0);

			if (existeLetra(letra, palabraguiones)) {
				System.out.println("Esa letra ya la adivistante anteriormente, vuelve a intentarlo.");
			}

			boolean acierto = false;
			for (int i = 0; i < palabratrozos.length; i++) {
				if (palabratrozos[i] == letra) {
					palabraguiones[i] = letra;
					if (!acierto)
						acierto = true;
				}
			}

			if (!acierto) {
				ahorcado.append(intentos.charAt(ahorcado.length()));
			}

			if (intentos.compareTo(ahorcado.toString()) == 0) {
				System.out.println("Has perdido.");
				System.out.println("La película era " + nombrepeli);
				juegoacabado = true;
			}

			boolean ganar = !hayGuiones(palabraguiones);

			if (ganar) {
				System.out.println("¡Has ganado el juego!");
				System.out.println("La película era " + nombrepeli);
				juegoacabado = true;
			}

		} while (!juegoacabado);

	}

	// Divido la palabra en letra y la guardo en un array de char
	public static char[] desguazaPalabra(String peli) {
		char[] letras = new char[peli.length()];
		for (int i = 0; i < peli.length(); i++) {
			letras[i] = peli.toLowerCase().charAt(i);
		}
		return letras;
	}

	// Escondo los huecos del array donde hay letras con guiones
	public static char[] palabraEscondida(char[] letra) {
		char[] guiones = new char[letra.length];
		for (int i = 0; i < guiones.length; i++) {
			if (letra[i] == ' ') {
				guiones[i] = ' ';
			} else {
				guiones[i] = '-';
			}
		}
		return guiones;
	}

	// Al adivinar la palabra, compruebo que no este repetida.
	public static boolean existeLetra(char letra, char[] nombre) {
		for (int i = 0; i < nombre.length; i++) {
			if (nombre[i] == letra)
				return true;
		}
		return false;
	}

	// Para salir del bucle una vez que se ha adivinado, recorro el array para ver
	// si quedan guiones.
	public static boolean hayGuiones(char[] guion) {
		for (char letra : guion) {
			if (letra == '-') {
				return true;
			}
		}
		return false;
	}
}
