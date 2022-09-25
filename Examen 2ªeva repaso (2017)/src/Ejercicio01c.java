public class Ejercicio01c {
	public static void main (String args[]) {
	
		System.out.println(superEco("Hello", 5));
		System.out.println(superEco("Adios", 5));
	}
	
	public static String superEco(String cadena, int veces) {

		String nuevo = "";
		if (veces <= 0) {
			return "";
		} else {
			for (int i = 0; i < veces; i++) {
				nuevo += cadena;
			}
			return nuevo;
		}
	}
}
