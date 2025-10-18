package Frameworkpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class paralleltesting1 {
	public static WebDriver driver;
	@Test
	public void tc1() {
		driver = new ChromeDriver();
		driver.get("https://fast.com/");
	}

}
