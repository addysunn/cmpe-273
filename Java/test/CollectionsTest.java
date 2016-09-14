package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Collections;

public class CollectionsTest {

	@Test
	public void test1() {

		Collections c = new Collections();
		c.put();
		String result = c.get(04020057);
		
		// match value by entering key.
		assertEquals("xyzrhs@abc.com", result);

	}

	@Test
	public void test2() {

		Collections c = new Collections();
		c.put();
		c.remove(04020057);
		String result = c.get(04020057);
		c.sort();

		// try to retrieve removed element.
		assertEquals(null, result);

	}

}
