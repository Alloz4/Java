import java.sql.DataTruncation;
import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
			double base, altura;
			double area;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Escribe la base de la habitación: ");
			base = sc.nextDouble();
			System.out.print("Escribe la altura de la habitación: ");
			altura = sc.nextDouble();
			
			area = base * altura;
			
			System.out.println("El área de la habitación es: "+base+" x "+altura+" = "+area);
	
	}

}
