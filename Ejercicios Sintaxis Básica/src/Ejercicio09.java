import java.sql.DataTruncation;
import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
			double base, altura;
			double area;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Escribe la base de la habitaci�n: ");
			base = sc.nextDouble();
			System.out.print("Escribe la altura de la habitaci�n: ");
			altura = sc.nextDouble();
			
			area = base * altura;
			
			System.out.println("El �rea de la habitaci�n es: "+base+" x "+altura+" = "+area);
	
	}

}
