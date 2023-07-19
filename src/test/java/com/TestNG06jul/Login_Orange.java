package com.TestNG06jul;

import org.testng.annotations.Test;

import com.DataDrivenModel.LoginOrangeHrmRepo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Login_Orange {
  @Test
  public void login() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  PageFactory.initElements(driver, LoginOrangeHrmRepo.class);
	  Thread.sleep(3000);
	  LoginOrangeHrmRepo.uname.sendKeys("Admin");
	  LoginOrangeHrmRepo.psw.sendKeys("admin123");
	  LoginOrangeHrmRepo.login_btn.click();
	  
	  
	  
  }
}
