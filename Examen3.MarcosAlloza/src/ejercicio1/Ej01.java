package ejercicio1;
import java.io.File;
import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println(" Error faltan parámetros." + "\n Uso CopiarTex <Fichero Origen> <Fichero Destino>");
		}

		File f = new File(args[0]);
		if (!f.exists() || !f.canRead()) {
			System.out.println(" No existe o no se puede leer el fichero " + args[0]);
		}

		Scanner sc = null;
		int pos = 0;
		String linea;
		int contpalabras = 0;
		try {
			sc = new Scanner(f);
			while (sc.hasNext()) {
				linea = sc.nextLine();
				pos++;
				if (linea.contains(args[1])) {
					System.out.println(pos + ": " + linea);
					contpalabras++;
				} 
			}
			if (contpalabras > 0) {
				System.out.println("La palabra [" + args[1] + "] aparace " + contpalabras + " veces.");
			} else {
				System.out.println("La palabra ["+ args[1] + "] no aparece en el fichero.");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
