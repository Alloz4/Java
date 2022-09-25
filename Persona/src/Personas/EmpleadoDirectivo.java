package Personas;
public class EmpleadoDirectivo extends Empleado {

	private double porcentajeBeneficios;
	private static int beneficios;

	public EmpleadoDirectivo(String nombre, Fecha fechaNacimiento, int dni, int sueldoBase, double porcentajeBeneficios) {
		super(nombre, fechaNacimiento, dni, sueldoBase);
		this.porcentajeBeneficios = porcentajeBeneficios;
	}

	static public void setBeneficios(int valor) {
		beneficios = valor;
	}

	public int getSueldo() {
		return super.getSueldo() + (int) (beneficios * porcentajeBeneficios / 100.0);
	}

}
