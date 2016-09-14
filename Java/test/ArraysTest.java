package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Arra;

public class ArraysTest {

	@Test
	public void test1() {

		Arra a = new Arra();
		int result = a.arrays();
		assertEquals(10,result);
	}
	
	@Test
	public void test2() {

		Arra a = new Arra();
		int result = a.search(9);
		assertEquals(3,result);
	}
	
	@Test
	public void test3() {

		Arra a = new Arra();
		int[] array = { 4, 5, 7, 9, 10, 12, 14, 16, 22, 32};
		int[] result = a.sort();
		assertArrayEquals(array,result);
	}

}
