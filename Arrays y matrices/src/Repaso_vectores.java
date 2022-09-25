import java.util.Arrays;
import java.util.Scanner;

public class Repaso_vectores {
	static Scanner sc;

	public static void main(String[] args) {
		int t1[];
		int t2[];

		Scanner sc = new Scanner(System.in);

		t1 = new int[4];
		t2 = new int[6];

		// Para rellenar las tablas con un bucle FOR:

		for (int i = 0; i < t1.length; i++) {
			System.out.print("Introduce valor para la posici�n " + (i + 1) + " en la tabla 1: ");
			t1[i] = sc.nextInt();
		}

		for (int i = 0; i < t2.length; i++) {
			System.out.print("Introduce valor para la posici�n " + (i + 1) + " en la tabla 2: ");
			t2[i] = sc.nextInt();
		}

		// Para mostrar el contenido de la tabla con un bucle FOR:

		/*
		 * for (int i = 0; i < t1.length; i++) {
		 * System.out.print("Contenido de la tabla: "+t1[i]+" "); }
		 * 
		 * for (int i = 0; i < t2.length; i++) {
		 * System.out.print("Contenido de la tabla: "+t2[i]+" "); }
		 */

		// Para mostrar el contenido de la tabla con una funci�n de java
		// [Arrays.toString()]

		System.out.println("Contenido de la tabla 1: ");
		System.out.println(Arrays.toString(t1));

		System.out.println("Contenido de la tabla 2: ");
		System.out.println(Arrays.toString(t2));

		// Para ordenar las tablas utilizamos la funci�n toSort:

		System.out.println("Contenido de la tabla 1 ordenada:");

		Arrays.sort(t1);
		System.out.print(Arrays.toString(t1) + "\n");

		System.out.println("Contenido de la tabla 2 ordenada:");

		Arrays.sort(t2);
		System.out.println(Arrays.toString(t2) + "\n");

		// Para sumar las tablas hacemos la funci�n de abajo:

		System.out.println("Tabla 1 + Tabla 2: ");
		System.out.println(Arrays.toString(sumaTablas(t1, t2)));

	}

	static int[] sumaTablas(int tabla1[], int tabla2[]) {
		int tsuma[];
		int tamaño = 0;
		if (tabla1.length > tabla2.length) {
			tamaño = tabla1.length;
		} else {
			tamaño = tabla2.length;
		}

		tsuma = new int[tamaño];

		for (int i = 0; i < tamaño; i++) {
			int suma = 0;
			if (i < tabla1.length) {
				suma += tabla1[i];
			}
			if (i < tabla2.length) {
				suma += tabla2[i];
			}

			tsuma[i] = suma;
		}

		return tsuma;
	}
}
