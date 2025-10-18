package expectionhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetargetoutofboundsexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Actions act = new Actions(driver);
		//act.moveToLocation(1000, 2000).click().perform();
		WebElement element = driver.findElement(By.linkText("Blogger"));
		act.moveToElement(element).click().perform();

	}

}
