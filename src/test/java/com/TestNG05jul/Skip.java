package com.TestNG05jul;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Skip {
  @Test
  public void Method1() {
	  System.out.println("Inside the method1 ");
 }
  @Test
  public void method2() {
	  throw new SkipException("Skipped");
  }
  
}
