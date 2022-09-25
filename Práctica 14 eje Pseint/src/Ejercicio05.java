import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		int num1;
		int num2;
		char operador;
		int resultado=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe dos números y una operación: ");

		num1 = sc.nextInt();
		num2 = sc.nextInt();
		operador = sc.next().charAt(0);

		switch (operador) {
		case '+': {
			resultado = num1 + num2;
			break;
		}
		case '-': {
			resultado = num1 - num2;
			break;
		}
		case '*': {
			resultado = num1 * num2;
			break;
		}
		case '/': {
			resultado = num1 / num2;
			break;
		}
		}

		System.out.println("El resultado es: " + resultado);
	}

}
