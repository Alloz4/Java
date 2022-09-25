import java.util.Scanner;

public class Eje01c22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String cadena = "Extraordinario";
		System.out.print("Introduce un número: ");
		int num = sc.nextInt();
		
		System.out.println(ultimasLetras(cadena, num));
	}
	
	public static String ultimasLetras(String cadena, int n) {
		String nuevacadena = "";
		
		nuevacadena = cadena.substring(cadena.length()-n);
		return nuevacadena;
	}

}
