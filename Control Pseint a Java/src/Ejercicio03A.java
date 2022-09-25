import java.util.Scanner;

public class Ejercicio03A {

	public static void main(String[] args) {
		int salario;
		int m3000, entre1000y3000, menos1000;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce 20 salarios de los empleados: ");
		
		m3000 = 0;
		entre1000y3000 = 0;
		menos1000 = 0;
		
		for (int i = 1; i <= 3; i++) {
			salario = sc.nextInt();
			if (salario > 3000) {
				m3000 += 1;
			} else {
				if (salario < 1000) {
					menos1000 += 1;
				} else {
					entre1000y3000 += 1;
				}
			}
		}
		System.out.println("¿Cuántas personas ganan más de 3.000 Euros/mes? " + m3000);
		System.out.println("¿Cuántas personas ganan entre  1.000 y 3.000 Euros/mes? " + entre1000y3000);
		System.out.println("¿Cuántas personas ganan menos de 1.000 Euros/mes? " + menos1000);
	}
}
