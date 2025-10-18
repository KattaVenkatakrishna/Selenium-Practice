package sep3rd2025;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickerdemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		String year ="2027";
		String month="July";
		String date="7";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		while(true) {
			String monthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			String arr[] = monthyear.split(" ");
			String mon = arr[0];
			String yr = arr[1];
			if(mon.equalsIgnoreCase(month) && yr.equalsIgnoreCase(year)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}
		}
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for(WebElement ele : alldates) {
			String dt = ele.getText();
			if(dt.equals(date)) {
				ele.click();
			}
		}
	}

}
