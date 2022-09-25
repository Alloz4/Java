import java.util.Scanner;

public class Ejercicio04B {

	public static void main(String[] args) {
		int contbebida, contcomida;
		int num;

		contbebida = 0;
		contcomida = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("1.- Beber");
			System.out.println("2.- Comer");
			System.out.println("3.- Terminar");
			System.out.print("Elegir opción[1-3]: ");
			
			num = sc.nextInt();
			
			switch (num) {
			case 1:
				System.out.println("Vino");
				contbebida += 1;
				break;
			case 2:
				System.out.println("Jamón");
				contcomida += 1;
				break;
			case 3:
				System.out.println("Total de bebidas: " + contbebida);
				System.out.println("Total de comidas: " + contcomida);
				break;
			default:
				System.out.println("Opción errónea.");
				break;
			}
		} while (num != 3);
		System.out.println("Fin del programa.");
	}

}
