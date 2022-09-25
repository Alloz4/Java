package ficheros;

import java.io.File;

public class Filedemo {

	public static void main(String[] args) {
		
		File fichero = new File("datos.txt");
		
		if (fichero.exists()) {
			System.out.println("El fichero existe");
		} else {
			System.out.println("El fichero no existe");
		}
		
		System.out.println("Ruta del fichero: "+fichero.getAbsolutePath());
		
		if (fichero.isDirectory()) {
			System.out.println("Es un directorio. "+fichero.list());
		} else {
			System.out.println("Es un fichero.");
		}
		
		
		
	}

}
