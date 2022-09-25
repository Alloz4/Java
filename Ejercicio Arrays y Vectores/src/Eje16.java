import java.util.Scanner;

public class Eje16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t1[] = new int[10];
		int t2[] = new int[10];

		for (int i = 0; i < t1.length; i++) {
			System.out.print("-Introduce un número en la Tabla 1 para el valor " + (i + 1) + ": ");
			t1[i] = sc.nextInt();
		}
		for (int i = 0; i < t1.length; i++) {
			if (t1[i] % 2 == 0) {
				t2[i] = t1[i];
			}
		}
		System.out.println("Valores pares introducidos en la Tabla 2:");
		for (int i = 0; i < t2.length; i++) {
			if (t2[i] != 0) {
				System.out.print(t2[i] + " ");
			}
		}
	}

}
