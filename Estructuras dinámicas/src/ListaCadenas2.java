
public class ListaCadenas2 {
	NodoCadena2 primero;

	/**
	 * Constructor for objects of class ListaNodos
	 */
	public ListaCadenas2() {

		primero = null;
	}

	public NodoCadena2 buscar(String valor) {
		NodoCadena2 resu = null;
		NodoCadena2 aux = primero;
		
		while (aux != null) {
			if (aux.valor.compareTo(valor) == 0) {
				resu = aux;
				break;
			}else {
				aux = aux.siguiente;	
			}
			
		}
		
		return resu;
	}

	public void ponAlPrincipio(String valor) {
		NodoCadena2 repe = buscar(valor);
		
		if (repe!= null) {
			repe.veces++;
		} else {
			NodoCadena2 nuevo = new NodoCadena2();
			nuevo.valor = valor;
			nuevo.veces = 1;
			nuevo.siguiente = primero;
			primero = nuevo;
		}
	}

	public String toString() {
		String resu = "";
		NodoCadena2 aux = primero;
		while (aux != null) {
			resu += aux.valor +" (" + aux.veces +")" + "\n";
			aux = aux.siguiente;
		}
		return resu;
	}
}
