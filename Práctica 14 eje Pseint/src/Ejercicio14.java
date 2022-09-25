import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		int desc;
		int km;
		char dia;
		double precio;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introducir km: ");

		km = sc.nextInt();

		System.out.println("Introducir tipo de día [F o L]");

		dia = sc.next().charAt(0);

		desc = 0;

		if (km >= 80) {
			desc += 15;
		}
		if (dia == 'F') {
			desc += 5;
		}
		precio = km * 0.30;
		precio = precio - (precio * desc) / 100;
		System.out.println("El precio es: " + precio);
	}

}
