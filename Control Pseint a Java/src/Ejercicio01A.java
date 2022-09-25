import java.util.Scanner;

public class Ejercicio01A {

	public static void main(String[] args) {
		int num1, num2, num3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introducir tres números: ");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		System.out.print(num1+":");
		for (int i = 0; i <=num1; i++) {
			System.out.print("-");
		}
		System.out.println(">");
		
		System.out.print(num2+":");
		for (int i = 0; i <= num2; i++) {
			System.out.print("-");
		}
		System.out.println(">");
		
		System.out.print(num3+":");
		for (int i = 0; i <= num3; i++) {
			System.out.print("-");
		}
		System.out.println(">");
	}

}
