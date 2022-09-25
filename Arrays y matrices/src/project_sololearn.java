import java.util.Arrays;
import java.util.Scanner;

public class project_sololearn {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe algo, por favor");
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		char[] aux = new char[arr.length];
		int j = 0;
		
		for (int i = (arr.length-1); i >= 0; i--) {
			aux[j] = arr[i];
			j++;
		}
		System.out.println(Arrays.toString(aux));
	}

}
