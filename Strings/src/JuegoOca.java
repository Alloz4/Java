//EJERCICIO REALIZADO POR MARCOS ALLOZA GARCÍA		1ºDAW
import java.util.Scanner;

public class JuegoOca {

	public static void main(String[] args) {

		// La posada es la R de reposo y el pozo es el A de agua
		String tablero = "SSNNNOPNNONNPNONNNORNNNONNDONNNAONNNONNNNOLNNONNNNONCDONNNMONNNF";
		int posini = 0;
		int dado = 0;
		int posicion = 0;
		int casillasRestantes = 0;
		boolean juegoTerminado = false;
		final char Oca = 'O'; // de oca a oca y tiro porque me toca
		final char Puente = 'P'; // de puente a puente y tiro porque me lleva la corriente
		final char DadoTablero = 'D'; // de dado a dado
		final char Laberinto = 'L'; // a la casilla 30
		final char Posada = 'R'; // se espera un turno
		final char Carcel = 'C'; // dos turnos sin jugar
		final char Calavera = 'M'; // hay que volver a la casilla 1
		final char Pozo = 'A'; // Se pierden dos turnos.
		final char UltCasilla = 'F'; // Ultima casilla

		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------------");
		System.out.println("JUEGO DE LA OCA");
		System.out.println("---------------\n");

		System.out.println("Posición inicial: " + posini);

		do {
			System.out.print("Indique el valor del dado: ");
			dado = sc.nextInt();
			while (dado <= 0 || dado > 6) {
				System.out.println("El valor introducido no es correcto.");
				System.out.print("Introduzca de nuevo el valor del dado: ");
				dado = sc.nextInt();
			}

			posicion += dado;
			
			if (posicion > 63) {
				casillasRestantes = posicion - tablero.indexOf(UltCasilla);
				casillasRestantes = tablero.indexOf(UltCasilla) - casillasRestantes;
				posicion = casillasRestantes;
			}
			System.out.println(">Vaya a la casilla número " + posicion);

			char letra = tablero.charAt(posicion);

			switch (letra) {
			case Oca:
				int posOca = tablero.indexOf(Oca, posicion + 1);
				if (posOca != -1) {
					posicion = posOca;
					System.out.println(">De oca a oca y tiro porque me toca. Vaya a la casilla número " + posicion);
					break;
				}
				if (posicion == 59) {
					System.out.println(">De oca a oca y tiro porque me toca. Vaya a la casilla número " + tablero.indexOf(UltCasilla));
					posicion = tablero.indexOf(UltCasilla);
					if (posicion == 63) {
						System.out.println(">Enhorabuena! Has ganado el juego!");
						juegoTerminado = true;
					}
				}
				break;
			case Puente:
				if (posicion == 6) {
					posicion = tablero.indexOf(Puente, posicion + 1);
					System.out.println(">De puente a puente y me lleva la corriente, vaya a la casilla número " + posicion);
					break;
				}
				if (posicion == 12) {
					posicion = 6;
					System.out.println(">De puente a puente y me lleva la corriente, vaya a la casilla número " + posicion);
					break;
				}
				break;
			case Posada:
				int posPosada = tablero.indexOf(Posada);
				if (posPosada != -1) {
					System.out.println(">¡Has perdido el turno por caer en la posada!");
					posicion = posPosada;
				}
				break;
			case DadoTablero:
				if (posicion == 26) {
					posicion = tablero.indexOf(DadoTablero, posicion + 1);
					System.out.println(">De dado a dado y tiro porque me ha tocado, vaya a la casilla número " + posicion);
					break;
				}
				if (posicion == 53) {
					posicion = 26;
					System.out.println(">De dado a dado y tiro porque me ha tocado, vaya a la casilla número "+posicion);
					break;
				}
				break;
			case Pozo:
				int posPozo = tablero.indexOf(Pozo);
				if (posPozo != -1) {
					System.out.println(">¡Has perdido 2 turnos por caer en el pozo!");
					posicion = posPozo;
				}
				break;
			case Laberinto:
				int posLaberinto = tablero.indexOf(Laberinto);
				if (posLaberinto != -1) {
					System.out.println(">Oh, has caido en el laberinto! Del laberinto a la casilla 30.");
					posicion = 30;
				}
				break;
			case Carcel:
				int posCarcel = tablero.indexOf(Carcel);
				if (posCarcel != -1) {
					System.out.println(">¡Has perdido 2 turnos por caer en la carcel!");
					posicion = posCarcel;
				}
				break;
			case Calavera:
				int posCalavera = tablero.indexOf(Calavera);
				if (posCalavera != -1) {
					System.out.println(">Has caído en la calavera. Retrocede hasta la casilla 1.");
					posicion = 1;
				}
				break;
			case UltCasilla:
				int posUltima = tablero.indexOf(UltCasilla);
				if (posUltima != -1) {
					System.out.println(">Enhorabuena! Has ganado el juego!");
					posicion = posUltima;
					juegoTerminado = true;
				}
				break;
			}
		} while (!juegoTerminado);
		
		sc.close();
	}
}
