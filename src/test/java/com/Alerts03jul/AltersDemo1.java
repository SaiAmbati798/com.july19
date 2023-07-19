package com.Alerts03jul;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AltersDemo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/alert.xhtml;jsessionid=node0109x4wh3db7qxqutwwcmdr4vr340749.node0");
		
//		WebElement simpleBtn = driver.findElement(By.id("j_idt88:j_idt91"));
//		simpleBtn.click();
//		Thread.sleep(3000);
//		Alert simpleAlert = driver.switchTo().alert(); 
//		//simpleAlert.accept();
//		simpleAlert.dismiss();
//		
//		WebElement confirmBtn = driver.findElement(By.id("j_idt88:j_idt93"));
//		confirmBtn.click();
//		
//		Thread.sleep(3000);
//		
//		Alert confirnAlert = driver.switchTo().alert();
//		confirnAlert.dismiss();
		
		WebElement promptBtn = driver.findElement(By.id("j_idt88:j_idt104"));
		promptBtn.click();
		
		Thread.sleep(3000);
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Welcome User");
		promptAlert.accept();
		
		
		
	}

}
