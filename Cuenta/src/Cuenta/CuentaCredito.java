package Cuenta;

public class CuentaCredito extends Cuenta {

	private double saldoMax;

	public CuentaCredito(String titular, double saldo, double saldoMax) {
		super(titular, saldo);
		this.saldoMax = saldoMax;
	}
	
	public void interesCuenta(double cantidad) {
		if ((saldo - cantidad) > -saldoMax) {
			saldo-= cantidad - cantidad*0.1;
		} else {
			infoError("El descubierto supera el valor del crédito máximo.");
		}
	}
	
}
