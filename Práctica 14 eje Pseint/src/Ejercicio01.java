import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int suma;

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe dos n�meros: ");

		num1 = sc.nextInt();
		num2 = sc.nextInt();

		suma = (num1 + num2);

		System.out.println("La suma de los dos n�meros es: " + suma);
	}

}
