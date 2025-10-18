package crossbrowsertesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class crossbrowsertestingdemo {
public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		//way-1 ====> using the main method
	/*	String browsername="edge";
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
		driver.get("https://www.facebook.com/");*/
		
		//way-2 ===>using file
		Properties prop = new Properties();
		File f= new File("config.properties");
		FileInputStream fis = new FileInputStream(f);
		prop.load(fis);
		
		String browsername=prop.getProperty("browser");
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
		
		//way-3 ===> is done using xml file refer crossbrowsertestingdemo1 and crossbrowsertesting.xml

	}

}
