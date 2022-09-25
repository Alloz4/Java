import java.util.Scanner;

public class Ejercicio0616 {
	public static void main (String[] args) {
		int base = 0;
		int altura;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Escribe la base: ");
			base = sc.nextInt();
		} while (base<=2);
		do {
			System.out.print("Escribe la altura: ");
			altura = sc.nextInt();
		} while (altura<=2);

		for (int i = 1; i <= altura ; i++) {
			for (int j = 1; j <=base; j++) {
				if (i == 1 || i == altura ||j == 1 || j == base)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
