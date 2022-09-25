import java.util.Scanner;

public class Eje07 {

	public static void main(String[] args) {
		int numero;
		int contador = 0;
		float sumanum = 0;
		int entre3y5 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un numero:");
		numero = sc.nextInt();

		while (numero != 0) {
			sumanum += numero;
			contador++;
			if ((numero % 3 == 0) || (numero % 5 == 0)) {
				entre3y5++;
			}
			numero = sc.nextInt();
		}
		System.out.println("Media del total de los números introducidos: " + sumanum / contador);
		System.out.println("Cantidad de números que han sido divisibles entre 3 y 5: " + entre3y5);
	}
}
