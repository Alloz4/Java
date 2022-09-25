import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1� Operaci�n:
		ArrayList<Bicicleta> listaBicis = new ArrayList<Bicicleta>();

		listaBicis.add(new Bicicleta(1, "Orbea", 1500, 2020));
		listaBicis.add(new Bicicleta(2, "Specialized", 4000, 2022));
		listaBicis.add(new Bicicleta(3, "Scott", 2500, 2021));
		listaBicis.add(new Bicicleta(4, "KTM", 2000, 2019));
		listaBicis.add(new Bicicleta(5, "Cube", 1300, 2023));
		listaBicis.add(new Bicicleta(6, "Ridley", 2800, 2021));

		// 2�Operaci�n
		Bicicleta primero = listaBicis.get(0);
		Bicicleta ultimo = listaBicis.get(listaBicis.size() - 1);

		System.out.println("Se muestra el primer y ultimo objeto de la lista: ");
		System.out.println("Primer objeto: " + primero);
		System.out.println("�ltimo objeto: " + ultimo + "\n");

		// 3�Operaci�n
		/*
		 * for (int i = 0; i < listaBicis.size(); i++) {
		 * if (listaBicis.get(i).a�o < 2021) {
		 * listaBicis.remove(i);
		 * }
		 * }
		 */
		// Con esta funcion lambda tambi�n podemos borrar lo que queramos de un
		// arrayList
		listaBicis.removeIf(bici -> bici.año < 2021);

		// 4�Operaci�n
		// Implementamos la interfaz Comparable en la clase Bicicleta, ordenamos y
		// mostramos el resultado
		Collections.sort(listaBicis);

		System.out.println("Lista ordenada por identificador: ");

		for (Bicicleta bicicleta : listaBicis) {
			System.out.println(bicicleta);
		}

		System.out.println("\n");
		// 5�Operaci�n

		HashMap<Integer, Bicicleta> mapaBicis = new HashMap<Integer, Bicicleta>();

		for (int i = 0; i < listaBicis.size(); i++) {
			mapaBicis.put(listaBicis.get(i).id, listaBicis.get(i));
		}

		for (Map.Entry<Integer, Bicicleta> bicicleta : mapaBicis.entrySet()) {
			System.out.println("Identificador: " + bicicleta.getKey());
			System.out.println("Valor: " + bicicleta.getValue());
		}
		// 6�Operaci�n

		System.out.print("Introduce un identificador: ");
		int id = sc.nextInt();

		if (mapaBicis.containsKey(id)) {
			System.out.println("El mapa contiene el ID introducido: " + mapaBicis.get(id));
		} else {
			System.out.println("El mapa no contiene el ID " + id);
		}

		sc.close();
	}

}
