package Cuenta;

public class Cuenta {

	private String titular;
	protected double saldo;

	public Cuenta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public Cuenta() {

	}

	protected void infoError(String palabra) {
		System.out.println("Cuenta de " + titular + " Error: " + palabra);
	}

	public void reintegro(double cantidad) {
		if (cantidad >= 0 && cantidad <= saldo) {
			saldo -= cantidad;
		} else {
			infoError("Valor de reintegro incorrecto.");
		}
	}

	public void ingreso(double cantidad) {
		if (cantidad >= 0) {
			saldo += cantidad;
		} else {
			infoError("Valor de reintegro incorrecto.");
		}
	}

	public String toString() {
		return getClass().getSimpleName() + "Titular: " + titular + " Saldo: " + saldo;
	}
}
