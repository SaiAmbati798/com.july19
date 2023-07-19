	package com.Alerts03jul;
	
	import java.time.Duration;
	import java.util.List;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.*;
	import io.github.bonigarcia.wdm.WebDriverManager;
	
	public class Demo4 {
	
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.manage().window().maximize();
			driver.get("https://nxtgenaiacademy.com/demo-site/");
			
			driver.findElement(By.xpath("//input[@id='vfb-5']")).sendKeys("Sai kumar reddy");
			
			driver.findElement(By.xpath("//input[@id='vfb-7']")).sendKeys("Ambati");
			
			driver.findElement(By.id("vfb-31-1")).click();
			
			
			
			driver.findElement(By.xpath("//*[@id='vfb-13-address']")).sendKeys("5-30/A ");
			
			driver.findElement(By.xpath("//*[@id='vfb-13-address-2']")).sendKeys("Vengalareddypeta");
			
			driver.findElement(By.xpath("//*[@id='vfb-13-city']")).sendKeys("Nandyal");
			
			driver.findElement(By.xpath("//*[@id='vfb-13-state']")).sendKeys("Andhra Pradesh");
			
			driver.findElement(By.xpath("//*[@id='vfb-13-zip']")).sendKeys("518512");
			
			driver.findElement(By.xpath("//*[@id=\"item-vfb-13\"]/div/span[6]/span/span[1]/span/span[2]")).click();
			
			List<WebElement> nation = driver.findElements(By.xpath("//ul[@class='select2-results__options']/li"));;
			
			System.out.println(nation.size());
			
			for(WebElement e : nation ) {
				if(e.getText().equalsIgnoreCase("india")) {
					e.click();
					break;
				}
			}
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("saireddyambati@gmail.com");
			driver.findElement(By.xpath("//*[@id='vfb-18']")).click();
			driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[2]/td[1]")).click();
			
			
			driver.findElement(By.xpath("//*[@id=\"item-vfb-16\"]/span[1]/span/span[1]/span/span[2]")).click();
			List<WebElement> hours = driver.findElements(By.xpath("//ul[@id='select2-vfb-16-hour-results']/li"));
			
			System.out.println(hours.size());
			
			for(WebElement e : hours ) {
				if(e.getText().equalsIgnoreCase("15")) {
					e.click();
					break;
				}
			}
			
			driver.findElement(By.xpath("//*[@id=\"item-vfb-16\"]/span[2]/span/span[1]/span/span[2]")).click();
			List<WebElement> min = driver.findElements(By.xpath("//*[@id=\"select2-vfb-16-min-results\"]/li"));
			
			System.out.println(min.size());
			
			for(WebElement e : min ) {
				if(e.getText().equalsIgnoreCase("55")) {
					e.click();
					break;
				}
			}
			
			driver.findElement(By.xpath("//*[@id='vfb-19']")).sendKeys("7989321878");
	
			driver.findElement(By.xpath("//*[@id='vfb-20-1']")).click();
	
			driver.findElement(By.xpath("//*[@id='vfb-23']")).sendKeys("reviews of the .....");
	
			driver.findElement(By.xpath("//*[@id='vfb-3']")).sendKeys("99");
			
			driver.findElement(By.xpath("//*[@id='vfb-4']")).click();
			//span[@class='select2-selection select2-selection--single'][1]
		}
	
	}
