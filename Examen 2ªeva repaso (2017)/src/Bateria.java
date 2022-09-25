public class Bateria {
	private int numserie;
	private int carga;
	
	public Bateria(int numero) {
		this.numserie = numero;
		this.carga = 100;
	}
	
	public void cargar (int horas) {
		if (horas > 0) {
			carga += 10 *horas;
		}
		if (carga > 100) {
			carga = 100;
		}
	}
	
	public void descargar (int horas) {
		if (horas > 0) {
			carga -= 10 *horas;
		}
		if (carga < 0) {
			carga = 0;
		}
	}
	
	public boolean estaCargada() {
		boolean cargada = false;
		
		if (carga == 100) {
			cargada = true;
		}
		return cargada;
	}
	
	public boolean estaDescargada() {
		boolean descargada = false;
		
		if (carga == 0) {
			descargada = true;
		}
		return descargada;
	}
	
	public String toString() {
		return "Número de serie: "+numserie+" Carga: "+carga;
	}
}
