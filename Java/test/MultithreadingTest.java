package test;

import src.consume;
import src.produce;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import src.consume;
import src.produce;

public class MultithreadingTest {

	@Test
	public void test1() {

		produce p = new produce();

		Thread productThread = new Thread(p, "productThread");

		boolean result = p.producer();
		assertTrue(result);
	}
}
