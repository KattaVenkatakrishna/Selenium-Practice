package sep3rd2025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkartslider {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/search?q=washing+machine+7+kg&as=on&as-show=on&otracker=AS_Query_OrganicAutoSuggest_3_7_na_na_na&otracker1=AS_Query_OrganicAutoSuggest_3_7_na_na_na&as-pos=3&as-type=RECENT&suggestionId=washing+machine+7+kg&requestId=499aa58c-5a0f-4d67-9055-3f2a21aa1f17&as-backfill=on");
		WebElement rightSlider = driver.findElement(By.xpath("(//div[@class='PYKUdo'])[1]"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(rightSlider, 75, 0).perform();
		//act.clickAndHold(rightSlider).moveByOffset(75, 0).release().perform();
	}

}
