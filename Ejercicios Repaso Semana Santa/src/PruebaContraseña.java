import java.util.Scanner;

public class PruebaContraseña {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Indica un tama�o para el array de contrase�as: ");
		int tamaño = sc.nextInt();

		Password contraseñas[] = new Password[tamaño];
		boolean fortalezaContraseña[] = new boolean[tamaño];
		System.out.println("VALOR	   	FUERTE");
		System.out.println("");
		for (int i = 0; i < contraseñas.length; i++) {
			contraseñas[i] = new Password();
			fortalezaContraseña[i] = contraseñas[i].esFuerte();
			System.out.println(contraseñas[i].getContraseña() + "   " + fortalezaContraseña[i]);
		}
	}
}
