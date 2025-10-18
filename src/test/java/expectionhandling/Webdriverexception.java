package expectionhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverexception {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		try {
			//driver.findElement(By.id("alert1")).click();
			driver.findElement(By.id("alert123")).click();
		}catch (NoSuchElementException e) {
			System.out.println("No Such Element Exception got handled here");
		}
		System.out.println("end of this program");
		String title = driver.getTitle();
		System.out.println("title of omayo"+title);
		
	}

}
