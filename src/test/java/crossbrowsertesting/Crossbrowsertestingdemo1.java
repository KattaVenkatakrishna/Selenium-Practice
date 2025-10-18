package crossbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowsertestingdemo1 {
	public static WebDriver driver;
	@Parameters("browser")
	@Test
	public void tc(String b) {
	String browsername=b;
	if(browsername.equalsIgnoreCase("Chrome")) {
		driver=new ChromeDriver();
	}
	else if(browsername.equalsIgnoreCase("Firefox")) {
		driver=new FirefoxDriver();
	}
	else if(browsername.equalsIgnoreCase("Edge")) {
		driver=new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//In the xml file we have to change the value based on that browser will get changed
	}
	
}
