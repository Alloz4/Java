import java.util.Arrays;
import java.util.Scanner;

public class busqueda_secuencial {
	static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tabla = {1, 5, 4, 8, 9, 24};
		int numero = 0;
		sc = new Scanner(System.in);
		System.out.print("Escribe el n�mero que quieras encontrar en la matriz: ");
		numero = sc.nextInt();
				
		if(busquedaTabla(tabla, numero) == -1) {
			System.out.println("El n�mero no est� en la tabla.");
		} else {
			System.out.println("El n�mero "+numero+" est� en la tabla, en la posici�n "+busquedaTabla(tabla, numero)+".");
			Arrays.sort(tabla);
			System.out.println(Arrays.toString(tabla));
			
		}
	}
	static int busquedaTabla (int[] matriz, int num) {
		int pos = -1;
		
		for (int i = 0; i < matriz.length; i++) {
			if (num == matriz[i]) {
				pos = i;
				break;
			}
			
		}
		return pos;
	}
}
