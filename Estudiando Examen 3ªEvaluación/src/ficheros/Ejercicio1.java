package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		File archivo = new File(args[0]);
		Scanner sc = null;
		PrintWriter pw = null;
		
		if (args.length != 1) {
			System.out.println("El programa no recibe los argumentos adecuados." + "\n Uso: <fichero> ");
		}
		if (!archivo.exists() && !archivo.canRead()) {
			System.out.println("El archivo no existe o no se puede leer");
		}

		ArrayList<String> ordenado = new ArrayList<String>();

		try {
			sc = new Scanner(archivo);
			while (sc.hasNext()) {
				ordenado.add(sc.nextLine());
			}
			Collections.sort(ordenado);

			pw = new PrintWriter(archivo + ".ord");
			for (String datos : ordenado) {
				pw.write(datos + "\n");
			}

		} catch (FileNotFoundException e) {
			System.out.println("El fichero no se encuentra.");
		} finally {
			pw.close();
			sc.close();
		}
	}

}
