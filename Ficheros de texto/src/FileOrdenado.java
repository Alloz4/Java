import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FileOrdenado {

	public static void main(String[] args) throws IOException{
		
		File fl = new File("cosa.txt");
		File fw = new File("resu.txt");
		ArrayList<String> lista = new ArrayList<String>();
		
		Scanner sc = new Scanner(fl);
		PrintWriter pw = new PrintWriter(fw);
		
		String linea;
		int numero;
		
		while (sc.hasNextLine()) {
			linea = sc.nextLine() ;
			lista.add(linea);
		}
		
		Collections.sort(lista);
		for (String l : lista) {
			pw.println(l);
		}
		
		System.out.println("Fichero ordenado.");
		
		sc.close();
		pw.close();
		
	}

}
