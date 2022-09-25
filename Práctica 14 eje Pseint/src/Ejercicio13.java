import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		int pasos;
		double importe;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Numero de pasos: ");
			pasos = sc.nextInt();
		} while (pasos < 0);
		importe = pasos * 0.10;
		if (pasos > 1000) {
			importe = importe - (importe * 18) / 100;

		}
		System.out.println("El importe es: " + importe);
	}
}
