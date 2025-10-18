package Frameworkpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametertesting {
	WebDriver driver;
	@Parameters({"URL","UN","Pass"})
	@Test
	public void tc(String appurl, String UN, String Pass) {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appurl);
		driver.findElement(By.id("username")).sendKeys(UN);
		driver.findElement(By.name("password")).sendKeys(Pass);
		driver.findElement(By.xpath("//input[@name='login']")).click();
	}
	@Parameters({"URL1"})
	@Test
	public void tc1(String appurl) {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appurl);
	}

}
