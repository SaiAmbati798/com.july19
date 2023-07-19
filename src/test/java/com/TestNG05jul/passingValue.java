package com.TestNG05jul;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;





public class passingValue {
  @Test
  @Parameters({"n"})
  public void ParameterDemo(String str) {
	  System.out.println("Text is "+str);
  }
}
