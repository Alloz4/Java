import java.util.Scanner;

public class EjercicioBanco {
	
	public static void main(String[] args) {
		int saldo = 0;
		int orden;
		int contador = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Espere mientras el sistema arranca...");
		for (int i = 1; i <= 10; i++) {
			System.out.println("..............");
		}
		do {
			System.out.println("MI BANCO PSEINT");
			System.out.println("1.- Inicializar Cuenta");
			System.out.println("2.- Realizar Ingreso");
			System.out.println("3.- Mostrar Saldo ");
			System.out.println("4.- Sacar dinero ");
			System.out.println("5.- Terminar");
			System.out.print("Elegir opción [1-5]: ");
			orden = sc.nextInt();
			switch (orden) {
			case 1:
				saldo = initCuenta();
				contador += 1;
				break;
			case 2:
				saldo = realizarIngreso(saldo);
				contador += 1;
				break;
			case 3:
				mostrarSaldo(saldo, contador);
				break;
			case 4:
				saldo = sacarDinero(saldo);
				contador += 1;
				break;
			case 5:
				terminar();
				break;
			default:
				System.out.println("Opción errónea");
				for (int i = 1; i <= 5; i++) {
					System.out.println("..............");
				}
				break;
			}
		} while (orden != 5);
	}

	public static int initCuenta() {
		int nuevosaldo;
		Scanner sc = new Scanner(System.in);
		System.out.print("Indique cual va ser su saldo actual: ");
		nuevosaldo = sc.nextInt();
		while (nuevosaldo <= 0) {
			System.out.println("Operación no permitida, su saldo no puede ser negativo o cero");
			System.out.print("Introduzca su saldo actual: ");
			nuevosaldo = sc.nextInt();
		}
		return nuevosaldo;
	}

	public static int realizarIngreso(int saldoactual) {
		int cantidad;
		Scanner sc = new Scanner(System.in);
		System.out.print("Indicar la cantidad a INGRESAR: ");
		cantidad = sc.nextInt();
		if (cantidad <= 0) {
			System.out.println(">Operación no permitida, su ingreso debe ser mayor que 0 euros.");	
		}else {
			saldoactual += cantidad;
			System.out.println(">Operación realizada.");
		}
	return saldoactual;	
	}
	public static void mostrarSaldo(int saldoactual, int contmovimientos) {
		System.out.println("Su saldo actual es de "+saldoactual+" Euros");
		System.out.println("Esta cuenta ha tenido "+contmovimientos+" movimientos.");
		
	}
	public static int sacarDinero(int saldoactual) {
		int sacar;
		Scanner sc = new Scanner(System.in);
		System.out.print("Indica la cantidad a RETIRAR: ");
		sacar = sc.nextInt();
		while (sacar>saldoactual) {
			System.out.println("No te puedes quedar en saldo negativo.");
			System.out.print("Indica la cantidad a RETIRAR: ");
			sacar = sc.nextInt();
		}
		if (sacar <=0) {
			System.out.println(">Operación no permitida, su retirada debe ser mayor a 0 euros.");
		} else {
			saldoactual -= sacar;
			System.out.println(">Operación realizada.");
		}
	return saldoactual;
	}
	public static void terminar() {
		System.out.println("Hasta la próxima");
	}
}
