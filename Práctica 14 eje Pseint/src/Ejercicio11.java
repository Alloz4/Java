import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		int num, max, min;
		int cont = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introducir 200 números: ");
		num = sc.nextInt();
		max = num;
		min = num;

		for (cont = 2; cont <= 200; cont++) {
			num = sc.nextInt();
			if (num > max) {
				max = num;
			} else {
				if (num < min) {
					min = num;
				}
			}
		}
		System.out.println("El máximo es: " + max);
		System.out.println("El mínimo es: " + min);
	}

}
