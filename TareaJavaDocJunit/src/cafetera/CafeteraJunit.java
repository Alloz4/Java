package cafetera;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CafeteraJunit {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetCapacidadMaxima() {
		Cafetera cafetera = new Cafetera();
		assertTrue(cafetera.getCapacidadMaxima() == 1000);
		Cafetera cafetera2 = new Cafetera(5000);
		assertTrue(cafetera2.getCapacidadMaxima() == 5000);
		assertEquals(5000, cafetera2.getCapacidadMaxima());
	}

	@Test
	public void testGetCapacidadActual() {
		Cafetera cafetera = new Cafetera();
		assertTrue(cafetera.getCapacidadActual() == 0);
		assertFalse(cafetera.getCapacidadActual() != 0);
		Cafetera cafetera2 = new Cafetera(2000, 500);
		cafetera2.agregarCafe(250);
		assertTrue(cafetera2.getCapacidadActual() == 750);
	}

	@Test
	public void testLlenarCafetera() {
		Cafetera cafetera = new Cafetera(2000);
		cafetera.llenarCafetera();
		assertEquals(cafetera.getCapacidadActual(), cafetera.getCapacidadMaxima());
		Cafetera cafetera2 = new Cafetera(5000, 100);
		cafetera2.llenarCafetera();
		assertTrue(cafetera2.getCapacidadActual() == 5000);
	}

	@Test
	public void testVaciarCafetera() {
		Cafetera cafetera = new Cafetera(1000, 500);
		cafetera.vaciarCafetera();
		assertEquals(cafetera.getCapacidadActual(), 0);
		Cafetera cafetera2 = new Cafetera(2500, 1000);
		cafetera2.vaciarCafetera();
		assertFalse(cafetera2.getCapacidadActual() != 0);

	}

	@Test
	public void testSevirTaza() {
		Cafetera cafetera = new Cafetera(3000, 100);
		cafetera.llenarCafetera();
		cafetera.servirTaza(500);
		assertTrue(cafetera.getCapacidadActual() == 2500);
		cafetera.servirTaza(1000);
		assertEquals(1500, cafetera.getCapacidadActual());
		cafetera.servirTaza(1000);
		assertFalse(cafetera.getCapacidadActual() != 500);
	}

	@Test
	public void testAgregarCafe() {
		Cafetera cafetera = new Cafetera(2000, 500);
		cafetera.agregarCafe(1000);
		assertTrue(cafetera.getCapacidadActual() == 1500);
		cafetera.agregarCafe(500);
		assertEquals(cafetera.getCapacidadActual(), cafetera.getCapacidadMaxima());
		cafetera.agregarCafe(100);
		assertTrue(cafetera.getCapacidadActual() == 2000);
	}
}
