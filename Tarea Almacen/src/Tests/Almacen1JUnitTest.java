package Tests;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Ignore;
import org.junit.Test;

import iestetuan.daw.almacen.Almacen1;

public class Almacen1JUnitTest {

	@Ignore
	public void posicionesLibres() {
		Almacen1 almacen1 = new Almacen1();
		almacen1.numPosicionesLibres();
		assertTrue(almacen1.numPosicionesLibres() == 10);
	}
	@Test
	public void anadirBuscarValor() {
		//llamar a ponValor x veces
		//buscar valor y comprobar test
		
		Almacen1 almacen1 = new Almacen1();
		
		almacen1.ponValor(5);
		
		assertTrue(almacen1.estaValor(5));
	}

}
