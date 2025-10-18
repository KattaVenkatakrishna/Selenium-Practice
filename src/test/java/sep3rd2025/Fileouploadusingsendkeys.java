package sep3rd2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileouploadusingsendkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		//file upload by using sendkeys
		driver.findElement(By.id("input-4")).sendKeys("C:\\Users\\91832\\Downloads\\sai new resume 12.pdf");

	}

}
