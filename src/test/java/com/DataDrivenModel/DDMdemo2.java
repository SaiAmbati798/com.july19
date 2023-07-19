package com.DataDrivenModel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.*;
import jxl.read.biff.BiffException;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;

public class DDMdemo2 {

	String[][] data = null;

	@DataProvider(name = "data1")
	String[][] credetials() throws BiffException, IOException {
		data = readExcel();
		return data;
	}

	String[][] readExcel() throws BiffException, IOException {
		FileInputStream excel = new FileInputStream("C:\\Users\\sambati\\Downloads\\Data.xls");
		Workbook wBook = Workbook.getWorkbook(excel);
		Sheet st = wBook.getSheet(0);
		int row_count = st.getRows();
		int col_count = st.getColumns();
		String[][] data1 = new String[row_count - 1][col_count];
		for (int i = 1; i < row_count; i++) {
			for (int j = 0; j < col_count; j++) {
				data1[i - 1][j] = st.getCell(j, i).getContents();
				System.out.println(data1[i - 1][j]);
			}
		}
		return data1;
	}

	@Test(dataProvider = "data1")
	public void loginUsongJXL(String uname1, String pwd1) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");

		WebElement uname = driver.findElement(By.id("username"));
		WebElement pword = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("loginButton"));
		WebElement lab = driver.findElement(By.xpath("//*[@id='Laboratory']"));

		uname.sendKeys(uname1);
		pword.sendKeys(pwd1);

		lab.click();
		loginBtn.click();

	}
}
