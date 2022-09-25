import java.util.Arrays;

public class Ejercicio2E {

	public static void main(String[] args) {
		int tabla[] = {10,3,15,25,7,30,650,40};
		
		
		
		System.out.println(Arrays.toString(dameDivEntre5(tabla)));
	}

	public static int[] dameDivEntre5(int valores[]) {
		int cont = 0;
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] % 5 == 0) {
				cont++;
			}
		}
		int tablanew [] = new int [cont];
		cont = 0;
		for (int i = 0; i < valores.length; i++) {
			if (valores[i]%5==0) {
				tablanew[cont] = valores[i];
				cont++;
			}
		}

		return tablanew;
	}
}
