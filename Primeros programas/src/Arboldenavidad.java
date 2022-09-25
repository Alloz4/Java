import java.util.Scanner;

public class Arboldenavidad {
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		int i, j, k, n;
		System.out.print("Escribe un número: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (i = 1; i < n + (n / 2); i++) {
			for (j = n + (n / 2); j > i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (i = 1; i < n - (n / 2); i++) {
			for (j = n + (n / 2); j > 1; j--) {
				System.out.print(" ");
			}
			for (k = n / 2; k <= (n / 2) + 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
