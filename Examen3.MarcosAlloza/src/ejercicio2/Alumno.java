package ejercicio2;

import java.io.Serializable;

public class Alumno implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5097359604195838984L;
	String nombre;
	int ev1;
	int ev2;
	int ev3;

	Alumno(String nombre, int n1, int n2, int n3) {
		this.nombre = nombre;
		this.ev1 = n1;
		this.ev2 = n2;
		this.ev3 = n3;
	}

	// Creo este metodo para calcular si el alumno esta aprobado o no
	public boolean aprobado() {
		boolean aprobado;
		if (((ev1 + ev2 + ev3) / 3) >= 5) {
			aprobado = true;
		} else {
			aprobado = false;
		}
		return aprobado;
	}

}
