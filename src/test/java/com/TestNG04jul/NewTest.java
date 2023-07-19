package com.TestNG04jul;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test(priority=1)
  public void insertCard() {
	  System.out.println("Insert the card ");
  }
  
  @Test(priority=2)
  public void enterCredentials() {
	  System.out.println("Enter the valid credentials ");
  }
  
  @Test(priority=3)
  public void withDraw() {
	  System.out.println("Withdraw the money ");
  }
  
  @Test(priority=4)
  public void retriveCard() {
	  System.out.println("Retrive your card");
  }
  

}
