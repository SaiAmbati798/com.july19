package com.Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectorAll {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		
		driver.findElement(By.id("APjFqb")).sendKeys("Java");
		String searchBtn = "document.querySelectorAll(\"input[value='Google Search']\")[1].click()";
		Js.executeScript(searchBtn);
	}

}
