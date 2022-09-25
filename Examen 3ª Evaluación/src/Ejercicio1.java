import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) throws FileNotFoundException {
		if (args.length != 1) {
			System.out.println("Error en parámetros. Falta el nombre del fichero.");
			System.exit(1);
		}
		
		File archivo = new File(args[0]);
		
		if (!archivo.canRead()) {
			System.err.println("Error en el fichero "+args[0]+ ". No se puede leer.");
			System.exit(2);
		}
		
		Scanner sc = new Scanner(archivo);
		
		List<String> lista = new ArrayList<String>();
		String linea;
		while (sc.hasNext()) {
			linea = sc.next();
			lista.add(linea);
		}
		sc.close();
		
		Collections.sort(lista);
		
		File archivo2 = new File(args[0]+".ord");
		
		PrintWriter escribe = new PrintWriter(archivo2);
		
		for (String line : lista) {
			escribe.print(line);
		}
		
		escribe.close();
		
		System.out.println("Fichero generado");
		
		
	}

}
