package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import src.Queues;



public class QueueTest {

	Queues test = new Queues();

	@Before
	public void insert(){
		test.add();
	}
	
	@Test
	public void test1() {
					
		String result=test.peek();
		assertEquals("Java",result);
	}
	
	@Test
	public void test2() {
	
			test.remove();
			assertEquals("mongo",test.peek());
	}
	
	@Test
	public void test3() {
		
		test.offer();
		assertEquals("Java",test.element());
	}
	
	@Test
	public void test4() {
		
		test.poll();
		assertEquals("Node.js",test.element());
	}
	
	@Test
	public void test5() {
		
		test.poll();test.poll();test.poll();
		assertEquals("express.js",test.peek());
	}
	
}