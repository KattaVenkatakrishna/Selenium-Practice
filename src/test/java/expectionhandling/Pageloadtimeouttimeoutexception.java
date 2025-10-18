package expectionhandling;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pageloadtimeouttimeoutexception {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));// here we will get exception since execution is timedout
		// ====> to handle this we have to adjust the time
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4));
		driver.get("https://omayo.blogspot.com/");

	}

}
