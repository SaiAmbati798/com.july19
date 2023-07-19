package com.TestNG06jul;


import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class SauceDemoProductRepo {
	

	@FindBy(xpath = "//div[@class='inventory_container']/div/div[1]/div[1]/a")
	public static  WebElement prod;

}
