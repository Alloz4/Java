import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe tres n�meros: ");

		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("El n�mero mayor es: " + num1);
			} else {
				System.out.println("El n�mero mayor es: " + num3);
			}
		} else {
			if (num2 > num3) {
				System.out.println("El n�mero mayor es: " + num2);
			} else {
				System.out.println("El n�mero mayor es: " + num3);
			}
		}
	}

}
