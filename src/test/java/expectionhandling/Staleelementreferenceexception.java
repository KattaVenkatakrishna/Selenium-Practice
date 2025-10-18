package expectionhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Staleelementreferenceexception {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement textarea = driver.findElement(By.id("ta1"));
		textarea.sendKeys("krishna");
		WebElement ele = driver.findElement(By.linkText("compendiumdev"));
		ele.click();
		//textarea.clear(); //-- here we get stale element reference exception 
		// =====> to handle this exception in DOM we have to re-attach the reference of the element again 
		/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(23));
		WebElement c = wait.until(ExpectedConditions.refreshed((ExpectedConditions.visibilityOfElementLocated(By.id("ta1")))));
		c.clear();
		//This how we need to use the refreshed method in webdriverwait i.e nothing but syntax
		*/
		driver.navigate().back();
		textarea = driver.findElement(By.id("ta1"));
		textarea.clear();

	}

}
