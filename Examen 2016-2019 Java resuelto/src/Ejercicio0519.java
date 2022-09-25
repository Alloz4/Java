import java.util.Scanner;

public class Ejercicio0519 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Indica el tamaño del cuadrado: ");
		num = sc.nextInt();
		if (num <= 0) {
			System.out.println("El cuadrado no puede ser del tamaño indicado.");
			System.out.print("Indica el tamaño del cuadrado: ");
			num = sc.nextInt();
		}
		int contador = 0;
		
		for (int i = 1; i <= num*2+1; i++) {
			for (int j = 1; j <=num*2+1; j++) {
				if (contador%2==0) {
					System.out.print("+");
				}else {
					System.out.print("-");
				}
				contador++;
			}
		System.out.println("");	
		}
	}
}
