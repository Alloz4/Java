package ejemploTestUnitarios;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class ContabilidadTest {

	@Ignore
	public void test() {
		Contabilidad contabilidad = new Contabilidad();
		contabilidad.ingresar(30.0);
		assertTrue("Ha ido bien",contabilidad.saldo == 30.0);
		contabilidad.ingresar(20.0);
		assertFalse(contabilidad.saldo < 50);
		//assertEquals sirve para comparar varios objects
		assertEquals(contabilidad.saldo,contabilidad.saldo);	
	}
	@Test
	public void test2() {
		Contabilidad contabilidad = new Contabilidad();
		contabilidad.ingresar(30.0);
		contabilidad.extraer(50.0);
		assertTrue(contabilidad.saldo >= 0.0);
	}

}
