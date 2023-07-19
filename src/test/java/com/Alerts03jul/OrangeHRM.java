package com.Alerts03jul;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrangeHRM {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and @name='password']")).sendKeys("admin123");

		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	
		WebElement profileP = driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']/img"));
	
		String nW = profileP.getAttribute("naturalWidth");
		System.out.println(nW);
		if(nW.equals(null)) System.out.println("Profile Picture is Broken");
		else System.out.println("Profile Picture is not Broken");
		
		driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='Admin']")).click();
		
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		
		
		
		
	}

}
