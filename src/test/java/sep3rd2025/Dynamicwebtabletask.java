package sep3rd2025;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicwebtabletask {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.timeanddate.com/worldclock/?sort=1");
		// for identifying the total number of rows in a table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='zebra fw tb-theme']/tbody/tr"));
		System.out.println("Total number of rows :" + rows.size());
		// for identifying the total number of columns in a table
		List<WebElement> cols = driver.findElements(By.xpath("//table[@class='zebra fw tb-theme']/tbody/tr/td"));
		System.out.println("Total number of cols:" + cols.size());
		/*
		 * for(WebElement allrows : rows) { List<WebElement> cells =
		 * allrows.findElements(By.
		 * xpath("//table[@class='zebra fw tb-theme']/tbody/tr/td")); for(WebElement
		 * allcells : cells) { System.out.print(allcells.getText()+"|"); }
		 * System.out.println(); }
		 */
		for (int r = 1; r <= rows.size(); r++) {
			WebElement cityname = driver.findElement(By.xpath("//table[@class='zebra fw tb-theme']/tbody/tr[" + r + "]/td[1]"));
			// System.out.println(cityname.getText());
			if (cityname.getText().equalsIgnoreCase("Delhi")) {
				System.out.println("Delhi is present");
			}
		}
	}

}
