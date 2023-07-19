package com.Alerts03jul;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Asynchronization {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com");
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		
		long startTime = System.currentTimeMillis();
		Js.executeAsyncScript("window.setTimeout(arguments[0],3000);");
		System.out.println("Time Taken : "+ (System.currentTimeMillis()-startTime));
		if((System.currentTimeMillis()-startTime) > 3000)System.out.println("Time will be greater then 3000 milliseconds");
		
		driver.quit();
	}

}
