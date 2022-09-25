import java.util.Arrays;
import java.util.Collections;

public class Ejercicio06 {
	public static void main(String[] args) {
		int array[] = { 10, 3, 0, 1, 4, 0, 0, 9, 32, 0 };
		empaquetar(array);

	}

	public static void empaquetar(int tabla[]) {
		int izq = 0;
		int dch = tabla.length - 1;

		while (izq < dch) {
			if (tabla[izq]== 0 && tabla[dch] != 0) {
				tabla[izq] = tabla[dch];
				tabla[dch] = 0;
				izq ++;
				dch --;
			}
			if (tabla[izq]!=0) {
				izq++;
			}
			if(tabla[dch]==0) {
				dch --;
			}
		}
		System.out.println(Arrays.toString(tabla));
	}
}
