package com.myretail.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import com.myretail.service.beans.Product2Display;

public class MyJSONComparatorTest {

	MyJSONComparator comparator = new MyJSONComparator();
	
	@Test
	public void testEqual() {
		
		Product2Display obj1 = new Product2Display();
		obj1.setProductId("X1");
		obj1.setDisocunt(50.00);
		Product2Display obj2 = new Product2Display();
		obj2.setProductId("Y1");
		obj2.setDisocunt(50.00);
		
        int result = comparator.compare(obj1, obj2);
        assertTrue("expected to be equal", result == 0);

	}

	@Test
	public void testLessThan() {
		
		Product2Display obj1 = new Product2Display();
		obj1.setProductId("X1");
		obj1.setDisocunt(25.00);
		Product2Display obj2 = new Product2Display();
		obj2.setProductId("Y1");
		obj2.setDisocunt(50.00);
		
        int result = comparator.compare(obj1, obj2);
        assertTrue("expected to be equal", result < 0);

	}
	
	@Test
	public void testGreaterThan() {
		
		Product2Display obj1 = new Product2Display();
		obj1.setProductId("X1");
		obj1.setDisocunt(50.00);
		Product2Display obj2 = new Product2Display();
		obj2.setProductId("Y1");
		obj2.setDisocunt(25.00);
		
        int result = comparator.compare(obj1, obj2);
        assertTrue("expected to be equal", result > 0);

	}
	
}
