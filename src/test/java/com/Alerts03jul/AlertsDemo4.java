package com.Alerts03jul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsDemo4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//a[@href='#OKTab']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Alert ting = driver.switchTo().alert();
		
		Thread.sleep(2000);
		ting.accept();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Alert ting1 = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		ting1.accept();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		Alert ting2 = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		ting2.accept();
		
		

	}

}
