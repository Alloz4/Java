import java.util.Random;

public class Ej3 {

	public static void main(String[] args) {
		try {
			generarAleatorio();
		} catch (DevilException e) {
			System.out.println("Se ha procudido la excepción: " + e.getMessage());
		}
		System.out.println("¡FIN DEL PROGRAMA!");
	}

	public static void generarAleatorio() throws DevilException {
		Random rd = new Random();

		int num;
		int contador666 = 0;

		while (true) {
			num = rd.nextInt(10) + 1;
			if (num == 6) {
				contador666++;
				if (contador666 == 3) {
					throw new DevilException();
				}
			} else {
				contador666 = 0;
			}
		}
	}
}
