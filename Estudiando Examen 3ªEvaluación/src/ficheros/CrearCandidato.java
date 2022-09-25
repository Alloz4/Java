package ficheros;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CrearCandidato {

	public static void main(String args[]) {

		String nombrefichero = "votaciones.objects";

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(nombrefichero);
			oos = new ObjectOutputStream(fos);

			oos.writeObject(new Candidato("Pepe ", 400));
			oos.writeObject(new Candidato("Luis ", 4000));
			oos.writeObject(new Candidato("Pepe Luis", 500));
			oos.writeObject(new Candidato("Paco ", 40));
			oos.writeObject(new Candidato("Ana ", 1400));
			oos.writeObject(new Candidato("Pio ", 4));
			oos.writeObject(new Candidato("Angel ", 100));
			oos.writeObject(new Candidato("Raimundo ", 3400));
			oos.writeObject(new Candidato("Andrea ", 1450));
			oos.writeObject(new Candidato("Beatriz ", 6400));
			oos.writeObject(new Candidato("Almudena", 200));
			oos.writeObject(new Candidato("Mindundi", 1));
			
			fos.close();
			oos.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fichero generado");

		
	}
}
