import java.util.Scanner;

/*
Realizar	un	programa	en	Java	que	muestre	por	pantalla	en	una	cadena	de	
caracteres	 sin	 salto	 de	 línea que	 ponga:	 “Escribe_tu_nombre: “.	 A	
continuación	 debe	 aparecer	 una	 línea	 con	 salto	 de	 línea	 que	 ponga:	
“bienvenido	 al	 mundo	 Java!”.	 Pon	 comentarios	 sobre	 la	 diferencia	 del	
funcionamiento	de	las	sentencias	que	hayas	utilizado.
 */
public class Ejercicio05 {

	public static void main(String[] args) {
		String nombre;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe tu nombre: ");
		
		nombre = sc.next();
		
		System.out.println("¡"+nombre+" bienvenido al mundo Java!");
	}

}
