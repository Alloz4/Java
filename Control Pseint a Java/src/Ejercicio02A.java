import java.util.Scanner;

public class Ejercicio02A {

	public static void main(String[] args) {
		int num;
		int digito;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe un número: ");
		num = sc.nextInt();

		while (num > 0) {
			digito = num - (num / 10) * 10;
			System.out.println(digito);
			num = num / 10;
		}
	}
}
