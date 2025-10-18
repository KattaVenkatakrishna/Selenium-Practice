package sep3rd2025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlesstesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");//setting for headless mode
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		driver.navigate().to("https://www.google.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com");
		System.out.println("the title of page :"+driver.getTitle());
	}

}
