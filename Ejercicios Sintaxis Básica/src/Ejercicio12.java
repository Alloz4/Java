import java.util.Scanner;

/*
Leer	 un	 n�mero	 de	 cuatro	 d�gitos	 (no	 cuatro	 d�gitos	 por	 separado)	 y	
cifrarlo	de	la	siguiente	manera:	reemplazar	cada	d�gito	por	la	suma	de	ese	
d�gito	 +	 7	 m�dulo	 10.	 Despu�s	 intercambiar	 el	 primer	 d�gito	 con	 el	
tercero	 y	 el	 segundo	 con	 el	 cuarto	 y	 despu�s	 imprimir	 el	 n�mero	
resultante
 */
public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        System.out.print("Dime un n�mero de 4 d�gitos:");
        int valor = stdIn.nextInt();
        int digito1 = valor%10;
        int digito2 = valor/10%10;
        int digito3 = valor/100%10;
        int digito4 = valor/1000%10;

        digito1 = (digito1 + 7) % 10;
        digito2 = (digito2 + 7) % 10;
        digito3 = (digito3 + 7) % 10;
        digito4 = (digito4 + 7) % 10;

        int temporal;

        temporal = digito1;
        digito1 = digito3;
        digito3 = temporal;

        temporal = digito2;
        digito2 = digito4;
        digito4 = temporal;

        int resultado = digito1+(digito2*10)+(digito3*100)+(digito4*1000);
        
        System.out.print("El resultado es ");
        System.out.println(resultado);
    }

}