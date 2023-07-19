package com.TestNG05jul;

import org.testng.annotations.Test;

public class Coding {
  @Test (groups = {"programming"})
  public void Javaprogamming() {
	  System.out.println("Inside the java programming block");
  }
  
  @Test (groups = {"programming"})
  public void Pythonprogamming() {
	  System.out.println("Inside the Python programming block");
  }
  @Test(groups = {"web"})
  public void Bootstrap() {
	  System.out.println("Inside the Bootstrap");
  }
  
  @Test(groups = {"web"})
  public void Shootscript() {
	  System.out.println("Inside the Shootscript");
  }
  
}
