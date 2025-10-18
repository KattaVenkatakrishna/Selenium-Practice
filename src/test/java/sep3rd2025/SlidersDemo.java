package sep3rd2025;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlidersDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		WebElement red = driver.findElement(By.xpath("//div[@id='red']"));
		Actions ac = new Actions(driver);
		ac.dragAndDropBy(red, 80,125).perform();
		WebElement green = driver.findElement(By.xpath("//div[@id='green']"));
		ac.dragAndDropBy(green, 50, 95).perform();
		WebElement blue = driver.findElement(By.xpath("//div[@id='blue']"));
		ac.dragAndDropBy(blue, 85, 100).perform();
	}

}
