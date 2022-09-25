package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe el nombre de un fichero: ");
		String nombre = sc.nextLine();
		
		System.out.print("Escribe el nombre del fichero donde vas a copiar los datos de "+nombre+": ");
		String nombre2 = sc.nextLine();
		
		File fichero = new File(nombre);
		File fichero2 = new File(nombre2);
		
		try {
			sc = new Scanner(fichero);
			PrintWriter pw = new PrintWriter(fichero2);
			String linea;
			while (sc.hasNext()) {
				linea = sc.nextLine();
				System.out.println(linea);
				pw.write(linea+"\n");
			}
			System.out.println("Fichero copiado.");
			pw.close();
			sc.close();
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el fichero.");
		}
		
	}

}
