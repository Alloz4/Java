import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		int tabla[] = new int [30];
		int valor = 0;
		int posicion = 0;
		Scanner sc = new Scanner(System.in);
		
		// Para rellenar la tabla utilizo el bucle for, con math.random para generar n�meros aleatorios.
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random()*(1000-100+1)+100);
		}
		
		// Para ordenar la tabla utilizo este m�todo.
		Arrays.sort(tabla);
		System.out.println(Arrays.toString(tabla));
		System.out.print("Introduce un valor: ");
		valor = sc.nextInt();
		
		//Para buscar el valor dentro de la tabla utilizo este m�todo.
		posicion = Arrays.binarySearch(tabla, valor);
		
		if (posicion >= 0) {
			System.out.println("El n�mero se encuentra en la tabla, concretamente en la posici�n: "+posicion);
		} else {
			System.out.println("El n�mero introducido no se encuentra en la tabla.");
		}
	}
}
