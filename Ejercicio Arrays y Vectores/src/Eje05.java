import java.util.Scanner;

public class Eje05 {

	public static void main(String[] args) {
		// 5. Leer 20 número, y calcular el porcentaje de valores que supera el valor de
		// la media

		Scanner sc = new Scanner(System.in);

		int[] tabla = new int[5];

		int sumatorio = 0;
		int supera = 0;
		double porcentaje;
		double media;

		for (int i = 0; i < tabla.length; i++) {
			System.out.print("Introduce un valor en " + (i + 1) + ": ");
			tabla[i] = sc.nextInt();
			sumatorio += tabla[i];
		}
		media = sumatorio / tabla.length;
		System.out.println("La media de todos los valores es: " + media);
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i]>media) {
				supera++;
			}
		}
		porcentaje = (supera*media)/100;
		System.out.println(supera);
		System.out.println("El porcentaje de los valores que superan la media: "+porcentaje);
		
	}
}
