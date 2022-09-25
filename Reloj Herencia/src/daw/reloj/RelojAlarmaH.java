package daw.reloj;

import javax.swing.JOptionPane;

/**
 * Clase Reloj con Alarma que hereda de la clase Reloj
 * 
 * @author Marcos
 *
 */
public class RelojAlarmaH extends Reloj {

	private int segundosalarma;
	private boolean alarmaActivada;

	// Constructor de la nueva clase
	RelojAlarmaH(int hora, int minutos, int segundos) {
		// Constructor clase padre 1� Instrucci�n
		super(hora, minutos, segundos);
		this.alarmaActivada = false;
	}

	// Nuevo m�todo
	void setAlarma(int hora, int minutos) {
		segundosalarma = hora * 3600 + minutos * 60;
		alarmaActivada = true;
	}

	// Nuevo m�todo
	void activarAlarma(boolean estado) {
		alarmaActivada = estado;
	}

	// Incrementa en un segundo el valor de reloj y chequea la alarma
	// Sobrescribe el m�todo de tictac
	@Override
	public void tictac() {
		segundos++;
		// Mayor 3600 * 24
		if (segundos > 86400)
			segundos = 0;
		if (segundos == segundosalarma && alarmaActivada) {
			JOptionPane.showMessageDialog(null, " ALARMA... " + mostrar());
		}
	}
}
