package com.TestNG05jul;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchGmain {
  
	WebDriver driver;
	
  @BeforeTest
  public void Intit() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
	@Test 
	  public void LaunchUrl() {
			driver.get("https://www.saucedemo.com/v1/");
			
		}
  @Test ( dependsOnMethods = {"LaunchUrl"})
  @Parameters({"A","B"})
  public void Prov_Cre(String str1,String str2) {
	 
	  WebElement usr = driver.findElement(By.id("user-name"));
	  WebElement pwd = driver.findElement(By.id("password"));
	  usr.sendKeys(str1);
	  pwd.sendKeys(str2);
	  driver.findElement(By.id("login-button")).click();
	  System.out.println("bfdg");
//	  (dependsOnGroups = {"LaunchUrl"})
  }
  
  @Test  (dependsOnMethods = {"Prov_Cre"})

  public void selProd() {
	  
	  driver.findElement(By.xpath("//div[@id='inventory_container']/div/div[2]/div/div/div/a/img")).click();
	  System.out.println("bfdg");
	    }
  
  @AfterTest
  public void afterTest() {

  }

}
