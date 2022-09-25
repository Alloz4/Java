import java.util.Scanner;

public class Ejercicio0719 {
	public static void main(String[] args) {
		int num;
		int cont = 0;
		int cont3y5 = 0;
		float suma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce números:");
		num = sc.nextInt();
		if (num==0) {
			System.out.println("El primer número que introduzcas no puede ser 0.");
			System.out.println("Introduce números:");
			num = sc.nextInt();
		}
		while (num != 0) {
			suma += num;
			cont++;
			if (num % 3 == 0 || num % 5 == 0) {
				cont3y5++;
			}
			num = sc.nextInt();
		}
		System.out.println("La media total de los números introducidos es: "+suma/cont);
		System.out.println("La cantidad de numeros que han sido divisibles entre 3 y 5 son: "+cont3y5);
	}
}
