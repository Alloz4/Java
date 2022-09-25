import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		int tabla[] = {10,5,5,6,7,5};
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int numero = sc.nextInt();
		
		System.out.println(anularValor(tabla, numero));
		System.out.println(Arrays.toString(tabla));
		
	}
	
	static int anularValor (int[] array, int num) {
		int cont = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				array[i] = 0;
				cont++;
			}
		}
		
		return cont;
	}

}
