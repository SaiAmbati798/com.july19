package com.Selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DD5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		WebElement ki = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		
		Select sing = new Select(ki);
		
		for(WebElement king : sing.getOptions() ) {
			if(king.getText().equalsIgnoreCase("price (low to high)")) {
				king.click();
				break;
			}
		}
		driver.findElement(By.xpath("//img[@alt='Sauce Labs Bike Light']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']")).click();
		
	}

}
