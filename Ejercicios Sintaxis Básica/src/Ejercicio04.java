import java.util.Scanner;
/*
 Repetir	el	programa	anterior	leyendo	el	entero	de	la	entrada	estándar.
 */
public class Ejercicio04 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escribe un número: ");
		
		num = sc.nextInt();
		
		char valor = (char) num;
		
		System.out.println("El valor es: "+valor);
	}
}
