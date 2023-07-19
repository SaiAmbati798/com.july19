package TestAssement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		
		WebElement To = driver.findElement(By.xpath("//span[@class='ng-tns-c57-9 ui-autocomplete ui-widget']/input"));
		To.sendKeys("Chenn");
		List<WebElement> dest = driver.findElements(By.xpath("//ul[@id='pr_id_2_list']/li/span"));
		System.out.println(dest.size());
		for(WebElement run : dest) {
			if(run.getText().equalsIgnoreCase("MGR CHENNAI CTL - MAS")) {
				run.click();
				break;
			}
		}
		
		
		WebElement From = driver.findElement(By.xpath("//span[@class='ng-tns-c57-8 ui-autocomplete ui-widget']/input"));
		From.sendKeys("Coimba");
		List<WebElement> from = driver.findElements(By.xpath("//ul[@id='pr_id_1_list']/li/span"));
//		System.out.println(from.size());
		for(WebElement run : from) {
			if(run.getText().equalsIgnoreCase("COIMBATORE JN - CBE")) {
				run.click();
				break;
			}
		}
		Thread.sleep(3000);
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		Js.executeScript("window.scrollBy(0,200)");
		
		
		driver.findElement(By.xpath("//div[@class='col-md-3 col-sm-12 col-xs-12 remove-pad']/button")).click();
		String title = driver.findElement(By.xpath("//*[@id=\"divMain\"]/div/app-train-list/div[4]"
				+ "/div/div[5]/div[1]/div[1]/app-train-avl-enq/div[1]/div[1]/div[1]/strong")).getText();
		
		System.out.println(title);
		
	}

}
