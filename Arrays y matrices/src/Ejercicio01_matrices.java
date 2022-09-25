import java.util.Arrays;

/***
 * Una empresa de embutidos que produce cinco tipos de productos guarda en una
 * matriz el total de la ventas de cada uno ellos durante los doce meses del
 * año. a) Cual es producto que más se vende y cual menos a lo largo de todo el
 * año. b) En que mes se producen más ventas y cual menos. c) Mostrar si existen
 * productos que no se vendan durante la temporada de verano: julio,agosto y
 * septiembre.
 * 
 * @author alberto
 *
 */
public class  Ejercicio01_matrices{

	public static void main(String[] args) {

		int ventas[][] = { 	{ 9, 0, 3, 4, 6, 7, 0, 4, 1, 3, 10, 0 }, 
							{ 9, 2, 3, 4, 6, 1, 0, 4, 1, 3, 100, 0 },
							{ 1, 0, 3, 4, 6, 7, 0, 4, 1, 3, 6, 7 }, 
							{ 1, 0, 3, 4, 6, 0, 0, 0, 0, 0, 6, 0 },
							{ 1, 0, 3, 4, 6, 7, 0, 4, 1, 3, 6, 0 } };

		String productos[] = { "Jamón", "Morcilla", "Chorizo", "Salchichón", "Paté" };

		int ventasPorProductos[] = new int[ventas.length];
		int ventasPorMes[] = new int[12];
		
		// Suma ventas por producto

		for (int i = 0; i < ventasPorProductos.length; i++) {
			ventasPorProductos[i] = Herramientas.calcularSuma(ventas[i]);
		}

		// Suma por meses
		for (int i = 0; i < ventasPorMes.length; i++) {
			ventasPorMes[i] = 0;
			for (int j = 0; j < ventas.length; j++) {
				ventasPorMes[i] += ventas[j][i];
			}
		}

		int promax = Herramientas.damePosicionMax(ventasPorProductos);
		int promin = Herramientas.damePosicionMin(ventasPorProductos);

		System.out.println(" El producto más vendido es " + productos[promax]);
		System.out.println(" El producto menos vendido es " + productos[promin]);

		int mesmax = Herramientas.damePosicionMax(ventasPorMes);
		int mesmin = Herramientas.damePosicionMin(ventasPorMes);

		System.out.println(" Mes con más ventas " + (mesmax + 1));
		System.out.println(" Mes con menos ventas " + (mesmin + 1));

		for (int i = 0; i < ventas.length; i++) {
			if (ventas[i][6] == 0 && ventas[i][7] == 0 && ventas[i][8] == 0) {
				System.out.println("El producto " + productos[i] + " no tiene ventas en verano");
				;
			}
		}

	}
}
