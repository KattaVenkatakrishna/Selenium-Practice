package sep3rd2025;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadusingtherobotclass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		Thread.sleep(3000);
		driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.xpath("(//div[@class='focusable optionWrap  '])[1]")).click();
		Thread.sleep(3000);
		//WebElement resumebtn = driver.findElement(By.cssSelector("button.uploadResume "));
		WebElement resumebtn = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();", resumebtn);
		resumebtn.click();
		Thread.sleep(3000);
		
		//to handle file upload using awt.package  ---stringselection--clipboard--toolkit
		
		//upload file size with less than 2mb
		
		String path = "C:\\Users\\91832\\Downloads\\sai new resume 12.pdf";
		
		//upload file size with more than 2mb
		
		//String path = "C:\\Users\\91832\\Downloads\\Java Full Notes.pdf";
		StringSelection stringselect = new StringSelection(path);
		Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
		clip.setContents(stringselect, null);
		Thread.sleep(3000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.delay(2000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		}

}
