package com.DataDrivenModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginOrangeHrmRepo {
	@FindBy(name = "username")
	public static WebElement uname;

	@FindBy(name = "password")
	public static WebElement psw;

	@FindBy(xpath = "//*[@type='submit']")
	public static WebElement login_btn;
}
