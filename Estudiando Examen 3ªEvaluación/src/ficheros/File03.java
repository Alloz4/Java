package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe el nombre de un fichero: ");
		
		String nombre = sc.nextLine();
		
		File fichero = new File(nombre);
		try {
			int contador = 0;
			Scanner leer = new Scanner(fichero);
			String linea;
			while (contador < 4 && leer.hasNext()) {
				contador++;
				linea = leer.nextLine();
				System.out.println(linea);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el fichero.");
		}
		
		
	}

}
