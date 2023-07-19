package com.Selenium1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllCheckboxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://total-qa.com/checkbox-example/");
		List<WebElement> li = driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println(li.size());
		for(WebElement e : li) {
			e.click();
		}
		// this works for common locators
		
		
	}

}
