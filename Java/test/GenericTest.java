package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Generic;

public class GenericTest {

	@Test
	public void test1() {
		
		Generic T = new Generic();
		String result = T.name();
		assertEquals("Honda Civic", result);
		}
	
	@Test
	public void test2() {
		
		Generic T = new Generic();
		int result = T.price();
		assertEquals(35, result);
		}

	@Test
	public void test3() {
		
		Generic T = new Generic();
		Double result = T.mileage();
		assertEquals(Double.doubleToLongBits(16.2), Double.doubleToLongBits(result));
		}
	
}
