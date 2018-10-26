package ejemplo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuadradoTest {

	@Test
	public void test() {
		int a = 20;
		int b = 15;
		
		int suma = a + b;
		
		assertEquals(30, suma);
	}

}
