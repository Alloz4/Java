/*
Desarrollar	 un	 programa	 que	 escriba	 por	 pantalla	 el	 cuadrado	 de	 un	
n�mero	entero	pasado	por	la	entrada	est�ndar.
 */
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe un n�mero entero: ");
		
		num = sc.nextInt();
		
		int resultado = num * num; 
		
		System.out.println("El cuadrado de ese n�mero es: "+num+" * "+num+" = "+resultado);
	}

}
