import java.util.Scanner;

public class Eje01 {

	public static void main(String[] args) {
		//Leer 10 números, almacenarlos en una tabla y mostrar su suma.
		Scanner sc = new Scanner(System.in);
		
		int sumnum = 0;
		int [] tabla = new int [10];
		
		System.out.println("Lectura de los números y almacenamiento en la tabla: ");
		System.out.println(" ");
		
		//Con este bucle almaceno los datos y los leo
		
		for (int i = 0; i < tabla.length; i++) {
			System.out.print("Introducir un número para el valor " + i + ": ");
			tabla [i] = sc.nextInt();
		}
		
		//Con este bucle sumo los datos de la tabla
		
		for (int i = 0; i < tabla.length; i++) {
			sumnum+=tabla[i];
		}
		System.out.println(" ");
		System.out.println("La suma de los números de la tabla es: " + sumnum);
		
	}

}
