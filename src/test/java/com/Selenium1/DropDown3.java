package com.Selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_2QfC02']//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//div[@class='CXW8mj']/img[@alt='Mobiles']")).click();
		WebElement thing = driver.findElement(By.xpath("//div[@class='_3uDYxP']/select"));
		Select sc = new Select(thing);
		
		for (WebElement me : sc.getOptions()) {
			if(me.getText().equals("₹20000")) {
				me.click();
			}
		}
		
		
		
	}

}
