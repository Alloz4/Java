import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		int n;
		int num;
		int contador;
		int suma = 0;
		float media;

		Scanner sc = new Scanner(System.in);

		System.out.println("Número de valores a leer: ");

		n = sc.nextInt();

		System.out.println("Escribe los valores: ");

		for (contador = 1; contador <= n; contador++) {
			num = sc.nextInt();
			suma = suma + num;
		}

		media = (float) suma / n;

		System.out.println("Suma = " + suma);
		System.out.println("La media = " + media);
	}

}
