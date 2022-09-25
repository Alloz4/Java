
/**
 * Write a description of class Ejercicio4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Ejercicio2
{
    // instance variables - replace the example below with your own
    public static void main ( String arg[] ){
        
        Scanner sc = new Scanner( System.in);
        
        System.out.println(" Introduzca una cadena :");
        String cadena = sc.nextLine();
        ListaLetras milistaletras = new ListaLetras(cadena);
        System.out.print(" Lista de letras  :");
        milistaletras.verListaLetras();
        
    }   
}
