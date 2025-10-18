package sep3rd2025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Taskomayowebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//multi select box
		WebElement multiselect = driver.findElement(By.xpath("//select[@id='multiselect1']"));
	   Select s= new Select(multiselect);
	   s.selectByVisibleText("Volvo");
	   //drop down
	  WebElement dropdown = driver.findElement(By.xpath("//select[@id='drop1']"));
	  Select s1= new Select(dropdown);
	  s1.selectByIndex(1);
	  //Text Area Field
	  driver.findElement(By.id("ta1")).sendKeys("Text area field one");
	  //text box with pre loaded text
	  WebElement ptb = driver.findElement(By.id("textbox1"));
	  ptb.clear();
	  ptb.sendKeys("pre loaded text box");
	  //open new window link
	  driver.findElement(By.id("link2")).click();
	}

}
