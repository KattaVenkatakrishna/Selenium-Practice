package Frameworkpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Assertionsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login");
		//Hard Assert
		//System.out.println(driver.getTitle());
	/*	Assert.assertEquals(driver.getTitle(), "Test Login | Practice Test Automatio");
		driver.findElement(By.id("username")).sendKeys("student");*/
		//soft Assert
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(driver.getTitle(), "Test Login | Practice Test Automatio");
		driver.findElement(By.id("username")).sendKeys("student");

	}

}
