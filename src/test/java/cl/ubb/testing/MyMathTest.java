package cl.ubb.testing;

import static org.junit.Assert.*;

import org.junit.Test;


public class MyMathTest {
	
	@Test
	public void addTwoAndTwoIsFour(){
		int a = 2;
		int b = 2;	
		int expected = 4;
		int result;
		MyMath m = new MyMath();
		
		result = m.add(a, b);
		
		assertEquals(expected, result);
	}
	
	@Test
	public void addMinus1AndFourisThree(){
		int a = -1;
		int b = 4;
		int expected = 3;
		int result;
		MyMath m = new MyMath();
		
		result = m.add(a, b);
		
		assertEquals(expected, result);
	}

}
