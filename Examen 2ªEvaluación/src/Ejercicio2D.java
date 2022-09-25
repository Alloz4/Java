

public class Ejercicio2D {

	public static void main(String[] args) {
		int tabla1[] = {10,2,5,3,6};
		int tabla2[] = {3,5,10,7,14};
		
		System.out.println(enComun(tabla1, tabla2));
	}
	
	public static int enComun (int ta[], int tb[]) {
		int valorcomun = 0;
		
		for (int i = 0; i < ta.length; i++) {
			for (int j = 0; j < tb.length; j++) {
				if (ta[i] == tb[j]) {
					valorcomun ++;
				}
			}
		}
		return valorcomun;
	}
}
