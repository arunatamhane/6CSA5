package Assignment;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// 1 print all the cookies in the domain
// 2 create your own cookie and add it to the domain
// 3 print all the cookies in the domain
// 4 delete the created cookie with deleteCookieNamed()
// 5 print all the cookies in the domain

public class Scenario_3 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");
		
		Set<Cookie> ck=driver.manage().getCookies();
		System.out.println(ck.size());
		for (Cookie cookie : ck) 
			System.out.println(cookie.getName()); // 1
		
		System.out.println("***************************************************");
		
		Cookie ck1=new Cookie("Aruna","1234");
		driver.manage().addCookie(ck1); // 2
		
		ck=driver.manage().getCookies();
		System.out.println(ck.size());
		for (Cookie cookie : ck) 
			System.out.println(cookie.getName()); //3
		System.out.println("*****************************************************");
		
		driver.manage().deleteCookieNamed("Aruna"); // 4
		
		ck=driver.manage().getCookies();
		System.out.println(ck.size());
		for (Cookie cookie : ck) 
			System.out.println(cookie.getName()); //5
		System.out.println("*****************************************************");
			
		
		
	}


}
