/*
Desarrollar	 un	 programa	que	 recoja	 dos	 números	 enteros	 y	 escriba	 por	
pantalla	el	resultado	de	sumarlos.	
 */
import java.util.Scanner;
public class Ejercicio07 {

	public static void main(String[] args) {
		double num1, num2, suma; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe dos numeros para sumarlos: ");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		
		suma = num1 + num2;
		
		System.out.println(num1+" + "+num2+" = "+suma);
	}

}
