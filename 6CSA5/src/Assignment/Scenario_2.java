package Assignment;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// 1 print all the cookies in the domain
// 2 delete the cookie with deleteCookieNamed()
// 3 print all cookies in the domain
public class Scenario_2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");
		
		Set<Cookie> ck=driver.manage().getCookies();
		System.out.println(ck.size());
		for (Cookie cookie : ck) 
			System.out.println(cookie.getName());//1
		System.out.println("-------------------------");
			
		driver.manage().deleteCookieNamed("datr"); //2
		
		ck=driver.manage().getCookies();
		System.out.println(ck.size());
		for (Cookie cookie : ck) 
			System.out.println(cookie.getName()); //3
		}

}
