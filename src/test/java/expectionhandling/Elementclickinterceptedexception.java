package expectionhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elementclickinterceptedexception {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.id("blogsmenu")).click();
		WebElement links = driver.findElement(By.id("selenium143"));
		/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		//WebElement cl = wait.until(ExpectedConditions.elementToBeClickable(By.id("selenium143")));
		WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("selenium143")));
		text.click();*/
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//jse.executeScript("arguments[0].scrollIntoView();", links);
		jse.executeScript("arguments[0].click()", links);

	}

}
