import java.util.Scanner;

public class Eje03 {

	public static void main(String[] args) {
		// 3. Leer 10 números , almacenarlos en una tabla y mostrar primero las
		// posiciones pares y después la impares.

		Scanner sc = new Scanner(System.in);

		int[] tabla = new int[10];

		for (int i = 0; i < tabla.length; i++) {
			System.out.print("El valor del numero " + i + ": ");
			tabla[i] = sc.nextInt();
		}
		System.out.println(" ");
		System.out.println("Posiciones pares \n");
		for (int i = 0; i < tabla.length; i+=2) {
			if (i % 2 == 0) {
				System.out.println("El valor del numero " + i + ": " + tabla[i]);
			}
		}
		System.out.println(" ");
		System.out.println("Posiciones impares \n");
		for (int i = 0; i < tabla.length; i++) {
			if (i % 2 != 0) {
				System.out.println("El valor del numero " + i + ": " + tabla[i]);			}
		}
	}
}
