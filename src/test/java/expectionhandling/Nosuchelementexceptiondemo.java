package expectionhandling;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nosuchelementexceptiondemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://omayo.blogspot.com/");
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		//reason-1 --- incorrect locator is provided
		//driver.findElement(By.id("ta123")).click();
		//=====>to handle this provide the correct locator
		//driver.findElement(By.id("ta1")).click();
		//reason-2 --- delay in loading the element on the web page
		/*driver.findElement(By.className("dropbtn")).click();
		driver.findElement(By.linkText("Facebook")).click();
		//=====>to handle this use explicit wait as shown below
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement facebookopt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		facebookopt.click();*/
		//reason-3 -- without swithching the frame trying to perform the action on the element
		//driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("krishna");
		//=====>to reslove this handle the frame first and then perform the required action on the web element
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("krishna");
	}

}
