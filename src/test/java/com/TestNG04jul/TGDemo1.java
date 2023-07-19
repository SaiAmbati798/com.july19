package com.TestNG04jul;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class TGDemo1 {
	 WebDriver driver;
  @Test(priority=1)
  public void openGoogle() {
	  driver.navigate().to("https://www.Google.com");
  }
 
  @Test(priority=2)
  public void openBing() {
	  driver.navigate().to("https://www.Bing.com");
  }
  @BeforeTest
	public void init() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
  @AfterTest
  public void tearDown() {
	// driver.close();
	  
  }

}
