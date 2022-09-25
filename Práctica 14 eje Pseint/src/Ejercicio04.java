import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int max;
		int min;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tres números: ");

		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if (num1 > num2) {
			if (num1 > num3) {
				max = num1;
				if (num2 > num3) {
					min = num3;
				} else {
					min = num2;
				}
			} else {
				max = num3;
				min = num2;
			}
		} else {
			if (num2 > num3) {
				max = num2;
				if (num1 > num3) {
					min = num3;
				} else {
					min = num1;
				}
			} else {
				max = num3;
				min = num1;
			}
		}
		System.out.println("El mayor es: " + max);
		System.out.println("El menor es: " + min);
	}
}
