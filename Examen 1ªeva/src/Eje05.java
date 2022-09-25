import java.util.Scanner;

import javax.lang.model.element.Element;

public class Eje05 {

	public static void main(String[] args) {
		double tarifa, tarifafinde, tarifaviernes;
		char dia;
		char tipo;

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce una tárifa básica: ");
		tarifa = sc.nextDouble();
		System.out.print("Día de la semana del vuelo ('L','M','X','J','V','S','D'): ");
		dia = sc.next().charAt(0);
		System.out.print("Indica el tipo de billete ('N','B'): ");
		tipo = sc.next().charAt(0);

		if (dia == 'S' || dia == 'D') {
			tarifafinde = tarifa * 0.20;
			tarifa += tarifafinde;
		}
		if (dia == 'V') {
			tarifaviernes = tarifa * 0.15;
			tarifa += tarifaviernes;	
		}
		if (tipo=='B') {
			tarifa += 200;
		}
		System.out.println("El precio final del vuelo es: "+tarifa);
	}

}
