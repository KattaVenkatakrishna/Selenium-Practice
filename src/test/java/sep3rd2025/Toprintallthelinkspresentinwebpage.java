package sep3rd2025;


//how to print the text of all the links present on the web page using selenium
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toprintallthelinkspresentinwebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement link : links)
		{
			String linktext = link.getText();
			System.out.println(linktext);
		}
				

	}

}
