package com.Selenium1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		
		Js.executeScript("window.confirm('Expleo groups')");
		Thread.sleep(3000);
//		Js.executeScript("alert('Welcome to Expleo!');");
	}

}
