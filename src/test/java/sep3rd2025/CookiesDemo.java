package sep3rd2025;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/");
		//how to capture cookies from browser
		Set<Cookie> cookie = driver.manage().getCookies();
		System.out.println("Size of the cookies :"+cookie.size());
		//how to print cookies from browser
		for(Cookie cookies : cookie) {
			System.out.println(cookies.getName()+" : "+cookies.getValue());	
		}
		//how to add cookies to the browser
		Cookie cobj = new Cookie("krishna", "katta");
		driver.manage().addCookie(cobj);
		cookie = driver.manage().getCookies();
		System.out.println("Size of the cookies :"+cookie.size());
		//how to delete specific cookie from the browser
		driver.manage().deleteCookieNamed("krishna");
		cookie = driver.manage().getCookies();
		System.out.println("Size of the cookies :"+cookie.size());
		//how delete all cookies from the browser
		driver.manage().deleteAllCookies();
		cookie = driver.manage().getCookies();
		
		System.out.println("Size of the cookies :"+cookie.size());
	}

}
