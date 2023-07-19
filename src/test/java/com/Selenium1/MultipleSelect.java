package com.Selenium1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.interactions.*;

public class MultipleSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdiver.chrome.diver", "C:\\Users\\sambati\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://formstone.it/components/dropdown/demo");
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		Js.executeScript("window.scrollBy(0,450)");
		Thread.sleep(3000);
		WebElement ms = driver.findElement(By.id("demo_multiple"));
		Select sel1 = new Select(ms);
		List<WebElement> opt = sel1.getOptions();
		Actions act = new Actions(driver);
		act.keyDown(Keys.LEFT_CONTROL)
				.click(opt.get(0))
				.click(opt.get(1))
				.click(opt.get(2))
				.click(opt.get(3))
				.keyUp(Keys.LEFT_CONTROL)
				.build()
				.perform();
		
	}

}
