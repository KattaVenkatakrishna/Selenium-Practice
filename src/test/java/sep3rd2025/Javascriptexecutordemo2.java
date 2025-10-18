package sep3rd2025;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//code for scrolling the particular element and performing action like click on that element

public class Javascriptexecutordemo2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		WebElement helpcenter = driver.findElement(By.linkText("Help center"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		//scroll down
		jse.executeScript("arguments[0].scrollIntoView(true)",helpcenter);
		//performing click 
		jse.executeScript("arguments[0].click();",helpcenter);

	}

}
