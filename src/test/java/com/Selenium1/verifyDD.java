package com.Selenium1;

import java.time.Duration;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verifyDD {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node0nw52t0bm068t179gl5dcwjqhc336618.node0");
		WebElement e = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select se = new Select(e);
		ArrayList<String> orginalli = new ArrayList<String>();

		ArrayList<String> templi = new ArrayList<String>();
		for (WebElement me : se.getOptions()) {
			orginalli.add(me.getText());
			templi.add(me.getText());
		}
		System.out.println("\noriginalList before Sorting" + orginalli);
		System.out.println("tempList before Sorting" + templi);
		Collections.sort(templi);
		System.out.println();
		System.out.println("originalList After Sorting" + orginalli);
		System.out.println("tempList After Sorting" + templi);
		if (orginalli == templi) {
			System.out.println("Dropdown sorted");
		} else {
			System.out.println("Dropdown not sorted");
		}
	}
}
