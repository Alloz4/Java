import java.util.Scanner;

public class Menú {
	public static void main(String[] args) {
		int numero;
		int conthola = 0;
		int contadios = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("MEN� SALUDOS Y DESPEDIDAS");
			System.out.println("1.- Saludar");
			System.out.println("2.- Despedirse");
			System.out.println("3.- Terminar");
			System.out.print("Elegir opci�n[1-3]:");
			numero = sc.nextInt();
			switch (numero) {
				case 1:
					System.out.println("Hola");
					conthola++;
					break;
				case 2:
					System.out.println("Adi�s");
					contadios++;
					break;
				case 3:
					System.out.println("Total de saludos:" + conthola);
					System.out.println("Total de despedidas:" + contadios);
					System.out.println("Fin del programa");
					break;
				default:
					System.out.println("Opci�n err�nea");
					System.out.println("Intentelo de nuevo...");
					break;
			}
		} while (numero != 3);
	}
}
