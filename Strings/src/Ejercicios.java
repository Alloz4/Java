
public class Ejercicios {

	// M�todo main que prueba las funciones

	static public void main(String arg[]) {

		String cadenatest = "hola pepe luis";
		System.out.println(" N� de vocales de '" + cadenatest + "': " + cuentaVocales2(cadenatest));

		cadenatest = "La gripe es un VIRUS, mas com�n que el VIRUS del Ebola";
		System.out.println(" La cadena VIRUS aparece " + buscarVIRUS(cadenatest) + " veces.");

		cadenatest = "Que calor";
		System.out.println(cadenatest + " --> sin vocales -->" + ocultaVocales(cadenatest));

		cadenatest = "El examen no parece dif�cil";
		System.out.println(
				" Recorta la cadena '" + cadenatest + "' posiciones 9, 11\n -->" + cortarCadena2(cadenatest, 9, 11));

		cadenatest = "abcdefghijklm";
		System.out.println(
				" Recorta la cadena '" + cadenatest + "' posiciones 3, 8\n-->" + cortarCadena(cadenatest, 3, 8));

		cadenatest = "El examen no parece dif�cil";
		System.out.println(
				" Recorta la cadena '" + cadenatest + "' posiciones 9, 11\n -->" + cortarCadena2(cadenatest, 9, 11));

		cadenatest = "abcdefghijklm";
		System.out.println(
				" Recorta la cadena '" + cadenatest + "' posiciones 3, 8\n-->" + cortarCadena(cadenatest, 3, 8));
		verCadenaSecreta("Tierra y Libertad", "aert");
		verCadenaSecreta("La estrategia del caracol", "aeiC");

		cadenatest = "hhoollaaaaPPeeeppeeHola";
		System.out.println(" Quitar repetidos :" + cadenatest + " :" + cadenaSinRepes(cadenatest));

	}
	// -----------------------------------
	// M�todos a Implementar
	// -----------------------------------

	// Primera manera de hacer ejercicio 1

	static public int cuentaVocales1(String parametro) {
		int cont = 0;
		for (int i = 0; i < parametro.length(); i++) {
			char letra = parametro.charAt(i);

			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'i' || letra == 'o' || letra == 'u') {
				cont++;
			}
		}

		return cont;
	}
	// Segunda manera de hacer ejercicio 1

	static public int cuentaVocales2(String parametro) {
		int cont = 0;
		for (int i = 0; i < parametro.length(); i++) {
			char letra = parametro.charAt(i);

			if ("aeiouAEIOU".indexOf(letra) >= 0) {
				cont++;
			}
		}

		return cont;
	}

	static public int buscarVIRUS(String parametro) {
		int veces = 0;
		int pos = parametro.indexOf("VIRUS");
		while (pos != -1) {
			veces++;
			pos = parametro.indexOf("VIRUS", pos + 1);
		}
		return veces;
	}

	// Version con String poco eficiente
	static public String ocultaVocales(String parametro) {
		String nueva = ""; // Creo una cadena vacia

		nueva = parametro.replaceAll("[a,e,i,o,u]", "*");
		return nueva;
	}

	// Haciendo uso de la libreria String
	static public String cortarCadena(String cadenaOrigen, int posini, int posfin) {
		String trozo1 = cadenaOrigen.substring(0, posini);
		String trozo2 = cadenaOrigen.substring(posfin);
		return trozo1 + trozo2;
	}

	static public String cortarCadena2(String cadenaOrigen, int posini, int posfin) {

		String resu = "";
		for (int i = 0; i < cadenaOrigen.length(); i++) {
			if (i > posfin || i < posini) {
				resu += cadenaOrigen.charAt(i);
			}
		}
		return resu;
	}

	static public void verCadenaSecreta(String cadena, String listaletras) {

		cadena = cadena.replaceAll("[listaletras]", "-");
		System.out.println(cadena);

	}

	static public boolean esCapicua(String cadena) {
		return false;
	}

	static public String ponEco(String Palabra, int nveces) {
		return "No IMPLEMENTADA";
	}

	static public String borrarUltimos(String Palabra, int num) {
		return "No IMPLEMENTADA";
	}

	static public String quitarLetra(String Palabra, char Letra) {
		return "No IMPLEMENTADA";
	}

	static public int esSeguraLaContraseña(String cadena) {
		return 0;
	}

	static public String cadenaSinRepes(String cadena) {
		return "NO IMPLEMENTADA";
	}

}