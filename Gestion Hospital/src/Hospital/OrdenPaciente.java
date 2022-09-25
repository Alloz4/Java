package Hospital;

import java.util.Comparator;

public class OrdenPaciente implements Comparator<Paciente> {

	@Override
	//Comparamos un paciente con otro por el nombre sin importar mayúsculas y minúsculas
	public int compare(Paciente o1, Paciente o2) {
		return o1.getNombre().toLowerCase().compareTo(o2.getNombre().toLowerCase());
	}

}
