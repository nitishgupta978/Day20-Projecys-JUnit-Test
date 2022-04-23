package com.bridgelabz.test.logics;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bridgelabz.Regextest.ValidationOfRegexTest;

public class TestLogicsRegistrasions {
	@BeforeClass
	public static void testUpBeforeClass() throws Exception {
		System.out.println("Throws BeforeClass");
	}
	@Before
	public void setUp() {
		System.out.println("Before");
	}
	@Test
	public void  testCheckStartWithCap() throws Exception {
		System.out.println("Test case Start With CAP");
		assertEquals(true,ValidationOfRegexTest.CheckStartWithCap("Nitish"  ));
	}
	
	@Test
	public void TestCheckAllDigit() {
		System.out.println("Test Check All Digits");
		assertEquals(true,ValidationOfRegexTest.CheckAllDigit("918882160058"));
	}
	@Test
	public void TestCheckPreDefinePassWord() {
		System.out.println("Test Check Pre Define PassWord");
		assertEquals(true,ValidationOfRegexTest.CheckPreDefinePassWord("Nit853@1"));
	}
	@Test
	public void TestCheckEmai() {
		System.out.println("Test Check Pre Define PassWord");
		assertEquals(true, ValidationOfRegexTest.CheckEmail("nkg@gmail.com"));
	}
	
	@After
	public void TesAfter() {
		System.out.println("After") ;
	}
	@AfterClass
	public static void TestAfter ()throws Exception {
		System.out.println("After Class") ;
	}
	
}
