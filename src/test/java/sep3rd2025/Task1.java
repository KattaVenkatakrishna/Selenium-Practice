package sep3rd2025;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.myntra.com/");
		Wait<WebDriver> wait = new FluentWait<> (driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(10)).ignoring(Exception.class);
		WebElement f = wait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver) {
			return driver.findElement(By.linkText("name"));
		}
		});
		f.click();
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
	/*	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.instagram.com/");
		System.out.println(driver.getTitle());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		List<WebElement> e = driver.findElements(By.tagName("input"));
		System.out.println(e.size());
		for(WebElement Elements : e) {
			System.out.println(Elements.getText());
		}
		driver.close();
		Thread.sleep(3000);
		driver.quit();
		//how to click the element which is not clickable -- task*/

	}

}
