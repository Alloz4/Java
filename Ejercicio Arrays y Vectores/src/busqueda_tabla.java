import java.util.Scanner;

public class busqueda_tabla {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tabla[] = {1,23,2,4,5,6,8,10,15};
		int valor;
		
		System.out.print("Introduce un valor: ");
		
		valor = sc.nextInt();
		boolean encontrado = false;
		int pos=-1;
		for (int i = 0; i < tabla.length; i++) {
			if (valor == tabla[i]) {
				encontrado = true;
				pos = i;
				break;
			}
		}
		
		if (encontrado == true) {
			System.out.println("El valor está en la tabla en la posicion: "+pos);
		} else {
			System.out.println("El valor no está en la tabla.");
		}
		
		}
	}
