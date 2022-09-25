/*
 Declarar	dos	variables	de	tipo	entero	(int)	con	valores	15	y	6.	Sumarlas	y	
restar	1	al	resultado,	almacenándolo	en	una	tercera	variable.	Imprimir el	
resultado	almacenado	en	esa	variable	por	la	salida	estándar.
 */
public class Ejercicio01 {

	public static void main(String[] args) {
		int numa, numb;
		int suma;

		numa = 15;
		numb = 6;

		suma = (numa + numb) - 1;
		
		System.out.println(suma);
	}

}
