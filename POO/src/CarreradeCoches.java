/*
 *  Simulación sencilla de una carrera de coches
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CarreradeCoches {
	
	public static void main(String[] args) {
			
		Random valor = new Random();  // Variable que me genera números aleatorios
		final int META = 800; // 500 kilómetros		
		ArrayList<Coche> parrilla = new ArrayList<Coche>(); // Parrilla de salida con 5 coches
	
		
		parrilla.add( new Coche ("Ferrari",300));
		parrilla.add( new Coche ("600",100));
		parrilla.add( new Coche ("BMW",220));
		parrilla.add( new Coche ("Seat",150));
		parrilla.add( new Coche ("La Cabra",10));
		
		// Test de pruebas para comporbar la detección de errores
	
		Coche c1 = parrilla.get(0);
		Coche c2 = parrilla.get(1);
		c1.acelera(10);
		c2.frena(20);
		c1.parar();
		c2.recorre();
	
		
		// Arranquen los motores
		for(int i=0; i< parrilla.size(); i++){
			parrilla.get(i).arrancar();
		}
		
		// Comienza la carrera
		/**
		 Tambien se puede hacer de esta manera:
		 do {
			for (Coche c: parrilla) {
				c.acelera(valor.nextInt(30));
				c.recorre();
				c.frena(valor.nextInt(10));
				System.out.println(c.info());
			}
		 */
		do {
			for (int i = 0; i < parrilla.size(); i++) {
				parrilla.get(i).acelera(valor.nextInt(30));
				parrilla.get(i).recorre();
				parrilla.get(i).frena(valor.nextInt(10));
				System.out.println(parrilla.get(i).info());
			}
			System.out.println("----------------------------------------");
				
		} while ( ! alcanzarMeta ( parrilla, META) );

		// Ordena la tabla para mostrar la clasificación
	    Collections.sort(parrilla);
		
	    
		// Muestra la clasificación
		for(int i=0; i< parrilla.size(); i++){
			System.out.println((i+1)+"º Clasificado "+ parrilla.get(i).info());
		}
		
	
	}








	// MÉTODOS AUXILIAREs
	// Devuelve verdadero si hay algun coche que haya recorrido la distancia indicada.
	
	static public boolean alcanzarMeta ( ArrayList<Coche> tcoches, int distancia){
		boolean fin = false;
		for (int t = 0; t < tcoches.size(); t++) {
		     if ( tcoches.get(t).getKilometros() >= distancia ){
		    	 fin = true;
		    	 break;
		     }
		}
		return fin;
	}
}
	


