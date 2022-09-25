
public class Bicicleta implements Comparable<Bicicleta> {

	int id;
	String marca;
	int precio;
	int año;

	public Bicicleta(int id, String marca, int precio, int año) {
		this.id = id;
		this.marca = marca;
		this.precio = precio;
		this.año = año;
	}

	public String toString() {
		return "Id=" + id + " Marca=" + marca + " Precio=" + precio + " Año=" + año;
	}

	// Compara por el id
	public int compareTo(Bicicleta o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}

}
