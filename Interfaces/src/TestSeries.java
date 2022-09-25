
public class TestSeries {

	public static void main(String[] args) {
		
		SeriePares sp = new SeriePares();
		
		SeriePotencia5 s5 = new SeriePotencia5();
		
		s5.setComenzar(25);
		
		for (int i = 0; i < 10; i++) {
			System.out.print(s5.getSiguiente()+",");
		}
		
		System.out.println("\nNúmeros generados: "+ s5.getContador());
		
		Series tSeries[] = new Series[3];
		
		tSeries[0] = s5;
		tSeries[1] = sp;
		tSeries[2] = s5;
		
		for (int i = 0; i < tSeries.length; i++) {
			System.out.println(tSeries[i].getSiguiente());
			
		}
	}

}
