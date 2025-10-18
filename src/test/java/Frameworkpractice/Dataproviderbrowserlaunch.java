package Frameworkpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderbrowserlaunch {
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
	@DataProvider(name="data")
	public String[][] getData() {
		String logindata[][] = {{"Admin","admin124"}
		,{"admin1","admin123"}
		,{"Admin","admin123"}};
		return logindata;
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
