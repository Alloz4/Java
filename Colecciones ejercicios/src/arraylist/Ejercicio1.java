package arraylist;
import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<String>(6);
		
		nombres.add("Marcos Alloza");
		nombres.add("Bryan Padilla");
		nombres.add("Adrian De Leon");
		nombres.add("Alicia Gómez");
		nombres.add("Adriana Alloza");
		nombres.add("Sandra Alloza");
		
		for (String lista : nombres) {
			System.out.println(lista);
		}
	}

}
