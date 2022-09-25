import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejemplo03 {

	public static void main(String[] args) throws IOException {

		File fl = new File("C:\\Users\\34670\\Desktop\\JAVA eclipse\\Ficheros de texto\\Ficheros\\cosa.txt");
		File fw = new File("C:\\Users\\34670\\Desktop\\JAVA eclipse\\Ficheros de texto\\Ficheros\\resu.txt");
		
		Scanner sc = new Scanner(fl);
		PrintWriter pw = new PrintWriter(fw);
		
		String linea;
		int numero;
		
		while (sc.hasNextLine()) {
			linea = sc.next();
			numero = sc.nextInt();
			pw.println("Nombre: "+linea + " Saldo: " + numero);
		}

		sc.close();
		pw.close();
		
	}
}