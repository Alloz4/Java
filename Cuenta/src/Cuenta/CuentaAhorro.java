package Cuenta;

public class CuentaAhorro extends Cuenta {

	
	public CuentaAhorro(String titular, double saldo) {
		super(titular, saldo);
	}
	
	public void ingreso (double cantidad) {
		if (cantidad > 0) {
			saldo += cantidad + cantidad*0.1;
		} else {
			infoError("Valor de ingreso no valido en cuenta de credito");
		}
	}
}
