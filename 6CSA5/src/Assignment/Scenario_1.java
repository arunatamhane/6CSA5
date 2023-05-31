package Assignment;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// 1 print all the cookies in the domain
// 2 create your own cookie and add it to the domain
// 3 print all the cookies in the domain
// 4 delete the created cookie with deleteCookie()
// 5 print all the cookies in the domain
public class Scenario_1 {
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");
		
		Set<Cookie> ck=driver.manage().getCookies();
		System.out.println(ck.size());
		for (Cookie cookie : ck) {
			System.out.println(cookie.getName());
		}
		System.out.println("-------------------------------------------");
		
		Cookie ck1=new Cookie("Aruna","123");
		driver.manage().addCookie(ck1);
		ck=driver.manage().getCookies();
		System.out.println(ck.size());
		for (Cookie cookie : ck) {
			System.out.println(cookie.getName());
		}
		
		System.out.println("--------------------------------------------");
		
		driver.manage().deleteCookie(ck1);
		ck=driver.manage().getCookies();
		System.out.println(ck.size());
		for (Cookie cookie : ck) {
			System.out.println(cookie.getName());
		}
		
}
}
