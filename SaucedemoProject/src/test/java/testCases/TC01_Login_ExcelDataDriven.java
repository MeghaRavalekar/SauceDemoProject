package testCases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.Inner_PageFactory;
import pageObjects.Login_PageFactory;

public class TC01_Login_ExcelDataDriven extends BaseClass {

	@Test
	public static void LoginTest() throws IOException {

		Login_PageFactory Lg = new Login_PageFactory(driver);

		Inner_PageFactory Ip = new Inner_PageFactory(driver);

		// Store file path
		String FilePath = "D:\\NewWorkspace\\SaucedemoProject\\src\\test\\resources\\testdata\\SauceDemo.xlsx";

		// read data from file
		FileInputStream fis = new FileInputStream(FilePath);

		// Enter into workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// enter into Login sheet
		XSSFSheet sheet = workbook.getSheet("Login");

		// count no of rows
		int rows = sheet.getLastRowNum();
		System.out.println("Number of Rows are : " + rows);

		// Iterate through all the rows

		for (int i = 1; i <= rows; i++) {
			// enter into row
			XSSFRow row = sheet.getRow(i);

			XSSFCell Username = row.getCell(0); // read data from 0th column

			XSSFCell Password = row.getCell(1); // read data from 1st column

			XSSFCell Result = row.createCell(2); // Write data into 2nd col

			System.out.println("Username:" + Username + " || " + "Password:" + Password);

			Lg.EnterUserName(Username.toString());

			Lg.EnterPassword(Password.toString());

			Lg.ClickLoginBtn();

			try {

				Ip.ClickMenuBtn();

				Ip.ClickLogout();

				System.out.println("valid Data"); // print on console

				Result.setCellValue("Login Successfull"); // print this message into Result Column
			} catch (Exception e) {

				Lg.GetTextErrorMsg();

				Result.setCellValue("Invalid Data"); // print this message into Result Column

			}

			Lg.ClearUserName();

			Lg.ClearPassword();

		}

		fis.close(); // close input stream file

		// Write data into file
		FileOutputStream fos = new FileOutputStream(FilePath);

		workbook.write(fos);

	}
}
