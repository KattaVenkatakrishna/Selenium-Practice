package sep3rd2025;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicwebtabledemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practice.expandtesting.com/dynamic-table");
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
		System.out.println("Total number of rows :"+rows.size());
		for(int r=1;r<=rows.size();r++) {
			WebElement name = driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr["+r+"]/td[1]"));
			System.out.println(name.getText());
			if(name.getText().equals("Chrome")){
				//String cpuload = driver.findElement(By.xpath("//td[normalize-space()='Chrome']//following-sibling::*[contains(text(),'%')]")).getText();
				String cpuload = driver.findElement(By.xpath("//td[text()='Chrome']//following-sibling::*[contains(text(),'%')]")).getText();
				//String cpuload = driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr["+r+"]/td[contains(text(),'%')]")).getText();
				String value = driver.findElement(By.xpath("//p[@id='chrome-cpu']")).getText();
				System.out.println("The cpu load from table :"+cpuload);
				System.out.println("The cpu load from highlight :"+value);
				if(value.contains(cpuload)) {
					System.out.println("cpu load of chrome is equal");
				}
				else {
					System.out.println("cpu load of chrome is not equal");
				}
			}
		}
	}

}
