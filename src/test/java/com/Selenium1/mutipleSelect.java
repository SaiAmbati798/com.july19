package com.Selenium1;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class mutipleSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/select-menu");
		WebElement clik = driver.findElement(By.cssSelector("select[id=\"oldSelectMenu\"]"));
		Select Auto = new Select(clik);
		Auto.selectByVisibleText("Blue");
		Auto.selectByVisibleText("Green");
		WebElement El = driver.findElement(By.cssSelector("select[name=\"cars\"]"));
		Select auu = new Select(El);
		auu.selectByVisibleText("Volvo");
		auu.selectByVisibleText("Saab");
		auu.selectByVisibleText("Opel");
		Thread.sleep(4000);
		auu.deselectAll();
	}
}
