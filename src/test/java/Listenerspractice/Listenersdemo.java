package Listenerspractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

//@listeners -----> implement at class level
public class Listenersdemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+"Test Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+"Test Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+"Test Failure");
	   Object currentclass = result.getInstance();
	   WebDriver driver = ((demo)currentclass).driver;
	   String path="C:\\Users\\91832\\eclipse-workspace\\Testng_Framework\\Screenshot\\krishna.png";
	   TakesScreenshot ts = (TakesScreenshot) driver;
	   File src = ts.getScreenshotAs(OutputType.FILE);
	   File dest = new File(path);
	   try {
		Files.copy(src, dest);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

}
