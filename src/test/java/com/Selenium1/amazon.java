package com.Selenium1;

import java.time.Duration;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com");

		driver.findElement(By.xpath("//input[@placeholder='Enter location']")).sendKeys("ban");

		List<WebElement> locations = driver.findElements(By.xpath("//ul[@class='layer-wrap']/li/div"));
		System.out.println(locations.size());
		Thread.sleep(3000);

		for (WebElement ping : locations) {
			if (ping.getAttribute("title").equalsIgnoreCase("bangalore")) {
				ping.click();
				break;
			}
			
		}
		driver.findElement(By.xpath("//input[@placeholder='Enter skills / designations / companies']")).sendKeys("perf");

		List<WebElement> jobs = driver.findElements(By.xpath("//ul[@class='layer-wrap']/li/div"));
		System.out.println(jobs.size());
		Thread.sleep(3000);

		for (WebElement ping : locations) {
			System.out.println(ping.getAttribute("title"));
		}
		
		driver.findElement(By.xpath("//input[@id='expereinceDD']")).click();
		
		
		List<WebElement> exp = driver.findElements(By.xpath("//*[@id=\"sa-dd-scrollexpereinceDD\"]/div/ul/li/div/span"));
		System.out.println(exp.size());
		Thread.sleep(3000);
		for (WebElement ping : exp) {
			if (ping.getText().equalsIgnoreCase("4 years")) {
				ping.click();
				break;
			}
		}		
		
		
	}

}	