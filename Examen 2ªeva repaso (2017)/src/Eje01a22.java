import java.util.Arrays;

public class Eje01a22 {
	public static void main(String[] args) {
		int tabla[] = {10,-2,4,-1,0,10};
		System.out.println(Arrays.toString(suprimeNegativos(tabla)));
	}
	
	public static int[] suprimeNegativos(int tabla[]) {
		int contneg = 0;
		int cont = 0;
		
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] < 0) {
				contneg++;
			}
		}
		int nueva[] = new int[tabla.length-contneg];
		
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] >= 0) {
				nueva[cont] = tabla[i]; 
				cont++;
			}
		}
		
		return nueva;
	}
}
