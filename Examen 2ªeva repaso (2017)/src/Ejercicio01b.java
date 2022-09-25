import java.util.Arrays;

public class Ejercicio01b {
	public static void main(String args[]) {
		int tabla1[] = { 1, 2, 3, 2, 4, 1 };
		int tabla2[] = { 1, 3, 2, 1, 5, 6 };
		int tabla3[] = { 2, 3, 5, 4, 2, 1, 4, 9 };

		System.out.println(Arrays.toString(operarTabla(tabla1)));
		System.out.println(Arrays.toString(operarTabla(tabla2)));
		System.out.println(Arrays.toString(operarTabla(tabla3)));
	}

	public static int[] operarTabla(int[] valores) {
		int tamaño = valores.length;
		int resu[] = new int[tamaño / 2];
		int cont = 0;

		for (int i = 0; i < resu.length; i++) {
			resu[i] = valores[cont] + valores[cont + 1];
			cont += 2;
		}

		return resu;
	}
}
