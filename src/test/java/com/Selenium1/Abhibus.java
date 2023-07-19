package com.Selenium1;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Abhibus {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com");
		
		WebElement fromPlace = driver.findElement(By.xpath("//input[@class='form-control border-0 mb-0 ui-autocomplete-input'][1]"));
		fromPlace.sendKeys("Che");
		Thread.sleep(3000);
		List<WebElement> ll = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));	
		for(WebElement king : ll) {
			if(king.getText().equals("Chennai")) {
				king.click();
				break;
			}
		}
		
		WebElement toPlace = driver.findElement(By.xpath("//input[@id='destination']"));
		toPlace.sendKeys("nand");
		Thread.sleep(3000);
		List<WebElement> ll2 = driver.findElements(By.xpath("//*[@id='ui-id-2']/li"));	
		for(WebElement king : ll2) {
			if(king.getText().equals("Nandyala")) {
				king.click();
			}
		}
		driver.findElement(By.xpath("//*[@id='datepicker1']")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[4]/a")).click();
		
		driver.findElement(By.xpath("//a[@class='btn btn-main px-5 py-2 border-right-radius']")).click();
	
	
	
	
	
	}

}
