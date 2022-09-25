import java.util.Scanner;

public class Ejercicio01B {

	public static void main(String[] args) {
		int estatura;
		int estaturamayor, estaturamenor;
		float estaturamedia;
		int numalumnos;

		Scanner sc = new Scanner(System.in);

		numalumnos = 40;

		System.out.println("Introduce los datos de las estaturas: ");
		estatura = sc.nextInt();

		estaturamayor = estatura;
		estaturamenor = estatura;
		estaturamedia = estatura;

		for (int i = 2; i <= numalumnos; i++) {
			estatura = sc.nextInt();
			if (estatura > estaturamayor) {
				estaturamayor = estatura;
			} else {
				if (estatura < estaturamenor) {
					estaturamenor = estatura;
				}
			}
			estaturamedia += estatura;
		}
		estaturamedia = (float) estaturamedia / numalumnos;
		System.out.println("La estatura máxima es: " + estaturamayor);
		System.out.println("La estatura mínima es: " + estaturamenor);
		System.out.println("La estatura media es: " + estaturamedia);
	}
}
