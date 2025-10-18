package Datadrivenframeworkdemo;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datadrivenframeworkexcel {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\91832\\OneDrive\\Desktop\\Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String uname = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.print(uname);
		String uname1 = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(" : "+uname1);
		String pass = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.print(pass);
		String pass1 = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(" : "+pass1);
		String email = wb.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		System.out.print(email);
		String email1 = wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		System.out.println(" : "+email1);


	}

}

