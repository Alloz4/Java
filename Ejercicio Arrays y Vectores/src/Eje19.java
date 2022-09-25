import java.util.Iterator;
import java.util.Scanner;

public class Eje19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tabla[] = new int[10];

		int contador = 0;
		int contdivisible = 0;
		int valor = 0;

		System.out.println("Introducir números y terminar con el valor 0: ");

		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = sc.nextInt();
			contador++;
			if (tabla[i] == 0) {
				break;
			}
			if (tabla[i] % 3 == 0) {
				contdivisible++;
			}
		}
		System.out.println("Números introducidos: " + contador);
		System.out.println("Números divisibles entre 3: " + contdivisible);
		System.out.println("Valores: ");
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] % 3 == 0 && tabla[i] != 0) {
				System.out.print(tabla[i] + " ");
			}
		}
	}

}
