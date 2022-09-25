package Cuenta;

public class CuentaNomina extends Cuenta {

	private double nomina;

	public CuentaNomina(String titular, double saldo, double nomina) {
		super(titular, saldo);
		this.nomina = nomina;
	}
	
	public void reintegroNomina(double cantidad) {
		if ((saldo - cantidad) > -nomina) {
			saldo -= cantidad;
		} else {
			infoError("Reintegro, el descubierto supera el valor de la nomina.");
		}
	}
	
}
