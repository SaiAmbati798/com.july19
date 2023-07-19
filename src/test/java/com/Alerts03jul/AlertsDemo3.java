package com.Alerts03jul;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsDemo3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		// ConfirmAlertBox

		driver.findElement(By.cssSelector("[name^='co']")).click();
		Alert a12 = driver.switchTo().alert();
		Thread.sleep(3000);
		a12.accept();
		
		//prompt alert

		driver.findElement(By.cssSelector("[name^='pro']")).click();
		Alert a13 = driver.switchTo().alert();
		Thread.sleep(3000);
		a13.sendKeys("Yes");
		a13.accept();

	}

}
