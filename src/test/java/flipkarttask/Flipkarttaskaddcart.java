package flipkarttask;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkarttaskaddcart {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement Search = driver.findElement(By.xpath("//input[@name='q']"));
		Search.sendKeys("washing machine 7 kg",Keys.ENTER);
		String parent = driver.getWindowHandle();
		System.out.println("Parent window id is :"+parent);
		driver.findElement(By.xpath("(//img[@loading='eager'])[1]")).click();
		Set<String> allwin = driver.getWindowHandles();
		for(String child : allwin) {
			if(!child.equals(allwin)) {
				driver.switchTo().window(child);
			}
		}
		driver.findElement(By.xpath("//button[contains(text(),'Add to cart') and @class='QqFHMw vslbG+ In9uk2']")).click();
		Thread.sleep(3000);
		WebElement add = driver.findElement(By.xpath("//div[contains(@class,'atHedL')]//input[@type='text']"));
		add.clear();
		add.sendKeys("2");
		driver.findElement(By.xpath("//span[text()='Add Item']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Cart']")).click();	
	}
}
