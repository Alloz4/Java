
public class Coche implements Comparable<Coche>{
	// Definir los atributos

	private String modelo;
	private int distanciatot;
	private int distanciaParcial;
	private boolean motor;
	private int velocidad;
	private int velocidadmax;

	// Definir los métodos

	public Coche(String modelo, int velocidadMax) {
		this.modelo = modelo;
		this.velocidadmax = velocidadMax;
		this.distanciaParcial = 0;
		this.distanciatot = 0;
		this.motor = false;
		this.velocidad = 0;
	}

	public boolean arrancar() {
		if (!motor) {
			motor = true;
			return true;
		} else {
			infoError("Motor ya arrancado.");
			return false;
		}
	}

	public boolean parar() {
		if (motor && velocidad == 0) {
			distanciaParcial = 0;
			velocidad = 0;
			return true;
		} else {
			System.out.println("Motor parado.");
			return false;
		}
	}

	public boolean acelera(int cantidad) {
		if (motor) {
			velocidad += cantidad;
			if (velocidad > velocidadmax) {
				velocidad = velocidadmax;
			}
			return true;
		} else {
			System.out.println("Motor parado. No se puede acelerar");
			return false;
		}
	}

	public boolean frena(int cantidad) {
		if (motor) {
			velocidad -= cantidad;
			if (velocidad < 0) {
				velocidad = 0;
			}
			return true;
		} else {
			System.out.println("Motor parado. No se puede frenar.");
			return false;
		}
	}

	public boolean recorre() {
		if (motor && velocidad < 0) {
			System.out.println("Motor parado.");
			return false;
		} else {
			distanciatot += velocidad;
			distanciaParcial += velocidad;
			return true;
		}
	}

	public String info() {
		return "Modelo: " + modelo + ". Velocidad actual: " + velocidad + ". Estado: " + motor
				+ ". Kilómetros parciales: " + distanciaParcial + ". Kilómetros totales: " + distanciatot;
	}

	public int getKilometros() {
			return distanciaParcial; 
	}

	private void infoError(String mensaje) {
		System.err.println(mensaje);
	}

	@Override
	public int compareTo(Coche otro) {
	    return this.distanciaParcial - otro.distanciaParcial;   
	}
}
