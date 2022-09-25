import java.util.Arrays;
import java.util.Scanner;

public class Eje17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char tabla[] = new char [20];
		
		System.out.println("Introduce 20 caracteres: ");
		
		for (int i = 0; i < tabla.length; i++) {
			tabla[i]=sc.next().charAt(0);
		}
		Arrays.sort(tabla);
		System.out.println("Tabla de caracteres ordenada:");
		System.out.println(tabla);
	}

}
