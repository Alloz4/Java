import java.util.Random;

public class TestBateria {

	public static void main(String[] args) {
		
		//Creo el array de objecto
		Bateria [] baterias = new Bateria[10];
		
		int cont = 5001;
		for (int i = 0; i < baterias.length; i++) {
			baterias[i]= new Bateria(cont);
			cont++;
		}
		
		Random azar = new Random();
		
		for (int i = 0; i < baterias.length; i++) {
			baterias[i].descargar(azar.nextInt(10)+1);
			baterias[i].cargar(azar.nextInt(10)+1);
		}
		
		for (int i = 0; i < baterias.length; i++) {
			if (baterias[i].estaCargada()) {
				System.out.println(baterias[i].toString());
			}
		}
	}

}
