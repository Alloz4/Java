import java.util.Arrays;

public class Ejercicio2C {

	public static void main(String[] args) {
		int biarray[][] = { { 10,20,32},
							{12,55,23}, 
							{2,34,5,10,53,5}, 
							{23,12} };
		
		System.out.println(Arrays.toString(coordMax(biarray)));
		
	}
	public static int[] coordMax (int matriz[][]) {
		int tabla[] = new int [2];
		
		int max = matriz [0][0];
		int imax = 0;
		int jmax = 0;
		
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] > max) {
					max = matriz[i][j];
					imax = i;
					jmax = j;
				}
			}
		}
		tabla[0] = imax;
		tabla[1] = jmax;
		
		return tabla;
	}
}
