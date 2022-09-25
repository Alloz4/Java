import java.util.Arrays;

import javax.swing.text.TabableView;

public class Ejercicio05 {
	public static void main(String[] arg) {
		float tabla1[] = new float[5];
		float tabla2[] = new float[10];

		for (int i = 0; i < tabla2.length; i++) {
			tabla2[i] = Math.round(Math.random() * 100);
		}
		for (int i = 0; i < tabla1.length; i++) {
			tabla1[i] = Math.round(Math.random() * 100);
		}

		float[] nueva = unitTablas(tabla1, tabla2);
		Arrays.sort(nueva);
		System.out.println(Arrays.toString(nueva));

	}

	public static float[] unitTablas(float t1[], float t2[]) {
		float[] tabla3 = new float[t1.length + t2.length];
		int k = 0;

		for (int i = 0; i < t1.length; i++) {
			tabla3[k] = t1[i];
			k++;
		}
		for (int i = 0; i < t2.length; i++) {
			tabla3[k] = t2[i];
			k++;
		}
		return tabla3;
	}
}
