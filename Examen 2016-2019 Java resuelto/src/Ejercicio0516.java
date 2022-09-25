import java.util.Scanner;

public class Ejercicio0516 {
	public static void main(String[] args) {
		char letra;
		int valor;
		int num;
		int precio = 0;
		float descuento = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Elige un número de cestas: ");
		num = sc.nextInt();
		do {
			System.out.print("Elige una cesta [A,B,C]: ");
			letra = sc.next().charAt(0);
		} while (letra!='A' && letra!='B' && letra!='C');
		
		switch (letra) {
		case 'A': 
			valor = 100;
			precio = num * valor;
			break;
		case 'B':
			valor = 200;
			precio = num * valor;
			break;
		case 'C':
			valor = 300;
			precio = num * valor;
			break;
		}
		
		if (precio >= 1000) {
			descuento = precio * 0.10f;
			precio -= descuento;
			System.out.println("Hay un descuento de: "+descuento);
			System.out.println("El importe total con descuento es: "+precio);
		} else {
			System.out.println("El importe total es: "+precio);
		}	
	}
}
