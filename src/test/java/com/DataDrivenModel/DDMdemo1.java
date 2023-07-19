package com.DataDrivenModel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DDMdemo1 {
	String[][] cred = {{"Admin","admin123"},
					   {"Admi","admin12"},
					   {"Admin","admi123"},
					   {"Adm","admin123"}};	
	@DataProvider(name="DP")
	String[][] credentials(){
		return cred;
	}
	
	@Test(dataProvider="DP")
	
	void login(String user,String pwd1) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		PageFactory.initElements(driver, LoginOrangeHrmRepo.class);
		
		
		Thread.sleep(3000);
		LoginOrangeHrmRepo.uname.sendKeys(user);
		LoginOrangeHrmRepo.psw.sendKeys(pwd1);
		LoginOrangeHrmRepo.login_btn.click();
	
	
	}
	
	
}
