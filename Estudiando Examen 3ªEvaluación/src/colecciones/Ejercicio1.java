package colecciones;
import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		ArrayList<String> lista_nombres = new ArrayList<String>();
		
			lista_nombres.add("Marcos");
			lista_nombres.add("Laura");
			lista_nombres.add("Andrea");
			lista_nombres.add("ELisa");
			lista_nombres.add("Sandra");
			lista_nombres.add("Adriana");
		
		for (String nombres : lista_nombres) {
			System.out.println(nombres);
		}

	}

}
