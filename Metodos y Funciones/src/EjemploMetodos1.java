
public class EjemploMetodos1 {

	public static void main(String args[]) {
		EjemploMetodos1.mostrar('*', 5);
		EjemploMetodos1.mostrar('A', 15);
		mostrar('>', 10); // No es necesario indicar la clase si estoy en ella.
		System.out.println(" Las suma de 10 + 5 = " + EjemploMetodos1.suma(10, 5));
		System.out.println(" Las suma de 23 + 45 = " + suma(23, 45));
	}

	// M�todo que no devuelve nada
	// Muestra por pantalla el car�cter letra las veces que se indique
	public static void mostrar(char letra, int veces) {
		for (int i = 0; i <= veces; i++) {
			System.out.print(letra);
		}
		System.out.println();
	}

	// M�todo que devuelve el entero resultante de la suma de a y b
	public static int suma(int a, int b) {
		int valor;
		valor = a + b;
		return valor;
	}

}
