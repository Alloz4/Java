import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		int edad;
		String dni;
		int tlf;
		String correo;
		
		System.out.println("###########################################");
		System.out.println("Datos personales: ");
		System.out.print("Nombre y apellidos: ");
		nombre = sc.next();
		System.out.print("Edad: ");
		edad = sc.nextInt();
		System.out.print("DNI: ");
		dni = sc.next();
		System.out.print("Teléfono de contacto: ");
		tlf = sc.nextInt();
		System.out.print("Correo electrónico: ");
		correo = sc.next();
		System.out.println("-------------------------------------------");
		System.out.println("Datos académicos: ");
		System.out.println("Curso1");
		System.out.println("Curso2");
		System.out.println("Curso3");
		System.out.println("###########################################");
		
		
	}

}
