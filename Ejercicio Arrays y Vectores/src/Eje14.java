import java.util.Scanner;

public class Eje14 {
	static Scanner sc;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tabla[] = new int[5];

		for (int i = 0; i < tabla.length; i++) {
			System.out.print("-Introduce un numero para el valor " + (i+1) + ": ");
			tabla[i] = sc.nextInt();
		}
		System.out.println("Valores de la tabla: ");
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i] + ":");
			for (int j = 1; j <= tabla[i]; j++) {
				System.out.print("*");
			}
		System.out.println("");
		}

	}

}
