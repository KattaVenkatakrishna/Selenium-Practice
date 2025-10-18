package sep3rd2025;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Taskdemoqa {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		// Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("firstName")).sendKeys("krishna");
		driver.findElement(By.id("lastName")).sendKeys("katta");
		driver.findElement(By.id("userEmail")).sendKeys("1234@gmail.com");
		Thread.sleep(3000);
		// for selecting the gender radio button
		WebElement gender = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true)", gender);
		jse.executeScript("arguments[0].click()", gender);
		Actions act = new Actions(driver);
		driver.findElement(By.id("userNumber")).sendKeys("1234567890");
		Thread.sleep(3000);
		// driver.switchTo().frame(11);
		Thread.sleep(3000);
		// for entering the data in the subject text field
		WebElement subjects = driver.findElement(By.xpath("//div[contains(@class,'subjects-auto-complete__va')]"));
		boolean status = subjects.isDisplayed();
		System.out.println("Subjects is dispalyed :" + status);
		act.moveToElement(subjects).sendKeys("Automation Testing").perform();
		// driver.switchTo().defaultContent();
		// for selecting the hobbies checkbox
		WebElement hobbies = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
		jse.executeScript("arguments[0].scrollIntoView(true)", hobbies);
		jse.executeScript("arguments[0].click()", hobbies);
		Thread.sleep(3000);
		WebElement picture = driver.findElement(By.id("uploadPicture"));
		jse.executeScript("arguments[0].scrollIntoView(true)", picture);
		jse.executeScript("arguments[0].click()", picture);
		Thread.sleep(3000);
		String path = "C:\\Users\\91832\\Downloads\\sai new resume 12.pdf";
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
		Thread.sleep(3000);
		driver.findElement(By.id("currentAddress")).sendKeys("Kondapur");
		Thread.sleep(3000);
		WebElement selectstate = driver.findElement(By.xpath("//div[text()='Select State']"));
		if (selectstate.isDisplayed() == true) {
			System.out.println("selected in displayed");
			selectstate.click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement text = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Select State']")));
			text.sendKeys("NCR");
		}
	}
}
