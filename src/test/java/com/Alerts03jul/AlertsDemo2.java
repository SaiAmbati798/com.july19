package com.Alerts03jul;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class AlertsDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		Js.executeScript("window.scrollBy(0,200)");
		
//		Thread.sleep(3000);
//		WebElement simplebtn = driver.findElement(By.id("alertButton"));
//		simplebtn.click();
//		Alert simplebtn1 = driver.switchTo().alert();
//		Thread.sleep(3000);
//		simplebtn1.dismiss();
//		
//		driver.findElement(By.id("timerAlertButton"));
//		simplebtn.click();
//		Alert simplebtn2 = driver.switchTo().alert();
//		Thread.sleep(3000);
//		simplebtn2.dismiss();
//
//		driver.findElement(By.id("confirmButton"));
//		simplebtn.click();
//		Alert simplebtn3 = driver.switchTo().alert();
//		Thread.sleep(3000);
//		simplebtn3.dismiss();
		
		Thread.sleep(2000);
		driver.findElement(By.id("promtButton")).click();
		Alert promt = driver.switchTo().alert();
		promt.sendKeys("joy");	
		Thread.sleep(3000);
		promt.accept();

	
	}

}
