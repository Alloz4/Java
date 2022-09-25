import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		int num1;
		int num2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe dos números: ");

		num1 = sc.nextInt();
		num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("El número mayor es: " + num1);
		} else {
			System.out.println("El número mayor es: " + num2);
		}
	}

}
