
public class Herramientas {

	static int damePosicionMax(int t[]) {
		int posmaxi = 0;
		for (int i = 0; i < t.length; i++) {
			if (t[i] > t[posmaxi]) {
				posmaxi = i;
			}
		}
		return posmaxi;
	}

	static int damePosicionMin(int t[]) {
		int kk = 0;
		for (int i = 0; i < t.length; i++) {
			if (t[i] < t[kk]) {
				kk = i;
			}
		}
		return kk;
	}

	static int calcularSuma(int t[]) {
		int suma = 0;
		for (int i = 0; i < t.length; i++) {
			suma += t[i];
		}
		return suma;
	}

}
