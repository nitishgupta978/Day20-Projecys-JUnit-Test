package com.bridgelabz.test.logics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bridgelabz.DemoLogics.Calculation;

public class TestLogicsDemo {
	@Test
	
		public void testfindMaxNumber(){
			assertEquals(4,Calculation.findMaxNumber(new int [] {1,2,4,3}));
			assertEquals(-1,Calculation.findMaxNumber(new int [] {-5,-54,-2,-1}));
	}
}
