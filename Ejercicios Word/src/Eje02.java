
// Escribir un programa que solicite la edad y muestre el valor de su edad expresado en días.
import java.util.Scanner;

public class Eje02 {

	public static void main(String[] args) {
		int edad;
		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe la edad: ");

		edad = sc.nextInt();
		System.out.println("Tú edad en días es " + (edad * 365));
	}

}
