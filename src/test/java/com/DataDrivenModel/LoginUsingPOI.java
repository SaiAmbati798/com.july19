package com.DataDrivenModel;


import java.io.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class LoginUsingPOI {
	
	@Test
	public void login() throws IOException {
		FileInputStream fix = new FileInputStream("C:\\Users\\sambati\\Downloads\\Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fix);
		XSSFSheet sht = wb.getSheetAt(0);
		int rowcount = sht.getLastRowNum();
		int colcount = sht.getRow(1).getLastCellNum();
		System.out.println(rowcount+","+colcount);
		
		for(int i=0 ; i<rowcount;i++) {
			XSSFRow cR = sht.getRow(i);
			for(int j=0;j<colcount;j++) {
				System.out.println(cR.getCell(j).toString());
			}
		}
		Row row1 = sht.getRow(1);
		Cell cl1 = row1.getCell(0);
		Cell cl2 = row1.getCell(1);
		System.out.println(cl1);
		System.out.println(cl2);
		
		Row row2 = sht.getRow(2);
		Cell cl3 = row2.getCell(0);
		Cell cl4 = row2.getCell(1);
		System.out.println(cl3);
		System.out.println(cl4);
				
		
	}

}
