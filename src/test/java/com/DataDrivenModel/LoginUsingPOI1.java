package com.DataDrivenModel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class LoginUsingPOI1 {

	@Test
	public void login() throws IOException {
		FileInputStream fix = new FileInputStream("C:\\Users\\sambati\\Downloads\\Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fix);
		XSSFSheet sht = wb.getSheetAt(0);

		int row_c = sht.getLastRowNum();
		int col_c = sht.getRow(1).getLastCellNum();

		for (int i = 1; i < row_c; i++) {
			for (int j = 0; j < col_c; j++) {
				System.out.println("Column index : "+j);
				System.out.println(sht.getRow(i).getCell(j));
				System.out.println();
			}

		}

	}
}
