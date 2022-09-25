
public class Ejercicio2 {

	public static void main(String[] args) {

		ListaMensajes lmensajes = new ListaMensajes();
		ListaMensajes lurgentes = new ListaMensajes();

		lmensajes.pon(new Mensaje("Hola", false));
		lmensajes.pon(new Mensaje("Peligro", true));
		lmensajes.pon(new Mensaje("Calma", false));
		lmensajes.pon(new Mensaje("Virus", true));

		lurgentes = lmensajes.obtenerUrgentes();

		lmensajes.ver(); // Mostrará Hola y Calma
		lurgentes.ver(); // Mostrará Peligro y Virus
	}
}
