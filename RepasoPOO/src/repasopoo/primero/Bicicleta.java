package repasopoo.primero;

public abstract class Bicicleta {
	private String color;
	protected int velocidad;
	private int precio;
	protected int marcha;
	static int numerodeBicisCreadas;
	
	static int calcularDistancia (int radio, int vueltas) {
		return (int) (2*3.1416*radio*vueltas);
	}
	
	static int bicisFabricadas() {
		return numerodeBicisCreadas;
	}
	
	//CONSTRUCTOR 
	public Bicicleta (String color, int precio) {
		this.color = color;
		this.precio = precio;
		this.marcha = 0;
		this.velocidad = 0;
		numerodeBicisCreadas++;
	}
	public Bicicleta() {
		this("Gris",500);		
	}
	
	public void fijarMarcha(int nuevamarcha) {
		if (nuevamarcha > 0) {
			this.marcha = nuevamarcha;
		}
	}
	
	public void frenar() {
		velocidad = 0;
	}
	
	public abstract void pedalear(int fuerza);
	
	public void verInfo() {
		System.out.print("Color: "+color);
		System.out.print(" Precio: "+precio);
		System.out.println(" Velocidad: "+velocidad);
	}
}
