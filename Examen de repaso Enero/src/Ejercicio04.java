
public class Ejercicio04 {
	public static void main (String[] args) {
	
		int matriz[][] = {{3,4,6,10},
						  {2,1,1,12},
						  {1,2,4,6}};
		
		sumarEsquinas(matriz);
		System.out.println(sumarEsquinas(matriz));
		

	}
	
	public static int sumarEsquinas(int[][] biarray) {
		
		int filas = biarray.length;
		int columnas = biarray[0].length;
		return biarray[0][0]+biarray[0][columnas-1]+biarray[filas-1][0]+biarray[filas-1][columnas-1];	
	}
}
