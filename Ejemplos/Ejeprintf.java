/*
 * Prueba de printf (Impresión con formato) 
 */

import java.util.Scanner;

public class Ejeprintf {
	
	public static void main (String args[]) {
	
	     String linea = "Hola Manolo";
	     char letra = 'A';
	     int numeroi = 234;
	     float numerof = 12.23f;
	     
	     System.out.printf("<%+3d>%n",23);
	     System.out.printf("<%x>%n",23);
	     System.out.printf("<%(3d>%n",-23);
	     System.out.printf("<%10.3f>%n",numerof);
	     System.out.printf("<%g>%n",0.000000000000000214);
	     System.out.printf("<%20s>%n",linea);
	     System.out.printf("<%-20S>%n",linea);
	     System.out.printf("<%20.4s>%n",linea);
	     System.out.printf("<%C>%n",letra);
	}
}

