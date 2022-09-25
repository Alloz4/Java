package ficheros;

import java.io.Serializable;

public class Candidato implements Serializable, Comparable<Candidato> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2377506286158734922L;
	private String nombre;
	private int votos;
	
	public Candidato(String nombre, int votos) {
		this.nombre = nombre;
		this.votos = votos;
	}
	public int compareTo(Candidato o) {
		return this.votos - o.votos;
	}

	public String toString() {
		return "Candidato: " + nombre + " Votos: " + votos;
	}
}
