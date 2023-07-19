package com.TestNG06jul;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ItestListenersImp {
  @Test
  public void Test1() {
	 System.out.println("Test 1"); 
  }
  
  @Test
  public void Test2() {
	  Assert.assertTrue(false);
  }
  @Test
  public void Test3() {
	  throw new SkipException("Skipped");
  }
  
}
