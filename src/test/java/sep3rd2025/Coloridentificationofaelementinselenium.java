package sep3rd2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coloridentificationofaelementinselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//button[@data-testid='royal-login-button']"));
		String fontcolor = ele.getCssValue("color");
		System.out.println(fontcolor);
		String backgroundcolor = ele.getCssValue("background-color");
		System.out.println(backgroundcolor);
	}

}
