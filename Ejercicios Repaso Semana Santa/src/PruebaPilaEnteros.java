
public class PruebaPilaEnteros {

	public static void main(String[] args) {
		
		PilaEnteros pila1 = new PilaEnteros(5);
		
		
		pila1.push(5);
		pila1.push(6);
		pila1.push(4);
		pila1.push(3);
		
		System.out.println(pila1.peek());
		System.out.println(pila1.pop());
		
		if (pila1.estaLleno()) {
			System.out.println("Esta lleno.");
		} else {
			System.out.println("No est� lleno.");
		}
		if (pila1.estaVacio()) {
			System.out.println("Esta vac�o.");
		} else {
			System.out.println("No est� vac�o.");
		}
	}

}
