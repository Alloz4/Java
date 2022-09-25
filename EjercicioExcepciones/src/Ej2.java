import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej2 {
	static Scanner sc;

	public static void main(String[] args) {

		int num1;
		int num2;
		int resu = 0;
		char operador;
		boolean error = false;

		sc = new Scanner(System.in);

		System.out.print("Introduce valor 1: ");
		num1 = leerValor(sc);
		System.out.print("Introduce valor 2: ");
		num2 = leerValor(sc);
		System.out.print("Introduce el operador: ");
		sc.nextLine();
		operador = sc.nextLine().charAt(0);

		switch (operador) {
		case '+':
			resu = num1 + num2;
			break;
		case '-':
			resu = num1 - num2;
			break;
		case '*':
			resu = num1 * num2;
			break;
		case '/':
			try {
				resu = num1 / num2;
			} catch (Exception e) {
				System.out.println("Error: no se puede dividir por 0.");
				error = true;
			}
			break;
		default:
			System.out.println("Operador erroneo.");
			error = true;
		}
		if (!error) {
			System.out.println("Resultado: "+resu);
		}
	}

	public static int leerValor(Scanner sc) {
		int num = 0;
		boolean error = false;
		do {
			error = false;
			try {
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				error = true;
				sc.next();
				System.out.println("Número erroneo");
			}
		} while (error == true);

		return num;

	}

}
