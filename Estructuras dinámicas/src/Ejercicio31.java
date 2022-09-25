import java.util.Scanner;

public class Ejercicio31 {
	public static void main(String args[]) {
		ListaCadenas lista = new ListaCadenas();

		String linea;
		Scanner sc = new Scanner(System.in);
		linea = sc.nextLine();
		while (linea.compareTo("FIN") != 0) {
			lista.ponAlPrincipio(linea);
			linea = sc.nextLine();
		}
		System.out.println(lista);
	}
}
