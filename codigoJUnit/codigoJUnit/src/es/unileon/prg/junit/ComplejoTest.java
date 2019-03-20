package es.unileon.prg.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComplejoTest {

	@Test
	public void testSumar (){
		// 1.
		Complejo c1 = new Complejo(3, 5);
		Complejo c2 = new Complejo(1, -1);
		// 2. 
		Complejo resultado = c1.sumar(c2);
		// 3.
		assertEquals(resultado.getParteReal(), 4f, 0.001);
		assertEquals(resultado.getParteImaginaria(), 4f, 0.001);
	}     

}
