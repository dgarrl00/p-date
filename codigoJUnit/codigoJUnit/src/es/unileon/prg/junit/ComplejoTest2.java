package es.unileon.prg.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ComplejoTest2 {

	private Complejo c1;
	private Complejo c2;

	@Before
	public void setUp() throws Exception {
		c1 = new Complejo(3, 5);
		c2 = new Complejo(1, -1);
	}

	@Test
	public void testSumar (){
		Complejo resultado = c1.sumar(c2);
		assertEquals(resultado.getParteReal(), 4f, 0.001);
		assertEquals(resultado.getParteImaginaria(), 4f, 0.001);
	}     

	@Test
	public void testDividir() {
		Complejo resultado = c1.dividir(c2);
		assertEquals(resultado.getParteReal(), -1f, 0.001);
		assertEquals(resultado.getParteImaginaria(), 4f, 0.001);
	}

	@Test(expected = ArithmeticException.class)
	public void testDividirPorCero(){
		Complejo c3 = new Complejo(0, 0);
		c1.dividir(c3);
	}

}
