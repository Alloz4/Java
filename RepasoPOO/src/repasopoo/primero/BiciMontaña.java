package repasopoo.primero;

public class BiciMontaña extends Bicicleta {

	private int amortiguacion;

	@Override
	public void pedalear(int fuerza) {
		velocidad = fuerza * marcha;
	}

	public BiciMontaña(String color, int precio, int amortiguacion) {
		super(color, precio);
		this.amortiguacion = amortiguacion;
	}
}
