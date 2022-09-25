//EJERCICIO REALIZADO POR MARCOS ALLOZA GARC�A      1�DAW
package iestetuan.daw.almacen;

import java.util.Scanner;

//Clase de prueba COMPLETAR EL C�DIGO DEL M�TODO procesar Opci�n

public class TestAlmacen1 {

	static Scanner sc;

	static public void main(String[] argv) {

		Almacen1 prueba = new Almacen1(10);
		sc = new Scanner(System.in);
		int opcion;

		mostrarMenu();
		opcion = sc.nextInt();
		while (opcion != 0) {
			procesarOpcion(opcion, prueba);
			mostrarMenu();
			opcion = sc.nextInt();
		}
		sc.close();

	}

	static void mostrarMenu() {
		System.out.println("--- MEN� DE  CONTROL DEL ALMAC�N 1 -----");
		System.out.println(" 1.- Mostrar contenido del Almac�n");
		System.out.println(" 2.- Poner un Valor  ");
		System.out.println(" 3.- Buscar un Valor ");
		System.out.println(" 4.- Borrar un Valor");
		System.out.println(" 5.- Contar posiciones ocupadas.");
		System.out.println(" 6.- Contar posiciones libres.");
		System.out.println(" 7.- Empaquetar la tabla.");
		System.out.println(" 0.- Terminar");
		System.out.print(" Introduzca una opci�n:[1-6]: ");
	}

	// Procesa la opci�n introducida operando sobre el objeto Almacen1
	static void procesarOpcion(int opcion, Almacen1 parAlmacen) {
		// Completar......

		switch (opcion) {
		case 1:
			System.out.println("Valores de la tabla: " + parAlmacen.toString());
			break;
		case 2:
			System.out.print("Introduce un valor: ");
			int valor = sc.nextInt();
			if (!parAlmacen.ponValor(valor)) {
				System.err.println("El valor no se ha podido almacenar");
			}
			break;
		case 3:
			System.out.print("Introduce un valor: ");
			valor = sc.nextInt();
			if (!parAlmacen.estaValor(valor)) {
				System.err.println("El valor no est� en la tabla.");
			} else {
				System.out.println("El valor si est� en la tabla.");
			}
			break;
		case 4:
			System.out.print("Introduce el valor que quieras borrar: ");
			valor = sc.nextInt();
			if (!parAlmacen.sacarValor(valor)) {
				System.err.println("El valor no se puede borrar porque no est� en la tabla.");
			} else {
				System.out.println("El valor se ha borrado correctamente.");
			}
			break;
		case 5:
			System.out.println("N�mero de posiciones ocupadas: " + parAlmacen.numPosicionesOcupadas());
			break;
		case 6:
			System.out.println(" Posiciones libres = " + parAlmacen.numPosicionesLibres());
			break;
		case 7:
			parAlmacen.empaquetar();
			System.out.println("Empaquetando la tabla...");
			parAlmacen.toString();

		}

	}

}
