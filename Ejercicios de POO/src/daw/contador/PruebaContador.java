package daw.contador;

import java.util.Scanner;

public class PruebaContador {
	static Scanner sc;

	public static void main(String[] args) {

		Contador contador1 = new Contador();

		Scanner sc = new Scanner(System.in);

		int numero = 0;
		
		System.out.print("Introduce un número para inicializar el contador: ");

		numero = sc.nextInt();
		
		// inicializamos el contador, ya que por defecto se inicializa a 0
		contador1.setContador(numero);

		// Mostrar el valor del objeto
		System.out.println("El valor del contador es: " + contador1.getContador());
		
		//Llamamos el metodo incrementar 
		
		contador1.incrementar();
		contador1.incrementar();
		
		System.out.println("El valor del contador es: " + contador1.getContador());
		
		
	}
}
