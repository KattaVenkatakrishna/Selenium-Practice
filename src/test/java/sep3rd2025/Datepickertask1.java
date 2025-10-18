package sep3rd2025;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickertask1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The Year :");
		String targetYear = s.next();
		System.out.print("Enter The Month :");
		String targetMonth = s.next();
		System.out.print("Enter The Date :");
		String Date = s.next();
		s.close();
		//List of months
		List<String> months = Arrays.asList(
	            "January", "February", "March", "April", "May", "June",
	            "July", "August", "September", "October", "November", "December");
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		while(true) {
			String monthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			String arr[] = monthyear.split(" ");
			String currentmonth = arr[0];
			String currentyear = arr[1];
			
			if(currentmonth.equalsIgnoreCase(targetMonth) && currentyear.equalsIgnoreCase(targetYear)) {
				break;
			}
			
			else {
				int currentmonnthindex = months.indexOf(currentmonth);
				int targetmonthindex = months.indexOf(targetMonth);
				
				if(Integer.parseInt(currentyear)<Integer.parseInt(targetYear)
						||(Integer.parseInt(currentyear)==Integer.parseInt(targetYear) 
						&& currentmonnthindex < targetmonthindex )){
					
					driver.findElement(By.xpath("//a[@title='Next']")).click();
					
				}
				
				else {
					
					driver.findElement(By.xpath("//a[@title='Prev']")).click();
					
				}
			}
		}
		
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for(WebElement ele : alldates) {
			String dt = ele.getText();
			if(dt.equals(Date)) {
				ele.click();
			}
		}
	}
}
