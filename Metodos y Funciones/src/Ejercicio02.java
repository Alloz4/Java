//Función de tbla html, para llamar a la función se hace desde el main principal.

public class Ejercicio02 {

	public static void main(String[] args) {
		generarHTMLTable(3, 3, "Pepito");
	}
	static void generarHTMLTable ( int filas, int columnas, String contenido){

		System.out.println("<table border=1>");
		for (int i = 0; i <= filas; i++) {
			System.out.println("<tr>");
			for (int j = 0; j <= columnas; j++) {
				System.out.print("<td>"+contenido+"</td>");
			}
			System.out.println("</tr>");
		}
		System.out.println("</table>");
	}
}
