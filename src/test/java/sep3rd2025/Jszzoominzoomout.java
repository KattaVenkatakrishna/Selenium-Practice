package sep3rd2025;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//code for zoom in and zoom out using the java script executor

public class Jszzoominzoomout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		//zoom in
		jse.executeScript("document.body.style.zoom='150%'");
		Thread.sleep(3000);
		//zoom out
		jse.executeScript("document.body.style.zoom='50%'");
		
		
		//code for zoom in and zoom out on particular element
		
		/*WebElement cnu = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		//zoom in
		jse.executeScript("document.body.style.zoom='150%'",cnu);
		Thread.sleep(3000);
		//zoom out
		jse.executeScript("document.body.style.zoom='50%'");*/
		
		

	}

}
