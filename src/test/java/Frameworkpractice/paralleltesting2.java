package Frameworkpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class paralleltesting2 {
	public static WebDriver driver;
	@Test
	public void tc2() {
		driver = new EdgeDriver();
		driver.get("https://www.myntra.com/");
	}
}
