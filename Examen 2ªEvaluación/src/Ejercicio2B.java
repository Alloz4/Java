import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2B {

	public static void main(String[] args) {
		int tabla[] = { 10, 34, 3, 5, 7, 8, 10 };
		int valor = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un valor: ");
		valor = sc.nextInt();

		añadirValor(tabla, valor);

	}

	public static void añadirValor(int tabla[], int valor) {
		int array[] = new int[tabla.length];
		array[0] = valor;
		for (int i = 1; i < tabla.length; i++) {
			array[i] = tabla[i - 1];
		}
		System.out.println(Arrays.toString(array));
	}
}
