package productos;

public class TestProducto {
	public static void main (String args[]) {
		
		Producto cable = new Producto("RJ45",10.45);
		Producto cable2 = new ProductoInventariado("Switch", 20.99, 5, 50);
		
		System.out.println(cable.toString());
		System.out.println(cable2.toString());
		
		
		
	}
}
