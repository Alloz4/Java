import java.util.Scanner;

public class busqueda_tabla_ordenada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tabla[] = { 1, 2, 3, 7, 10, 15, 24, 28, 30, 35, 40 };
		int valor;
		System.out.print("Introduce un valor: ");

		valor = sc.nextInt();

		int pos = buscarTablaOrd(tabla, valor);

		if (pos >= 0) {
			System.out.println("El valor está en la tabla en la posición: "+pos);
		} else {
			System.out.println("El valor no está en la tabla.");
		}

	}

	public static int buscarTablaOrd(int t[], int num) {
		int aux = -1;
		for (int i = 0; i < t.length; i++) {
			if (num <= t[i]) {
				if (num == t[i]) {
					aux = i;
					break;
				}
			}
		}
		return aux;
	}
}
