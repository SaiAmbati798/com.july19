package com.TestNG06jul;

import org.testng.annotations.Test;

public class priority {
	
	@Test(priority=1)
	public void method1() {
		System.out.println("Inside Method1");
	}
	
	@Test(priority=2)
	public void method2() {
		System.out.println("Inside Method2");
	}
	@Test(priority=3)
	public void method3() {
		System.out.println("Inside Method3");
	}

}
