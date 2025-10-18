package sep3rd2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickertask {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='11']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Prev']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='16']")).click();
		driver.findElement(By.tagName("html"));
		driver.findElement(By.id("email"));
		driver.findElement(By.name("email"));
		driver.findElement(By.className("email"));
		driver.findElement(By.linkText("https://www.facebook.com/recover/initiate/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzU4Nzk1NTk1LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&ars=facebook_login&next"));
		driver.findElement(By.partialLinkText("https://www.facebook.")).click();
		driver.findElement(By.cssSelector("a#email"));
		driver.findElement(By.cssSelector("a.inputtext _55r1 _6luy"));
		driver.findElement(By.cssSelector("a[id='email']"));
		driver.findElement(By.cssSelector("a.class[id='email']"));
	}

}
