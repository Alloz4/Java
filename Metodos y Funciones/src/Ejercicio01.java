// Función de una tabla de multiplicar.
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Indica el número: ");
		int valor = sc.nextInt();
		mostrarTablaMultiplicar(valor);
	}
	public static void mostrarTablaMultiplicar(int num) {
		System.out.println("TABLA DE MULTIPLICAR DE Nº" + num);
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + i * num);
		}
	}
}
