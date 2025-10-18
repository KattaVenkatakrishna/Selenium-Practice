package sep3rd2025;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakescreenshotDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//code to capture the screenshot of entire window
		/*TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\91832\\OneDrive\\Desktop\\screenshot\\sample1.png");
		Files.copy(src, dest);*/
		//code to capture the screenshot of particular element
		WebElement r = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		File src = r.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\91832\\OneDrive\\Desktop\\screenshot\\sample2.png");
		Files.copy(src, dest);

	}

}
