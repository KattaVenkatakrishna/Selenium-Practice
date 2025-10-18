package sep3rd2025;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//code for performing the scrolls up and down

public class JavascriptexecutorDemo1 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		//scroll down
		jse.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(3000);
		//scroll up
		jse.executeScript("window.scrollTo(0,0)");
	}
}
