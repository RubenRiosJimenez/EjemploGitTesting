package cl.ubb.testing;

import static org.junit.Assert.*;

import org.junit.Test;


public class MyMathTest {
	
	@Test
	public void AddTwoAndTwoIsFour(){
		int a = 2;
		int b = 2;	
		int expected = 4;
		int result;
		MyMath m = new MyMath();
		
		result = m.add(a, b);
		
		assertEquals(4, result);
	}

}
