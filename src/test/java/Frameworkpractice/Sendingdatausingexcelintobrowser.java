package Frameworkpractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sendingdatausingexcelintobrowser {
	public WebDriver driver;
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(dataProvider = "data")
	public void LoginTest(String UN, String pass) {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(UN);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test
	public void LogoutTest() {
		driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}
	
	public Object[][] getExcelData(String filepath, String Sheetname) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(filepath);
	Workbook wb = WorkbookFactory.create(fis);
	 Sheet sheet = wb.getSheet(Sheetname);
	 int rowcount = 	sheet.getLastRowNum();
	 int colcount = sheet.getRow(0).getLastCellNum();
	Object[][] data = new Object[rowcount-1][colcount];
	for(int i=1;i<rowcount;i++) {
		Row row= sheet.getRow(i);
		for(int j=0;j<colcount;j++) {
			data[i-1][j]=row.getCell(j).toString();
		}
	}
	wb.close();
	fis.close();
	return data;
	}
	@DataProvider(name="data")
	public  Object[][] getData() throws EncryptedDocumentException, IOException{
		Object[][] d = getExcelData("C:\\Users\\91832\\OneDrive\\Desktop\\Data.xlsx", "Sheet1");
		return d;
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
