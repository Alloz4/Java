import java.util.Scanner;

public class Eje02 {
	public static void main(String[] args) {
		// Leer 10 n�meros, almacenarlos en una tabla y mostrarlos en orden inverso.
		Scanner sc = new Scanner(System.in);

		int[] tabla = new int[10];

		System.out.println("Lectura de los n�meros y almacenamiento en la tabla: ");
		System.out.println(" ");

		// Con este bucle almaceno los datos y los leo

		for (int i = 0; i < tabla.length; i++) {
			System.out.print("Introducir un n�mero para el valor " + i + ": ");
			tabla[i] = sc.nextInt();
		}
		
		System.out.println(" ");
		// Para invertir un tabla

		for (int i = tabla.length - 1; i >= 0; i--) {
			System.out.println("El n�mero para el valor " + i + " es: " + tabla[i]);
		}
	}
}
