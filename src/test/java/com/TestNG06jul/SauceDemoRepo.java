package com.TestNG06jul;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SauceDemoRepo {
	@FindBy(id = "user-name")
	public static WebElement uname;

	@FindBy(id = "password")
	public static WebElement psw;

	@FindBy(id = "login-button")
	public static WebElement login_btn;
}
