package com.TestNG06jul;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sauceDemoPage {
  @Test
  public void login() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.saucedemo.com/");
	  
	  
	  Thread.sleep(3000);
	  //Login page
	  PageFactory.initElements(driver, SauceDemoRepo.class);
	  SauceDemoRepo.uname.sendKeys("standard_user");
	  SauceDemoRepo.psw.sendKeys("secret_sauce");
	  SauceDemoRepo.login_btn.click();
	  
	  Thread.sleep(3000);
	  //Selecting the product
	  PageFactory.initElements(driver, SauceDemoProductRepo.class);
	  SauceDemoProductRepo.prod.click();
	  
  }
}
