import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int num4;
		int suma;
		float media;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce 4 números: ");

		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();

		suma = num1 + num2 + num3 + num4;

		System.out.println("El resultado de la suma es: " + suma);

		media = suma / 4f;
		
		System.out.println("La media es: "+media);
	}

}
