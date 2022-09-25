
public class Ejercicio01a {

	public static void main(String[] args) {
		String cadena = "Hola Pepe Luis";
		System.out.print("Cadena: ");
		System.out.println(cadena);
		System.out.print("Cadena sin vocales: ");
		System.out.println(quitarVocales(cadena));
	}

	// Se puede hacer de las dos formas:

	public static String quitarVocales(String parametro) {
		// String cadenaconsonantes = parametro.replaceAll("[a,e,i,o,u]", "");
		String cadenaconsonantes = "";

		for (int i = 0; i < parametro.length(); i++) {
			if (parametro.charAt(i) != 'a' && parametro.charAt(i) != 'e' && parametro.charAt(i) != 'i'
					&& parametro.charAt(i) != 'o' && parametro.charAt(i) != 'u') {
				cadenaconsonantes += parametro.charAt(i);
			}
		}

		return cadenaconsonantes;
	}
}
