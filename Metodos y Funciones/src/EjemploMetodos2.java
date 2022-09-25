
public class EjemploMetodos2 {
	public static void main(String args[]) {
		int numero = 1; // Dato simple (valor)
		int tnumeros[] = { 1 }; // Tabla con un solo elemento
		String mensaje = "Hola"; // String (Por referencia pero es inalterable)
		Integer numo = 1; // Objeto de tipo Integer que almacena tipo básico int (inalterable)
// En Java una función se puede llamar igual que otra si tiene distintos tipos o número de
// parámetros: Sobrecarga de métodos (methods overloading)
		incrementar(numero);
		incrementar(tnumeros);
		cambiarString(mensaje);
		incrementar(numo);
		System.out.println(" Número =" + numero); // No cambia
		System.out.println(" tabla de Número =" + tnumeros[0]); // Cambia
		System.out.println(" Mensaje = " + mensaje); // No cambia
		System.out.println(" Integer = " + numo); // No cambia
	}

	// Parámetro: tipo primitivos
	// Paso por valor no puede modificar el parámetro
	public static void incrementar(int num) {
		num = num + 1;
	}

	// Parámetro una tabla
	// Paso por referencia puede modificar el parámetro
	public static void incrementar(int tnum[]) {
		tnum[0]++;
	}

	// Parámetro Integer no se puede alterar
	public static void incrementar(Integer num) {
		num++;
	}

	// Parámetro String no se puede alterar
	public static void cambiarString(String msg) {
		msg = "Adios";
	}
}
