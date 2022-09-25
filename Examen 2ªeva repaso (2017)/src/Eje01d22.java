public class Eje01d22 {

	public static void main(String[] args) {
		String cadenas[] = {"Hola", "Pepe","Luis"};
		System.out.println(unirCadenas(cadenas));
	}
	
	public static String unirCadenas (String tcadenas[]) {
		String nuevacadena = "";
		
		for (int i = 0; i < tcadenas.length; i++) {
			nuevacadena+=tcadenas[i];
			if (i != tcadenas.length-1) {
				nuevacadena+="-";
			}
		}
		return nuevacadena;
	}
}
