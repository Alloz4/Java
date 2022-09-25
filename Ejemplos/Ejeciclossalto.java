/*
 * PRUEBA de ciclos break y continue
 * 
 */
import java.util.Scanner;

public class Ejeciclossalto {
	
	public static void main (String args[]) {
		
	/* Escribe del 1 al 100 menos los múltiplos de 11 */

	int num =1;
	while  (num <=100)
      {
      if   ( (num % 11)==0)
             {
		 	 num ++;
	 		 continue;
      		 }
      System.out.print(num+" ");
      num ++;
     }
	System.out.println();

	/* Calcula la  suma 100 números, pero si encuentra el número cero termina inmediatamente */

	int Num, Suma, i ;
	Suma = 0;
	Scanner sc = new Scanner(System.in);
	for (i=1; i <=100; i++)
       {
	   Num = sc.nextInt();
       if  ( Num == 0 )
            {
            break;
            }
       Suma = Suma + Num;
       }
	System.out.println(" El resultado es "+ Suma);
	}

}

