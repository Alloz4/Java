package productos;

public class Tienda {
	private String miembro;
	private ProductoInventariado[] inventario;
	private double caja;
	
	public Tienda(String miembro, double caja, int numMax) {
		this.miembro = miembro;
		this.caja = caja;
		inventario = new ProductoInventariado[numMax];
	}
	
	public ProductoInventariado buscaProducto(String id) {
		ProductoInventariado p = null;
		
		for (int i = 0; i < inventario.length; i++) {
			if ( inventario[i] != null && 
				 inventario[i].getIdentificacion().equals(id) ) {
				p = inventario[i];
				break;
			}
		}
		return p;
	}
	
}
