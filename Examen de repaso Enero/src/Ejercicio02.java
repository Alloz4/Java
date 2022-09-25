import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		int numero = 0;
		int contnum = 0;
		int contpares = 0;
		int contimpares = 0;
		int sumapares = 0;
		int sumaimpares = 0;
		double mediapares = 0;
		double mediaimpares = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número: ");

		numero = sc.nextInt();

		while (numero != 0) {
			if (numero % 2 == 0) {
				contpares++;
				sumapares += numero;
			} else {
				contimpares ++;
				sumaimpares += numero;
			}
			contnum ++;
			numero = sc.nextInt();
		}

		mediapares = sumapares / contpares;
		mediaimpares = sumaimpares / contimpares;
		
		System.out.println("El número total de valores introducidos es: "+contnum);
		if (mediapares > mediaimpares) {
			System.out.println("La media mayor es la de los números pares: " + mediapares);
			System.out.println("La media menor es la de los números impares: " + mediaimpares);
		} else {
			System.out.println("La media mayor es la de los números impares: " + mediaimpares);
			System.out.println("La media menor es la de los números pares: " + mediapares);
		}
	}
}
