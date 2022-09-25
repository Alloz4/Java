
public class ListaCadenas {
	// instance variables - replace the example below with your own
	NodoCadena primero;

	/**
	 * Constructor for objects of class ListaNodos
	 */
	public ListaCadenas() {

		primero = null;
	}

	public void ponAlPrincipio(String valor) {
		NodoCadena nuevo = new NodoCadena();
		nuevo.valor = valor;
		nuevo.siguiente = primero;
		primero = nuevo;
	}
	
	public String toString() {
		String resu = "";
		NodoCadena aux = primero;
		while (aux!= null) {
			resu+=aux.valor+"\n";
			aux = aux.siguiente;
		}			
		return resu;
	}
}

