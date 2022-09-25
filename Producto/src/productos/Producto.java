package productos;

public class Producto {

	private String identificacion;
	protected double precioBase;

	public Producto(String identificacion, double precioBase) {
		this.identificacion = identificacion;
		this.precioBase = precioBase;
	}

	public Producto() {
	}

	public String getIdentificacion() {
		return identificacion;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	@Override
	public String toString() {
		return identificacion +"("+precioBase+")"; 
	}
	
	
	
}
