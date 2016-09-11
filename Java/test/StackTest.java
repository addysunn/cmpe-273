package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import src.stack;

public class StackTest {
	stack s = new stack();
	@Before
	public void insert(){
		s.pushDemo();
	}
	
	@Test
	public void test1() {
					
		int result=s.popdemo();
		assertEquals(5,result);
	}
	

	@Test
	public void test2() {
					
		int result=s.peekdemo();
		assertEquals(5,result);
	}
	
	@Test
	public void test3() {
		
		boolean wrong=s.empty();	
		assertFalse(wrong);
	}
		
	@Test
	public void test4() {
		
		int srch=s.search();	
		assertEquals(-1,srch);
	}
	
}
