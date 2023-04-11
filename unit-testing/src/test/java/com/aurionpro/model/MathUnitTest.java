package com.aurionpro.model;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUnitTest {
//	MathUnit obj = new MathUnit();
//	@Test
//	void testAddition() {
//		//MathUnit obj = new MathUnit();
//		//assertEquals(40, obj.add(10, 20));
//		assertTrue(obj.add(0, 0) == 30);
//	}
//
//	@Test
//	void testDivision() {
//		//MathUnit obj = new MathUnit();
//		assertEquals(2, obj.div(4, 2));
//		//assertTrue(obj.div(0, 0)==2);
//	}
	
	@Test
	void truncateAinFirst2Position() {
		StringUtil obj1 = new StringUtil();		
		System.out.println(obj1.truncateAinFirst2Position("AASD"));
		assertEquals("SD", obj1.truncateAinFirst2Position("AASD"));
	}
	
	@Test
	void test_AreFirstTwoAndLastTwoSame() {
		
		StringUtil obj1 = new StringUtil();
		System.out.println(obj1.areFirstAndLastTwoCharactersTheSame("AASDAA"));
		assertEquals("true", obj1.areFirstAndLastTwoCharactersTheSame("AASDAA"));


}
//	@Test
//	void testTruncade() {
//		StringUtil obj1 = new StringUtil();
//		assertTrue(obj1.truncateAinFirst2Position("AACD").equals("CD"));
//		assertTrue(obj1.truncateAinFirst2Position("ASD").equals("SD"));
//		
	
	
//	@Test
//	void testDivison_ArithmaticException() {
//		assertThrows(ArithmaticException.class,()->obj.div(4, 0));
//	}
