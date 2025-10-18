package sep3rd2025;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//code for highlighting the element on a web page

public class Highlightingawebelement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("krishna");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		jse.executeScript("arguments[0].style.border='3px solid red'", searchbox);
		Thread.sleep(3000);
		jse.executeScript("arguments[0].style.background='yellow'", searchbox);
		Thread.sleep(3000);
		jse.executeScript("arguments[0].style.fontweight='bold'", searchbox);
		Thread.sleep(3000);
		
	}

}
