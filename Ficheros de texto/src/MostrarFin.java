import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MostrarFin {
	
	public static void main (String args[]) throws FileNotFoundException {
		
		//Número de argumentos
		
		if(args.length != 2) {
			System.out.println("Error: Uso <numero> <fichero>");
			System.exit(1);
		}

		
		int numlineas = 0;
		try {
			numlineas = Integer.parseInt(args[0]);
		} catch (NumberFormatException ex) {
			System.out.println("Debe introducir un número de líneas");
			System.exit(2);
		}
		
		String nombre = args[1];
		
		File fl = new File(nombre);
		
		if (!fl.canRead()) {
			System.out.println("Error no se puede leer el fichero "+args[1]);
			System.exit(3);
		}
		
		
		Scanner sc = new Scanner(fl);
		
		int clineas = 0;
		String linea;
		
		while (sc.hasNextLine() && clineas < numlineas) {
			linea = sc.nextLine();
			System.out.println(linea);
			clineas++;
		}
		
		sc.close();
		
	}
}
