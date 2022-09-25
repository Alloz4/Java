import java.util.Scanner;

public class Ejemplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		System.out.println("Escribe: ");
		nombre=sc.next();
		if (nombre.equals("Silvia")) {
			System.out.println("Bienvenida");
		} else {
			System.out.println("Quien eres");
		}

	}

}
