import java.util.Scanner;

public class CalculoFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Escribe numero: ");
		numero = sc.nextInt();
		int resultado=calcFactorial(numero);
		System.out.println(resultado);
	}
	static int calcFactorial ( int numero) {
		int resu = 1;
		for (int i = 1; i <= numero; i++) {
			resu=resu*i;
		}
		return resu;
	}
	static int calcCombinaciones(int m, int n) {
		return calcFactorial(m) / calcFactorial(n)*(calcFactorial(m-n));
	}
}
