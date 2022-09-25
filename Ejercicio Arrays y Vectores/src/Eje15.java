import java.util.Scanner;

public class Eje15 {
	static Scanner sc;
	public static void main(String[] args) {

		int tabla[];
		tabla = new int[100];

		int valor;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un valor: ");
		valor = sc.nextInt();

		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = 0;
		}
		while (valor != 0) {
			// Anotar el valor
			tabla[valor - 1]++;
			valor = sc.nextInt();
		}
		// Mostrar el histograma
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] > 0) {
				System.out.print(i+1+":");
				for (int j = 1; j <= tabla[i]; j++) {
					System.out.print("*");
				}
			System.out.println("");
			}
		}
	}
}

