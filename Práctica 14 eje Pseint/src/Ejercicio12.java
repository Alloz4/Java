import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		int cont = 0;
		int suma = 0;

		Scanner sc = new Scanner(System.in);
		
		for (cont = 1; cont <=30; cont++) {
			if (cont % 2==0) {
				suma += cont;
			}
		}
		System.out.println("Suma= "+suma);
		
	}

}
