import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Ejercicio01_matrices {

	public static void main(String[] args) {
		int ventas[][] = { { 9, 0, 3, 4, 6, 7, 0, 4, 1, 3, 10, 0 },
							{ 9, 2, 3, 4, 6, 1, 0, 4, 1, 3, 100, 0 },
							{ 1, 0, 3, 4, 6, 7, 0, 4, 1, 3, 6, 7 },
							{ 1, 0, 3, 4, 6, 0, 0, 0, 0, 0, 6, 0 },
							{ 1, 0, 3, 4, 6, 7, 0, 4, 1, 3, 6, 0 } };

			String productos[] = { "Jamón", "Morcilla", "Chorizo", "Salchichón", "Paté" };
			String meses[] = {"Enero", "Febrero", "Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
			
			int sumafilas [] = new int [5];
			int sumacolumnas [] = new int [12];
			
			for (int i = 0; i < sumafilas.length; i++) {
				sumafilas[i] = 0;
				for (int j = 0; j < ventas[i].length; j++) {
					sumafilas[i]+=ventas[i][j];
				}
			}
			
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
			System.out.println("El producto que más se vende a lo largo del año es: "+productos[max]);
			System.out.println("El producto que menos se vende a lo largo del año es: "+productos[min]);
	}

}
