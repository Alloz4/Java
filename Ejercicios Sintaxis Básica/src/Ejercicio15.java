
public class Ejercicio15 {

	public static void main(String[] args) {
		int n=0;
		int resu = 0;
		int veces = 0;
		for (; n <= 10; n+=2){
			System.out.println("FOR: n = "+ n +" veces = "+veces +" resu = "+resu);
			if ( n % 2 == 0)
			    	resu += veces;
			if ( resu > 8)
			    	break;
			veces++;
		     }
		System.out.println("FIN: n = "+ n +" veces = "+veces +" resu = "+resu);

	}

}
