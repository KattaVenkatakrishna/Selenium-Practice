package Listenerspractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listenersdemo.class)

public class demo {
	public static WebDriver driver;

	@Test
	public void tc() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Assert.assertEquals(driver.getTitle(), "oogle");
	}
}
