package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import src.student1;
import src.student2;

public class InterfaceTest {

	@Test
	public void test1() {
		
		student1 s1 = new student1();
		String result = s1.subjects("273");
		assertEquals("273",result);
		
	}

	@Test
	public void test2() {
		
		student1 s1 = new student1();
		int result = s1.result("Aditya",93);
		assertEquals(93,result);
		
	}
	
	@Test
	public void test3() {
		
		student1 s1 = new student1();
		int result = s1.sports(87);
		assertEquals(87,result);
		
	}
}
