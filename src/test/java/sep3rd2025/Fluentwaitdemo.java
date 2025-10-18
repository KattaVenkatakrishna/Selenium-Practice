package sep3rd2025;

import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwaitdemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.className("dropbtn")).click();
		 Wait<WebDriver> wait =
			        new FluentWait<>(driver)
			            .withTimeout(Duration.ofSeconds(10))
			            .pollingEvery(Duration.ofSeconds(2))
			            .ignoring(Exception.class);

		 WebElement facebookoption = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.linkText("Facebook"));
		     }
		   });
		 facebookoption.click();
		 driver.findElement(By.id("email")).sendKeys("krishna");
	}


}
