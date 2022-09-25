/*
  Pruebas de conversión y redondeo de reales

*/
public class TestConversion {
	
	public static void main (String args[]) {
		 // División entre enteros resultado un entero, los decimales se pierde
		System.out.println(" División 50/3 = "+ 50/3);
		// Calculo en reales se guardan los decimales
		System.out.println(" División 50/3 = "+ 50.0/3); 
		// Se hace el calculo como real pero luego se trunca a entero
		System.out.println(" División 50/3 = "+ (int)(50.0/3));  
		// Entero con redondeo  
		System.out.println(" División 50/3 round  = "+ Math.round(50.0/3));  
		// El real mas alto sin decimales
		System.out.println(" División 50/3  ceil  = "+ Math.ceil(50.0/3));   
		// El real mas bajo sin decimales 
		System.out.println(" División 50/3  floor = "+ Math.floor(50.0/3));  


   }

}

