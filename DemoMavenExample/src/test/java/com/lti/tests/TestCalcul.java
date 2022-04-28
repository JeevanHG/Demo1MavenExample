package com.lti.tests;

import java.util.ArrayList;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.Calculator;

class TestCalcul {

	/*
	 * @Test void test()
	 *  {
	 *   fail("Not yet implemented"); 
	 *   }
	 */

		Calculator c = new Calculator();
		
		@Test
		public void testHello()
		{
			Assertions.assertEquals("Hello World", c.sayHello());
		}

		@Disabled
		@Test
		public void testAddition()
		{
			Assertions.assertEquals(500, c.addNos(300, 200));
		}
		
		@Disabled
		@Test
		public void testSubtraction()
		{
			Assertions.assertEquals(100,c.subNos(300,200));
		}
		
		@Test
		void testAssertFalse() {
		Assertions.assertFalse("FirstName".length() == 10);
		Assertions.assertFalse(10 > 20, "assertion message");
		}
		
		@Test
		public void testEmptyArrayList() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		Assertions.assertEquals(0, al.size());
		Assertions.assertTrue(al.isEmpty()); // assertTrue Method
		al.add(100);
		al.add(200);
		Assertions.assertEquals(0, al.size());
		// assertFalse(al.isEmpty());
		}


}
