package com.myretail.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class ColorConverterTest {

	@Test
	public void testSuccess() {
		String baseColor = "red";
		String hexRGBColorValue = "#ff0000";
		assertTrue(hexRGBColorValue.equalsIgnoreCase(ColorConverter.hashMapOfColors.get(baseColor)));
	}

	@Test
	public void testFail() {
		String baseColor = "blue";
		String hexRGBColorValue = "#ff0000";
		assertFalse(hexRGBColorValue.equalsIgnoreCase(ColorConverter.hashMapOfColors.get(baseColor)));
	}

}
