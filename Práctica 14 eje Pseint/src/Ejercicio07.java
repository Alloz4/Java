import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		char letra;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Procesando datos... Desea continuar (s/n) ");
			letra = sc.nextLine().charAt(0);
		} while (letra != 'n' && letra!='N');
		System.out.println("Adiós");
	}

}
