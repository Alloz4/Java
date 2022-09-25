import java.util.Scanner;

public class Eje04 {

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe un número: ");
		numero = sc.nextInt();
		while (numero < 1 || numero > 10) {
			System.out.print("Escribe un número entre el 1 y el 10: ");
			numero = sc.nextInt();
		}
		for (int i = 1; i <= numero; i++) {
			for (int j = 1; j <= numero; j++) {
				System.out.print(j);
				if (j != numero) {
					System.out.print("-");
				}
			}
			System.out.println(" ");
		}

	}

}
