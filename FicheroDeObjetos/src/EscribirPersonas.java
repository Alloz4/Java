
/**
 * Escribe una objetos personas a un fichero
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.Scanner;

public class EscribirPersonas
{
   public static void main ( String argv[] ) throws IOException {
       
        Scanner sc = new Scanner (System.in);
        System.out.println("Nombre del ficheros de personas:");
        String nombreFichero = sc.next();
        
        FileOutputStream fw= new FileOutputStream(nombreFichero);
        // Creo un Flujo de objetos sobre el fichero
        ObjectOutputStream fow= new ObjectOutputStream(fw);
            
        Persona p = new Persona ("Luis",  new Fecha(10,1,1998), 9348971);
        fow.writeObject(p);
        fow.writeObject( new Persona ("Ana",   new Fecha(11,10,1964),2345551));
        fow.writeObject( new Persona ("Eva",   new Fecha(1 ,11,2003),20348285));
        fow.writeObject( new Persona ("Pedro", new Fecha(27,6,1993) ,90403355));
        
         fow.close(); // Cierro el fujo de objectos
         fw.close();  // Cierro el flujo de bytes
        
         System.out.println("Fichero grabado.");
       
         sc.close();
         
   }
}
