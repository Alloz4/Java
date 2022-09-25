package Cuenta;

import java.util.Random;
import java.util.Scanner;

public class PruebaCuenta {

	static Scanner sc;

	public static void main(String[] args) {

		Random azar = new Random();

		Scanner sc = new Scanner(System.in);

		Cuenta cuenta[] = new Cuenta[4];

		cuenta[0] = new Cuenta("Marcos Alloza García", 1500);
		cuenta[1] = new CuentaCredito("Alicia Gómez Montoya", 1500, 2000);
		cuenta[2] = new CuentaAhorro("Silvia García Pérez", 2000);
		cuenta[3] = new CuentaCredito("Alberto Alloza Quevedo", 5000, 1000);

		for (int i = 0; i < cuenta.length; i++) {
			cuenta[i].ingreso(azar.nextInt(10000));
			cuenta[i].reintegro(azar.nextInt(20000));
		}

		System.out.println(" CUENTAS BANCARIAS ");
		// For- each
		for (Cuenta c : cuenta) {
			// Se invoca al metodo toString
			System.out.println(c);
		}

		sc.close();
	}
}