package colecciones;

import java.util.HashMap;
import java.util.Map;

public class mapa {
	
	public static void main (String args[]) {
		
		HashMap<Integer, String> mapa = new HashMap<Integer, String>();
		
		mapa.put(1, "Marcos Alloza");
		mapa.put(1, "Alicia G�mez");
		mapa.put(924, "Amalia N��ez");
		mapa.put(921, "Cindy Nero");
		mapa.put(700, "C�sar V�zquez");
		mapa.put(219, "V�ctor Tilla");
		mapa.put(537, "Alan Brito");
		mapa.put(605, "Esteban Quito ");

		mapa.remove(1);
		for (Map.Entry<Integer, String> valores : mapa.entrySet()) {
			System.out.println(valores);
		}
		
		if (mapa.containsKey(924)) {
			mapa.remove(924);
		}
		
		System.out.println(mapa.entrySet());
		
	}
}
