import java.util.Arrays;

import javax.imageio.stream.ImageInputStream;

public class Eje01_matrices {

	public static void main(String[] args) {
		int ventas[][] = { { 9, 0, 3, 4, 6, 7, 0, 4, 1, 3, 10, 0 },
							{ 9, 2, 3, 4, 6, 1, 0, 4, 1, 3, 100, 0 },
							{ 1, 0, 3, 4, 6, 7, 0, 4, 1, 3, 6, 7 },
							{ 1, 0, 3, 4, 6, 0, 0, 0, 0, 0, 6, 0 },
							{ 1, 0, 3, 4, 6, 7, 0, 4, 1, 3, 6, 0 } };

		String productos[] = { "Jamón", "Morcilla", "Chorizo", "Salchichón", "Paté" };
		String meses[] = {"Enero", "Febrero", "Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

		// Para saber cual es el producto que mas se vende y cual menos.

		int sumafilas[] = new int[5];
		int sumacolumnas[] = new int[12];
		
		// Primero recorremos la matriz para sumar todas las filas.

		for (int i = 0; i < sumafilas.length; i++) {
			sumafilas[i] = 0;
			for (int j = 0; j < ventas[i].length; j++) {
				sumafilas[i] += ventas[i][j];
			}
		}

		// Para hallar el max y el min recorro la nueva tabla con solo las filas.
		int max = 0;
		int min = 0;

		for (int i = 0; i < sumafilas.length; i++) {
			if (sumafilas[i] > sumafilas[max]) {
				max = i;
			}
			if (sumafilas[i] < sumafilas[min]) {
				min = i;
			}
		}

		System.out.println("El producto que más se vende a lo largo del año es: " + productos[max]);
		System.out.println("EL producto que menos se vende a lo largo del año es: " + productos[min]);

		// Para hallar el mes con mas y menos ventas

		for (int i = 0; i < sumacolumnas.length; i++) {
			sumacolumnas[i] = 0;
			for (int j = 0; j < ventas.length; j++) {
				sumacolumnas[i] += ventas[j][i];
			}
			
		}
			
			int maxventas = 0;
			int minventas = 0;
			
		for (int i = 0; i < sumacolumnas.length; i++) {
			if (sumacolumnas[i] > sumacolumnas[maxventas]) {
				maxventas = i;
			}
			if (sumacolumnas[i] < sumacolumnas[minventas]) {
				minventas = i;
			}
		}
		
		System.out.println((meses[maxventas])+" es el mes con más ventas.");
		System.out.println((meses[minventas])+" es el mes con menos ventas.");
		
		for (int i = 0; i < ventas.length; i++) {
			if (ventas[i][5] == 0 && ventas[i][6] == 0 && ventas[i][7] == 0 && ventas[i][8] == 0) {
				System.out.println("El producto "+productos[i]+" no se vende en la temporada de verano ("+meses[5]+", "+meses[6]+", "+meses[7]+", "+meses[8]+").");
			}
		}

	}
}
