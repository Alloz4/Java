import java.util.Scanner;

/*
Realizar	un	programa	en	Java	que	muestre	por	pantalla	en	una	cadena	de	
caracteres	 sin	 salto	 de	 l�nea que	 ponga:	 �Escribe_tu_nombre: �.	 A	
continuaci�n	 debe	 aparecer	 una	 l�nea	 con	 salto	 de	 l�nea	 que	 ponga:	
�bienvenido	 al	 mundo	 Java!�.	 Pon	 comentarios	 sobre	 la	 diferencia	 del	
funcionamiento	de	las	sentencias	que	hayas	utilizado.
 */
public class Ejercicio05 {

	public static void main(String[] args) {
		String nombre;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe tu nombre: ");
		
		nombre = sc.next();
		
		System.out.println("�"+nombre+" bienvenido al mundo Java!");
	}

}
