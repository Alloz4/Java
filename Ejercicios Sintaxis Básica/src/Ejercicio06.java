
/*
Escribir una escalera.
 */
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		int tamaño;

		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe la altura de la escalera: ");

		tamaño = sc.nextInt();

		for (int i = 1; i <= tamaño; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
