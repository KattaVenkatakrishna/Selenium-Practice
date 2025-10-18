package expectionhandling;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links count :"+links.size());
		int noofbrokenlinks=0;
		for(WebElement alllinks :links) {
			String attval = alllinks.getAttribute("href");
			if(attval==null || attval.isEmpty()) {
				System.out.println("attval is null or empty so not checkable");
				continue;
			}
			try {
				URL u = new URL(attval);
				HttpURLConnection conn = (HttpURLConnection) u.openConnection();
				conn.connect();
				if(conn.getResponseCode()>=400) {
					System.out.println(attval+"===>Broken Links");
					noofbrokenlinks++;
				}else {
					System.out.println(attval+"===>Non Broken Links");
				}
				
			}catch(Exception e) {
				
			}
		}
		System.out.println("Total no of broken links :"+noofbrokenlinks);
	}

}
