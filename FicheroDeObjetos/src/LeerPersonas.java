
/**
 * Lee objeto de tipo persona de un fichero 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.*;
import java.util.Scanner;

public class LeerPersonas
{

    public static void main (String argv[]) throws Exception {

        Scanner sc = new Scanner (System.in);
        System.out.println("Nombre del ficheros de personas:");
        String nombreFichero = sc.next();
        
       // Creo Flujo de tipo fichero de byte 
        FileInputStream fin= new FileInputStream("C:\\Users\\34670\\Desktop\\JAVA eclipse\\FicheroDeObjetos\\"+nombreFichero);
       // Creo un Flujo de objetos sobre el fichero
        ObjectInputStream foin= new ObjectInputStream(fin);
            
        try {
             // Leo objetos hasta llegar a final de fichero
             Persona aux = (Persona) foin.readObject();
             // Sale cuando se llege al final de fichero End of File EOF
             while ( true ){
                    aux.imprimirDatos();
                    aux = (Persona) foin.readObject();
             }
        }catch  (EOFException ex){
                // NO hago nada, simplemente se ha detectado que no hay mas datos
        	
            }
      foin.close(); // Cierro el flujo de objectos
      fin.close();  // Cierro el flujo de bytes
      sc.close();
      
    }

}
