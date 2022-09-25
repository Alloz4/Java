import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int numero = 0;
		test(numero);
	}
	public static void test ( Integer n ){
		 int resu;

		 System.out.print("A");
		 try {
		 System.out.print ("B1");
		 resu = 1 / n;
		 System.out.print ("B2");
		 }
		 catch ( ArithmeticException ex){
		 System.out.print ("C");
		 }
		 catch ( Exception ex ){
		 System.out.print ("D");
		 }
		 finally {
		 System.out.print("E");
		 }
		 System.out.println ("F");
		 }

}
