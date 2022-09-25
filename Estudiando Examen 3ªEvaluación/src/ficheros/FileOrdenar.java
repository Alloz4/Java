package ficheros;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FileOrdenar
{
 public static void main ( String argv[] )
       throws IOException {
     
        File fr = new File("datos.txt");
        
        Scanner sc = new Scanner(fr);
        
        PrintWriter pw = new PrintWriter("ordenado.txt");
        
        ArrayList<String> milista = new ArrayList <String>();
        
        // Cargo en el ArrayList
        while ( sc.hasNextLine() ){
           milista.add( sc.nextLine());    
        }
        
       // Ordeno la colección
       Collections.sort(milista);
       
       // Vuelvo la colección al fichero
       for ( String linea : milista){
          pw.println(linea);    
        }
        pw.close();
        sc.close();
    }       
}
