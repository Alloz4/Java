import java.util.Scanner;

public class Ejercicio0619 {

	public static void main(String[] args) {
		int cont = 0;
		char letra;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe letras o caracteres:");
		do {
			letra = sc.next().charAt(0);
			if (letra == '6') {
				cont++;
			} else {
				cont = 0;
			}
		} while (cont!=3);
		System.out.println(">El número de la bestia.");
	}

}
