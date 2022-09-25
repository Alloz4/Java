import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Eje02_matrices {

	public static void main(String[] args) {
		int oficinas = 0;
		int sumaplantas[] = new int [10];
		int consumoplanta = 0;
		int edificio[][] = { { 10, 4, 3, 8, 5 }, // 1º Planta
							{ 15, 23 }, 
							{ 90 }, 
							{ 9, 34, 15, 1 }, 
							{ 6, 45, 12, 3 }, 
							{ 1, 34, 1, 4 }, 
							{ 4, 4, 124 },
							{ 9, 14, 10, 4 }, 
							{ 9, 4, 10, 6 }, 
							{ 9, 34, 10, 4, 7, 4, 2 } // 10º Planta
		};
		 
		//Recuerda que en una matriz [][] --> el primer [] muestra un numero de filas.
		// El segundo [] muestra los valores que hay en cada fila.
		//IMPORTANTE, no todas las matrices son proporcionales.
		
		//Para contar las oficinas recorro todos los valores que tiene cada fila.
		
		for (int i = 0; i < edificio.length; i++) {
			oficinas += edificio[i].length;
		}
		
		System.out.println("El número total de oficinas que hay en el edificio es: "+oficinas+"\n");
		
		//Cual es el consumo total del edificio.
		
		for (int i = 0; i < edificio.length; i++) {
			for (int j = 0; j < edificio[i].length; j++) {
				sumaplantas[i]+= edificio[i][j];
				consumoplanta += edificio[i][j];
			}
		}
		
		System.out.println("Consumo de plantas \n");
		
		for (int i = 0; i < sumaplantas.length; i++) {
			System.out.println("Planta "+(i+1)+": "+sumaplantas[i]);
		}
		
		System.out.println("Consumo total de plantas: "+consumoplanta);
		
		//Oficina que consume menos y la que consume más
		
		int max = edificio [0][0];
		int min = edificio [0][0];
		int imax = 0;
		int imin = 0;
		int jmax = 0;
		int jmin = 0;
		
		
		for (int i = 0; i < edificio.length; i++) {
			for (int j = 0; j < edificio[i].length; j++) {
				if (edificio[i][j] > max) {
					max = edificio[i][j];
					imax = i;
					jmax = j;
				}
				if (edificio[i][j] < min) {
					min = edificio[i][j];
					imin = i;
					jmin = j;
				}
			}
		}
		System.out.println("El valor máximo de consumo es: "+max+". Se encuentra en la Planta "+(imax+1)+"º y es la oficina "+(jmax+1));
		System.out.println("El valor mínimo de consumo es: "+min+". Se encuentra en la Planta "+(imin+1)+"º y es la oficina "+(jmin+1));
	}

}
