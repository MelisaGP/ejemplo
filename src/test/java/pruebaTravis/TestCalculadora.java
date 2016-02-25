package pruebaTravis;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadora {

	@Test
	public void test() {

		Calculadora calculadora= new Calculadora();
		
		assertTrue(calculadora.multiplicar(2, 2)==4);

	}

}
