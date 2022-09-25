/*
 * Prueba de ciclos PARA (for)
 */

public class Ejeciclospara
 {	
	public static void main (String args[]) {
	
		System.out.println("CICLOS PARA:");
	    System.out.println("Ciclo normal 1 a 10:"); 
		for (int i=1;i<= 10; i++)  
			{
			System.out.print(i+" ");  
			}
		System.out.println("\n--------------------------------");
		System.out.println("Ciclo inverso de 10 a 1:");
		for (int i=10; i>0; i-- )
			{
			System.out.print(i+" ");  
			}
		System.out.println("\n--------------------------------");
        System.out.println("Ciclo con dos índices:");
	    for (int i=0,j=5; i < j; i++,j-- )
			{
			System.out.println(i+":"+j); 
			}
		System.out.println("\n--------------------------------");
        System.out.println("Ciclo con incremento 2:");
		for ( int i= 1; i <= 10; i+=2 ) 
		{
			System.out.print(i+" ");  
		}
		System.out.println("\n--------------------------------");
		System.out.println("Ciclo con decrementos 3:");

		for ( int i = 10;  i >  0; i-=3 )
			{
			System.out.print(i+" ");  
			}
		
		
	}
}

