package sep3rd2025;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebtablesdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement table = driver.findElement(By.xpath("//table"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("Total rows :"+rows.size());
		
		//for getting the headers data
		List<WebElement> headers = rows.get(0).findElements(By.tagName("th"));
		System.out.println("Total coloumns :"+headers.size());
		for(int h=0;h<headers.size();h++) {
			System.out.print(headers.get(h).getText()+"  "	);
		}
		
		//getting the data for all the rows and columns data
		for(int i = 0;i<rows.size();i++) {
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++) {
				System.out.print(cols.get(j).getText()+"  ");
			}
			System.out.println();
		}
		
		//for printing the names in the table
		System.out.println("----Name----");
		for(int i=1;i<rows.size();i++) {
			String name = rows.get(i).findElements(By.tagName("td")).get(0).getText();
			System.out.println(name);
		}
		
		//for getting the age of particular person
		for(int i=1;i<rows.size();i++) {
			List<WebElement> age = rows.get(i).findElements(By.tagName("td")); 
			if(age.get(0).getText().equalsIgnoreCase("praveen")) {
				System.out.println("Praveen age is :"+age.get(1).getText());
			}
		}
	}

}
