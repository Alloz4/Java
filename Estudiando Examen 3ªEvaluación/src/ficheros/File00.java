package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File00 {

	public static void main(String[] args) throws IOException {

		File fichero = new File("datos.txt");
		
		try {
			FileReader fileReader = new FileReader(fichero);
			int leer;
			leer = fileReader.read();
			
			while (leer != -1) {
				char letra = (char) leer;
				System.out.print(letra);
				leer = fileReader.read();
			}
			fileReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("El fichero no se puede encontrar.");
		}
	}

}
