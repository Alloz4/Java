/*
Desarrollar	 un	 programa	 que	 escriba	 por	 pantalla	 el	 cuadrado	 de	 un	
número	entero	pasado	por	la	entrada	estándar.
 */
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe un número entero: ");
		
		num = sc.nextInt();
		
		int resultado = num * num; 
		
		System.out.println("El cuadrado de ese número es: "+num+" * "+num+" = "+resultado);
	}

}
