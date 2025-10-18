package sep3rd2025;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxmultiselectdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> mcb = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		//select all checkboxes
		/*for(int i=0;i<mcb.size();i++) {
			mcb.get(i).click();
		}
		//using for each loop
		for(WebElement checkbox : mcb) {
			checkbox.click();
		}
		Thread.sleep(3000);
		//select last 3 checkbox
		for(int i=4;i<mcb.size();i++) {
			mcb.get(i).click();
		}
		//select first 3 checkbox
				for(int i=0;i<3;i++) {
					mcb.get(i).click();
				}
		Thread.sleep(3000);
		for(int i=0;i<mcb.size();i++) {
			if(mcb.get(i).isSelected()) {
				mcb.get(i).click();
			}
		}*/
		//selecting the data randomly
		for(WebElement checkbox : mcb) {
			String value = checkbox.getAttribute("value");
			if(value.equalsIgnoreCase("sunday")||value.equalsIgnoreCase("wednesday")||value.equalsIgnoreCase("friday")) {
				checkbox.click();
			}
		}

	}

}
