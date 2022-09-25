import java.util.Scanner;

public class Ejercicio02B {

	public static void main(String[] args) {
		int tamaño;

		Scanner sc = new Scanner(System.in);

		System.out.print("Tama�o de la muralla: ");
		tamaño = sc.nextInt();

		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= tamaño * 5 - 1; j++) {
				if (i == 1 || i == 2) {
					if (j % 5 == 0) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
