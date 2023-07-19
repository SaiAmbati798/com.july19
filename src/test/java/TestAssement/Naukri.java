package TestAssement;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Naukri {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//input[@placeholder='Enter skills / designations / companies']")).click();

		Set<String> handles = driver.getWindowHandles();
		for (String king : handles) {
			driver.switchTo().window(king);
		}
		driver.findElement(By.xpath("//label[@for='chk-Work from office-wfhType-']/i")).click();

		driver.findElement(By.xpath("//label[@for='chk-Hybrid-wfhType-']/i")).click();

		Actions act = new Actions(driver);

		WebElement a = driver.findElement(By.xpath("//article[@data-job-id='030723905197']"));

		act.keyDown(Keys.CONTROL).moveToElement(a).click().keyUp(Keys.CONTROL).build().perform();

		driver.switchTo().window(parent);
		WebElement Enter = driver.findElement(
				By.cssSelector("input.suggestor-input[placeholder='Enter skills / designations / companies']"));
		Enter.sendKeys("des");

		Thread.sleep(3000);

		List<WebElement> ll = driver.findElements(By.xpath(" // li[@class='tuple-wrap ']/div"));
		for (WebElement star : ll) {
			if (star.getText().equalsIgnoreCase("design engineer")) {
				star.click();
				break;
			}
		}
		WebElement btn = driver.findElement(By.cssSelector("div.qsbSubmit"));
		btn.click();
		driver.quit();

	}

}