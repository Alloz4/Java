import java.util.Scanner;

public class Eje09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] lista = new int[10];
		int i;
		boolean ordenado = true;
		System.out.println("Introduce los números del vector: ");
		for (i = 0; i < 10; i++) {
			System.out.print(" - Introduce un valor en " + i + ": ");
			lista[i] = sc.nextInt();
		}
		for (i = 0; i < lista.length-1; i++) {
				if (lista[i] > lista[i + 1]) {
					ordenado = false;
					break;
				}
		}
		if (ordenado) {
			System.out.println("La lista está ordenada");
		} else {
			System.out.println("La lista está desordenada");
		}
	}
}
