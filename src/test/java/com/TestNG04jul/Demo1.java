package com.TestNG04jul;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
	WebDriver driver;
	
	public void init() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	
	
	public void openGoogle() {
		driver.navigate().to("https://www.google.com");
	}
	
	void teardown() {
		driver.close();
	}
	
}
