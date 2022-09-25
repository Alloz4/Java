import java.util.Scanner;

public class Ejercicio03B {

	public static void main(String[] arg) {
		int num, resultado;
		int potencia;

		resultado = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe números, para terminar utiliza -1: ");

		num = sc.nextInt();

		potencia = 1;

		while (num >= 0) {
			resultado += num * potencia;
			potencia = potencia * 10;
			num = sc.nextInt();
		}
		System.out.println("Valor final: " + resultado);
	}
}
