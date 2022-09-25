package ejercicio2;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ej02 {

	public static void main(String[] args) throws IOException {

		ArrayList<Alumno> lista = new ArrayList<Alumno>();

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("alumnos.ser");
			ois = new ObjectInputStream(fis);

			Alumno al = (Alumno) ois.readObject();

			while (true) {
				lista.add(al);
				al = (Alumno) ois.readObject();
			}
		}catch(EOFException ex){
			
		}catch (IOException ioe){
		    System.err.println(" Error en E/S sobre fichero de alumnos "+ioe);
		} catch (ClassNotFoundException cex){
		    System.err.println(" El fichero no tiene objetos ");
		}
		
		fis.close();
		ois.close();
		
		//Recorro el arraylist para mirar los alumnos que estan aprobados y los imprimo.
		for (Alumno alumno : lista) {
			if(alumno.aprobado()) {
			System.out.println("El alumno "+alumno.nombre + " ha aprobado el curso.");	
			}
		}
		
	 }		
}

