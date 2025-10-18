package sep3rd2025;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaitdemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement text = wait.until(ExpectedConditions.elementToBeClickable(By.id("ta1")));
		text.sendKeys("Krishna");
		WebElement tmrbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='timerButton']")));
		tmrbtn.click();
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
	}

}
