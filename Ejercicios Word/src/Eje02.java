
// Escribir un programa que solicite la edad y muestre el valor de su edad expresado en d�as.
import java.util.Scanner;

public class Eje02 {

	public static void main(String[] args) {
		int edad;
		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe la edad: ");

		edad = sc.nextInt();
		System.out.println("T� edad en d�as es " + (edad * 365));
	}

}
