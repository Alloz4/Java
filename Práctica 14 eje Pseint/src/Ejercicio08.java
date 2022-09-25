import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		int num;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introducir números entre 10 y 100:");
			num = sc.nextInt();
		} while (num < 10 || num > 100);
		System.out.println("El número es: " + num);
	}
}
