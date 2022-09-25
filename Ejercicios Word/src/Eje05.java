import java.util.Scanner;

public class Eje05 {

	public static void main(String[] args) {
		int cont; // contador
		int pot; // numero potencias
		int num = 1;
		Scanner sc = new Scanner(System.in);

		System.out.print("¿Cuántas potencias quieres que aparezcan? ");
		pot = sc.nextInt();

		System.out.print("Las " + pot + " potencias del número 2 son: ");

		for (cont = 1; cont <= pot; cont++) {

			num = num * 2;

			System.out.print(" " + num);
		}
	}
}
