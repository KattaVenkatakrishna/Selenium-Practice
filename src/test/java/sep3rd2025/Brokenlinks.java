package sep3rd2025;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("List of total links are :" + links.size());
		int noofbrokenlinks = 0;
		for (WebElement linkelement : links) {
			String hrefattributevalue = linkelement.getAttribute("href");
			if (hrefattributevalue == null || hrefattributevalue.isEmpty()) {
				System.out.println("href attribute value is null or empty -- so not possible to check");
				continue;
			}
			try {
				URL linkurl = new URL(hrefattributevalue);// convert href value from string to url format
				HttpURLConnection conn = (HttpURLConnection) linkurl.openConnection();// opens the connection to the server
				conn.connect();// sends the request to the server
				//Any link with response code greater than 400 response are broken links
				if (conn.getResponseCode() >= 400) {
					System.out.println(hrefattributevalue + "=====> Broken Link");
					noofbrokenlinks++;
				} else {
					System.out.println(hrefattributevalue + "=====> Non Broken Link");
				}
			} catch (Exception e) {

			}
		}
		System.out.println("Number of broken links:" + noofbrokenlinks);
	}

}
