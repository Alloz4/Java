/*
 * Expresiones y operadores
 * 
 */


public class ExpresionesyOperadores {
	
	public static void main (String args[]) {
	 int num1,num2, numr;
	 
	 System.out.println("EXPRESIONES");
	 num1 = 10;
	 num2 = 20;	
	 numr = num1++;  // Primero asigna despues incrementa
	 System.out.println(numr);
	 System.out.println(num1);
	 numr = ++num2; // Primero incrementa despues asigna
	 System.out.println(numr);
	 System.out.println(num2);
	 numr += num1;  // Es m√°s claro poner numr = numr + num1
	 System.out.println(numr);
	 numr *=2;     // Lo multiplico por dos
	 System.out.println(numr);
	 
	 
	 System.out.println("CADENAS y OPERADOR +");
	 // Operaciones con cadenas
	 String nombre = "Pepe";
	 String apellidos = "PÈrez LÛpez";
	 String nombreCompleto;
	 byte edad = 23;
	 nombreCompleto = nombre +" "+apellidos;
	 System.out.println("Hola "+nombreCompleto+" Edad = "+ edad);
	 
	 //No Muestra lo mismo
	 System.out.println(   10+20+"="+30); // Primero suma aritm√©tica
	 System.out.println(""+10+20+"="+30); // Primero Concatena
	 
	}
}

