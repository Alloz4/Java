import java.util.Scanner;

public class Ejercicio0416 {
	public static void main (String[] args) {
		int num;
		int contpares = 0;
		int contimpares = 0;
		int pares = 0;
		int impares = 0;
		int mediapares = 0;
		int mediaimpares = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Esribe números enteros:");
		
		num = sc.nextInt();
		
		while (num !=0) {
			if (num%2==0) {
				contpares++;
				pares+=num;
			}else {
				contimpares++;
				impares+=num;
			}
			num = sc.nextInt();
		}
		mediapares = pares / contpares;
		mediaimpares = impares / contimpares;
		System.out.println("El número total de valores introducidos es: "+(contimpares+contpares));
		System.out.println("La media de los números pares es: "+mediapares);
		System.out.println("La media de los números impares es: "+mediaimpares);
		if (mediaimpares == mediapares) {
			System.out.println("El valor de las medias pares es igual al valor de las medias impares");
		}else if (mediapares > mediaimpares) {
			System.out.println("El valor mayor es la media de los pares.");
		}else {
			System.out.println("El valor mayor es la media de los impares");
		} 
		
	}
}
