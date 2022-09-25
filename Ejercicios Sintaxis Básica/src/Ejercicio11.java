/*
Escribe	 un	 programa	 para	 convertir	 de	 grados	 Fahrenheit	 a	 grados	
Celsius.	(La	fórmula	de	conversión	es	°C	=	5/9	* (°F	- 32).)	
 */
import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		int grados;
		double celsius;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe una temperatura en grados Fahrenheit: ");
		
		grados = sc.nextInt();
				
		celsius = (5.0/9.0) * (grados-32);
		
		System.out.println("Esa temperatura en grados Celsius es: "+celsius);
		
	}

}
