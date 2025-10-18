package sep3rd2025;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Takescreenshotfrpage {

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("karn");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("johar");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("johar@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("123467969");
		// capturing the screenshot for entire web page
		TakesScreenshot ts = (TakesScreenshot) driver; 
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\91832\\OneDrive\\Desktop\\screenshot\\facebookreg1.png");
		Files.copy(src, dest);
		// capturing the screenshot for particular web element 
		WebElement s = driver.findElement(By.xpath("//input[@name='firstname']"));
		File src1 = s.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("C:\\Users\\91832\\OneDrive\\Desktop\\screenshot\\facebookregsignup.png");
		Files.copy(src1, dest1);
	}

} 
