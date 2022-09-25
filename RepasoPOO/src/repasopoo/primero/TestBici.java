package repasopoo.primero;

public class TestBici {
	public static void main(String[] args) {

		System.out.println("Bicis creadas: " + Bicicleta.bicisFabricadas());
		System.out.println("Distancia: " + Bicicleta.calcularDistancia(26, 10));

		Bicicleta mia = new BiciMontaña("Rojo", 1000, 100);
		Bicicleta tuya = new BiciElectrica("Azul", 400, 10);
		Bicicleta suya = new BiciMontaña("Negra", 2050, 120);

		Bicicleta misBicicletas[] = new Bicicleta[4];

		misBicicletas[0] = mia;
		misBicicletas[1] = tuya;
		misBicicletas[2] = suya;
		misBicicletas[3] = new BiciMontaña("Amarilla", 3000, 300);

		for (Bicicleta bicicleta : misBicicletas) {
			bicicleta.verInfo();
		}

		for (int i = 0; i < misBicicletas.length; i++) {
			misBicicletas[i].verInfo();
		}

		System.out.println("Bicis creadas: " + Bicicleta.bicisFabricadas());

	}
}
