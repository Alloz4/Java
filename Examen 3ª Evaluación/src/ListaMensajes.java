
public class ListaMensajes {

	Mensaje inicio;

	public ListaMensajes() {
		inicio = null;
	}

	// Añado un elemento a la lista
	public void pon(Mensaje msg) {
		msg.siguiente = inicio;
		inicio = msg;
	}

	// Devuelve una nueva lista donde se han incluido los mensajes que son urgentes
	public ListaMensajes obtenerUrgentes() {
        ListaMensajes urgentes = new ListaMensajes();
        if ( inicio != null ){
            Mensaje p1 = inicio;
            Mensaje p2 = inicio.siguiente;
            while ( p2 != null){
               if ( p2.esUrgente){
                   Mensaje nuevo = p2; // Guardo el mensaje
                   p1.siguiente = p2.siguiente; // Lo salto 
                   p2 = p2.siguiente;
                   urgentes.pon(nuevo); // lo añado a la nueva lista
                }
               else {
                  p1 = p2; // Paso al siguiente
                  p2 = p2.siguiente;
                }
            }
            // Compruebo si el primero es tambien urgente
            if ( inicio.esUrgente ){
                Mensaje nuevo = inicio;
                inicio = inicio.siguiente;
                urgentes.pon(nuevo); // lo añado a la nueva lista
            }
        }
        return urgentes;
	}

	// Muestra el contenido de la lista
	public void ver() {
		Mensaje aux = inicio;
		while (aux != null) {
			System.out.println(aux.contenido + ":" + aux.esUrgente);
			aux = aux.siguiente;
		}
	}

}
