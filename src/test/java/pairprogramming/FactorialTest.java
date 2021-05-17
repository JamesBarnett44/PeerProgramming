package pairprogramming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;




public class FactorialTest {
	
Runner factorial = new Runner();

	@Test
	public void test() {
		assertEquals("5!", Runner.factorial(120f));
	}

}
