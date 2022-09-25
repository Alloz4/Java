
public class Repes {

	public static void main(String[] args) {
		boolean cadenarepe = false;
		for (int i = 0; i < args.length; i++) {
			String cadena = args[i];
			int cont = 0;
			for (int j = i+1; j < args.length; j++) {
				if (cadena.equals(args[j])) {
					cont++;
					System.out.println("La cadena "+args[i]+" está repetida "+cont);
				}
			}
		}
		
		if (cadenarepe) {
			System.out.println("No hay cadenas repetidas");
		}
	}
}
