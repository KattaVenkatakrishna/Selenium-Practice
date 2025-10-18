package sep3rd2025;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*how to take screenshot of web page and single element screenshot
 * how to perform double click in selenium --write xpath and store in varible then use actions class doubleClick(varible).perform()
 * how to click on an element which is not clickable in selenium --write xpath and store in varible then use actions class 
 * a.moveToElement(v).perform() method
 * how to perform shift+ctrl+s in selenium --actions class keyDown(Keys.SHIFT).KeyUP(Keys.SHIFT).perform()
 * how to perform drag and drop in selenium --web element xpath actions class object drag xpath drop xpath  a.dragAndDrop(drag,drop).perform()
 * how to handle sliders in selenium --actions class object dragAndDropBy(red,10,30);
 * how to handle checkbox and radiobuttons in selenium -- write xpath and store in varible then use variable.click();
 * how to print the text of all the links present on the web page using selenium
 * List<WebElement> links
        = driver.findElements(By.tagName("a"));

    // Iterating through all the Links and printing link
    // text
    for (WebElement link : links) {
        System.out.println(link.getText());
 * how to handle frames in selenium and how to back from frames in selenium --driver.switchTo().frame(0) element xpath perform action 
 * driver.switchTo().defaultContent();
 * how to refresh a page in selenium --driver.navigate().refresh();
 * how to handle alerts and pop up in selenium --xpath perform action driver.switchTo().alert().accept()driver.switchTo().alert().dismiss() 
 * how to verify a color of web element in selenium web driver --write xpath and store in a variable then 
 * variable.getCssValue(color - for font color / background-color for background color) used to get color
 * how to handle web driver methods in selenium
 * how to handle locators in selenium
 * how to dropdown in selenium
 */



public class AlertsTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(3000);
		String T =  driver.switchTo().alert().getText();
		System.out.println(T);
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(3000);
		Alert sendtext = driver.switchTo().alert();
		sendtext.sendKeys("Krishna");
		sendtext.accept();
	}

}
