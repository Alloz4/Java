import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		int letraopcion;
		int contholas, contadios;

		Scanner sc = new Scanner(System.in);

		contholas = 0;
		contadios = 0;

		do {
			System.out.println("1.- Saludar");
			System.out.println("2.- Despedirse");
			System.out.println("3.- Terminar");
			System.out.print("Elegir opción[1-3]: ");

			letraopcion = sc.nextInt();
			switch (letraopcion) {
			case 1:
				System.out.println("Hola");
				contholas += 1;
				break;
			case 2:
				System.out.println("Adiós");
				contadios += 1;
				break;
			case 3:
				System.out.println("Total de saludos: " + contholas);
				System.out.println("Total de despedidas: " + contadios);
				break;
			default:
				System.out.println("Opción errónea");
				break;
			}
		} while (letraopcion != 3);
		System.out.println("Fin del programa.");
	}
}
