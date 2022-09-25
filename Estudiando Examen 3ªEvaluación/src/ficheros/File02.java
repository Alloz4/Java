package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class File02 {

	public static void main(String[] args) throws IOException {

		File fichero = new File(args[0]);
		FileReader fr = new FileReader(args[0]);
		int cont = 0;
		int contleter = 0;
		try {
			int leer = fr.read();
			Scanner sc = new Scanner(fichero);
			while (leer != -1) {
				char letra = (char) leer;
				leer = fr.read();
				contleter++;
			}
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
				cont++;
			}
			
			fr.close();
			sc.close();
		} catch (FileNotFoundException ex) {
			System.out.println("El fichero no se puede encontrar.");
		}
		System.out.println("Lineas: "+cont);
		System.out.println("Caracteres: "+contleter);
	}
}
