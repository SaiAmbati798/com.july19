package com.TestNG06jul;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


class ChromeHeadles {

	public static void main(String[] args) {

			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
	
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://www.google.com/");
			System.out.println("executing chrome driver in headless mode");
			System.out.println(". page title: "+driver.getTitle());
			System.out.println(". page url: "+driver.getCurrentUrl());
			}

	}


