package Hospital;

import java.util.Arrays;

public class Hospital {
	private Paciente tpacientes[]; // Al inicio todas las posiciones son igual a null
	private int contadorpacientes;

	public Hospital(int numpacientes) {
		tpacientes = new Paciente[numpacientes];
		contadorpacientes = 0;
	}

	// Ingreso de un paciente al hospital, devuelve false si no cabe
	public boolean ingreso(Paciente p) {
		boolean ingresar = false;
		if (contadorpacientes < tpacientes.length) {
			tpacientes[contadorpacientes] = p;
			contadorpacientes++;
			ingresar = true;
		}
		return ingresar;
	}

	// Alta del paciente - se borra de la tabla, su posición se pone a null
	// Devuelve false si no se encuentra
	public boolean alta(int id_paciente) {
		boolean darAlta = false;
		// Buscamos el id en la tabla pero solo en las posiciones donde hay pacientes
		for (int i = 0; i < contadorpacientes; i++) {
			if (tpacientes[i].getId() == id_paciente) {
				tpacientes[i] = null;
				// Una vez encontramos el id, movemos los pacientes hacia la izquierda
				// A su vez movemos los null(espacios libres) a la derecha
				for (int j = i; j < tpacientes.length - 1; j++) {
					tpacientes[j] = tpacientes[j + 1];
				}
				contadorpacientes--;
				darAlta = true;
				break;
			}
		}
		return darAlta;
	}

	// Devuelve el paciente con el identidador indicado o null si no existe
	public Paciente buscar(int id) {
		boolean encontrado = false;
		Paciente p = null;
		for (int i = 0; i < contadorpacientes; i++) {
			if (id == tpacientes[i].getId()) {
				encontrado = true;
				p = tpacientes[i];
			}
			if (encontrado) {
				break;
			}
		}
		return p;
	}

	// Imprime por consola la lista ORDENADO por NOMBRE de pacientes ***

	public void listapacientes() {
		OrdenPaciente comparador = new OrdenPaciente();
		Arrays.sort(tpacientes, 0, contadorpacientes, comparador);
		System.out.println("---LISTADO DE PACIENTES(POR NOMBRE)---");
		for (int i = 0; i < contadorpacientes; i++) {
			System.out.println(tpacientes[i].toString());
		}
	}

	// Devuelve el mas grave o el caso de paciente con la misma gravedad el
	// que su identificador sea mas bajo.
	public Paciente pacienteMasUrgente() {
		Paciente urgencia = null;
		PacienteGrave pacienteUrgente = null;
		// Si no hay pacientes en la tabla se devuelve un valor null
		if (contadorpacientes == 0) {
			return urgencia;
		}
		// Se busca si hay pacientes con alguna gravedad
		for (int i = 0; i < contadorpacientes; i++) {
			Paciente p = tpacientes[i];
			if (p.getClass().getSimpleName().equals("PacienteGrave")) {
				PacienteGrave pacienteGrave = (PacienteGrave) p;
				// A partir de aquí comparamos pacientes con algun tipo de gravedad
				if (pacienteUrgente != null) {
					// Buscamos el paciente con mayor gravedad, a menor valor mas gravedad (así lo
					// tenemos definido en la clase TipoGravedad)
					if (pacienteGrave.getGravedad().ordinal() < pacienteUrgente.getGravedad().ordinal()) {
						pacienteUrgente = pacienteGrave;
					}
					// Si la gravedad es la misma, buscamos el que menor id tiene
					if (pacienteGrave.getGravedad() == pacienteUrgente.getGravedad()
							&& pacienteGrave.getId() < pacienteUrgente.getId()) {
						pacienteUrgente = pacienteGrave;
					}
				} else {
					pacienteUrgente = pacienteGrave;
				}
			}
		}
		return pacienteUrgente;
	}
}