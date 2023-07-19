package com.TestNG06jul;

import org.testng.annotations.Test;

public class TransformerTest {
	int c = 2;

	@Test
	public void change() {
		System.out.println("the invokation count for this method 4 , it is changed to 2 @execution ");
	}
}
