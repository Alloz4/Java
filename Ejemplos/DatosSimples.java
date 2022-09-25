/* Ejercicio de prueba de
 * datos simples o primitivos 
 */

public class DatosSimples {
	
	public static  void  main (String args[]) {
		byte  numb10 = 10;  // Byte (8)
		byte  numb16 = 0x0A; // Byte valor expresado en hexadecial
		byte  numb2  = 0b1010;
		short nums = 10500;  // Entero corto  (16)
		int   numi = 12400005;  // Entero normal (32)
		long  numl = 599398400003L;  // Entero largo  (64)
		float numf1 = 100.23f;     // Real normal
		float numf2 =  1.0023e2f;   // Real normal expresado con exponente
		double numd = 2e11;  // Doble 200.000.000.000. Estrellas en la via láctea
		char  letra = 'A';   // caracter
		String mensaje = "Hola";  // Cadena de caracteres
		boolean valor = true;
		
		System.out.println(numb10 );
		System.out.println(numb16 );
		System.out.println(numb2);
		System.out.println(nums  );
		System.out.println(numi  );
		System.out.println(numl  );
		System.out.println(numf1 );
		System.out.println(numf2 );
		System.out.println(numd  );
		System.out.println(letra );
		System.out.println(mensaje);
		System.out.println(valor);
		
	}
}

