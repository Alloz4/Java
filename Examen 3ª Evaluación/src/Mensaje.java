
public class Mensaje {

	String contenido; // Contenido del mensaje
	boolean esUrgente; // true o false
	Mensaje siguiente; // Siguiente mensaje en la lista

	Mensaje(String contenido, boolean esUrgente) {
		this.contenido = contenido;
		this.esUrgente = esUrgente;
		this.siguiente = null;
	}

}
