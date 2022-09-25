package ejercicio3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GestionBancaria {

	static private Scanner sc;

	public static void main(String argv[]) {

		sc = new Scanner(System.in);

		HashMap<Long, Cuenta> mcuentas = new HashMap<Long, Cuenta>();
		mcuentas.put(100293929L, new Cuenta(100293929L, "Ana Soria", 2123.34f));
		mcuentas.put(200293929L, new Cuenta(200293929L, "Pedro Roca", 5030.83f));
		mcuentas.put(300293929L, new Cuenta(300293929L, "Adan", 0.0f));
		mcuentas.put(400293929L, new Cuenta(400293929L, "Eva", 0.0f));
		mcuentas.put(500293929L, new Cuenta(500293929L, "Millonetis", 8552123.34f));

		System.out.print("Introduce un valor mínimo de saldo:");
		float valor = 0;
		valor = leerFloat();

		System.out.println(">Cuentas con saldo superior a " + valor);

		mostrarCuentas(mcuentas, valor);

		System.out.println(">Eliminado cuentas con saldo igual a 0 ");
		
		//Se crea la coleccion para borrar los saldos que son iguales a 0.
		Collection<Cuenta> coleccion = mcuentas.values();
		
		eliminar(coleccion, mcuentas);
		
		System.out.println(">Cuentas ordenadas por saldo");
		
		//Creo una lista para ordenar por saldo
		List<Cuenta> lista = new ArrayList<Cuenta>(mcuentas.values());
		mostrarCuentaOrdenada(lista, mcuentas);
		
		
	}

	//Se crean todos los métodos pedidos.
	
	private static float leerFloat() {
		boolean error = false;
		float valor = 0;
		String cadena;
		do {
			error = false;
			try {
				// Intento leer directamente un entero
				cadena = sc.nextLine();
				valor = Float.parseFloat(cadena);

			} catch (NumberFormatException e) {
				System.out.println("Error en formato.");
				System.out.print("Introduce un valor mínimo de saldo:");
				error = true;
			}
		} while (error);
		return valor;
	}

	public static void mostrarCuentas(HashMap<Long, Cuenta> mcuentas, float valor) {
		for (Map.Entry<Long, Cuenta> cuenta : mcuentas.entrySet()) {
			if (cuenta.getValue().saldo > valor) {
				System.out.println(cuenta);
			}
		}
	}
	
	public static void eliminar(Collection<Cuenta> coleccion, HashMap<Long, Cuenta> mcuentas) {
		coleccion = mcuentas.values();
		//Utilizamos una expresión lambda para borrar.
		coleccion.removeIf(c -> c.saldo == 0);
		
		for (Map.Entry<Long, Cuenta> cuenta : mcuentas.entrySet()) {
			System.out.println(cuenta);
		}
	}
	
	public static void mostrarCuentaOrdenada(List<Cuenta> lista, HashMap<Long, Cuenta> mcuentas) {
		
		Collections.sort(lista);
		
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
	}
}
