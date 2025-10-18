package sep3rd2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NotClickableElement {
	//how to click the element which is not clickable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement c = driver.findElement(By.xpath(""));
		Actions ac = new Actions(driver);
		ac.moveToElement(c).click().perform();
	}

}
