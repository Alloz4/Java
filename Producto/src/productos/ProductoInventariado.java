package productos;

public class ProductoInventariado extends Producto {

	private int cantidad;
	private int beneficio;

	public ProductoInventariado(String identificacion, double precioBase, int cantidad, int beneficio) {
		super(identificacion, precioBase);
		this.cantidad = cantidad;
		this.beneficio = beneficio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public int getBeneficio() {
		return beneficio;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setBeneficio(int beneficio) {
		this.beneficio = beneficio;
	}

	public double precioFinal() {
		return precioBase + (precioBase * beneficio / 100);
	}

	public String toString() {
		return cantidad + " " + super.toString() + "(+" + beneficio + "%)";
	}

}
