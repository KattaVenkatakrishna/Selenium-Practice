package sep3rd2025;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/*1.Takes screenshot and individual screenshot 
2.How to handle cookies (all)
3.File uploading
4.Broken links
5.Javascript executor(6
 * 
 */

public class Javascriptexecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//textarea[@aria-label='Search']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value='hello'", ele);

	}

}
