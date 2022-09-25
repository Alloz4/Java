
public class EjemploMetodos2 {
	public static void main(String args[]) {
		int numero = 1; // Dato simple (valor)
		int tnumeros[] = { 1 }; // Tabla con un solo elemento
		String mensaje = "Hola"; // String (Por referencia pero es inalterable)
		Integer numo = 1; // Objeto de tipo Integer que almacena tipo b�sico int (inalterable)
// En Java una funci�n se puede llamar igual que otra si tiene distintos tipos o n�mero de
// par�metros: Sobrecarga de m�todos (methods overloading)
		incrementar(numero);
		incrementar(tnumeros);
		cambiarString(mensaje);
		incrementar(numo);
		System.out.println(" N�mero =" + numero); // No cambia
		System.out.println(" tabla de N�mero =" + tnumeros[0]); // Cambia
		System.out.println(" Mensaje = " + mensaje); // No cambia
		System.out.println(" Integer = " + numo); // No cambia
	}

	// Par�metro: tipo primitivos
	// Paso por valor no puede modificar el par�metro
	public static void incrementar(int num) {
		num = num + 1;
	}

	// Par�metro una tabla
	// Paso por referencia puede modificar el par�metro
	public static void incrementar(int tnum[]) {
		tnum[0]++;
	}

	// Par�metro Integer no se puede alterar
	public static void incrementar(Integer num) {
		num++;
	}

	// Par�metro String no se puede alterar
	public static void cambiarString(String msg) {
		msg = "Adios";
	}
}
