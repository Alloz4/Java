import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

import ficheros.Candidato;

public class Ejercicio03 {

	public static void main(String[] args) throws Exception {

		ArrayList<Candidato> lista = new ArrayList<Candidato>();
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("votaciones.objects");
			ois = new ObjectInputStream(fis);

			Candidato c = (Candidato) ois.readObject();

			while (true) {
				lista.add(c);
				c = (Candidato) ois.readObject();
			}
		} catch (Exception e) {

		}
		Collections.sort(lista);
		
		int contador = 0;
		
		for (Candidato candidato : lista) {
			System.out.println(candidato.toString());
			contador++;
			if (contador == 5) {
				break;
			}
		}
		fis.close();
		ois.close();
		
	}

}
