package com.Selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollTillElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.tnpsc.gov.in");
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		WebElement el = driver.findElement(By.xpath("//li[@class='m-has-icon']/h3[text()='How To Apply']"));
		Js.executeScript("arguments[0].scrollIntoView(true);", el);
		String zoom = "document.body.style.zoom='175%'";
		Js.executeScript(zoom);
		
	}

}
