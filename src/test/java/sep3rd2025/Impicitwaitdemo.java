package sep3rd2025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Impicitwaitdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html#google_vignette");
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("txt1")).sendKeys("Krishna");
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.id("txt2")).sendKeys("Krishna1");
	}

}
