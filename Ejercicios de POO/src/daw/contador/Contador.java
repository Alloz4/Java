package daw.contador;

public class Contador {

	private int contador;

	// Constructor por defecto
	public Contador() {
	}

	// Constructor con datos
	public Contador(int contador) {
		this.contador = contador;
	}

	// Constructor copia
	public Contador(Contador c) {
		this.contador = c.contador;
	}
	//Getter
	public int getContador() {
		return contador;
	}
	//Setter
	public void setContador(int contador) {
		this.contador = contador;
	}
	
	//Creamos el método para incrementar el contador
	public void incrementar() {
		contador++;
	}
	
	//Metodo para decrementar el contador
	public void decrementar() {
		contador--;
		if (contador < 0) {
			contador = 0;
		}
	}
	
	
	
}
