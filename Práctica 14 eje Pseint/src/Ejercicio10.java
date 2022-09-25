import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int num;
		int cont = 0;
		int suma = 0;
		float media;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca la lista de números, terminando con el valor 0.");

		num = sc.nextInt();

		while (num != 0) {
			suma = suma + num;
			cont++;
			num = sc.nextInt();
		}
		media = (float) suma / cont;
		System.out.println("Suma= " + suma);
		System.out.println("Media= " + media);

	}

}
