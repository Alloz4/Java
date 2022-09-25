import java.util.Arrays;

public class Ejercicio01d {
	public static void main(String args[]) {
		int tabla1[] = {3,3,3,5,5,5};
		int tabla2[] = {2,3,4,8,7,6,5};
		
		if (!estaIncluido(tabla1, tabla2)) {
			System.out.println("Los valores de la tabla 1 no están en la tabla 2.");
			System.out.println(Arrays.toString(tabla1)+ ", "+Arrays.toString(tabla2)+" ---> " +estaIncluido(tabla1, tabla2));
		} else {
			System.out.println("Los valores de la tabla 1 están incluidos en la tabla 2.");
			System.out.println(Arrays.toString(tabla1)+ ", "+Arrays.toString(tabla2)+" ---> " +estaIncluido(tabla1, tabla2));
		}
	}

	public static boolean estaIncluido(int ta[], int tb[]) {
		boolean verdad = false;
		Arrays.sort(tb);
		for (int i = 0; i < ta.length; i++) {
			if (Arrays.binarySearch(tb, ta[i]) >= 0) {
				verdad = true;
			} else {
				verdad = false;
				break;
			}
		}
		return verdad;
	}
}
