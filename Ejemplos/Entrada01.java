/*
 *Si voy a utilizar el Scanner tengo
 * tengo que indicar el paquete y ruta donde se encuentra
 * OJO con la diferencia de next() y nextLine()
 */
import java.util.Scanner;

public class Entrada01 {
	
	public static void main (String args[]) {
	
	     String linea;
	     char letra;
	     int numeroi;
	     float numerof;
	     
	     Scanner sc = new Scanner(System.in);
	     
	     System.out.print("Introduce una linea:");
	     linea = sc.nextLine(); 
	     System.out.print("Introduce un caracter:");
	     letra = sc.nextLine().charAt(0);
	     System.out.print("Introduce un entero:");
	     numeroi = sc.nextInt();	
	     
	     System.out.print("Introduce un real:");
	     numerof = sc.nextFloat();
	     
	     System.out.println(" Línea   = "+ linea);
	     System.out.println(" Letra   = "+ letra);
	     System.out.println(" Entero  = "+ numeroi);
	     System.out.println(" Real    = "+ numerof);
	     	
	}
}

