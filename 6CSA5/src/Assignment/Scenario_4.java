package Assignment;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// 1 print all the cookies in the domain
// 2 create two cookies and add it to the domain
// 3 print all the cookies in the domain
// 4 delete one cookie with deleteCookie()
// 5 print all the cookies in the domain
// 6 delete another cookie with deleteCookieNamed()
// 7 print all the cookies in the domain

public class Scenario_4 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");

		Set<Cookie> ck = driver.manage().getCookies();
		System.out.println(ck.size());
		for (Cookie cookie : ck) 
			System.out.println(cookie.getName());//1
		System.out.println("*************************");

		Cookie ck1=new Cookie("Aruna","123");
		Cookie ck2=new Cookie("Siddhesh","567");
		driver.manage().addCookie(ck1);
		driver.manage().addCookie(ck2);//2

		ck = driver.manage().getCookies();
		System.out.println(ck.size());
		for (Cookie cookie : ck) 
			System.out.println(cookie.getName());//3
		System.out.println("*************************");

		driver.manage().deleteCookie(ck1);//4

		ck = driver.manage().getCookies();
		System.out.println(ck.size());
		for (Cookie cookie : ck) 
			System.out.println(cookie.getName());//5
		System.out.println("**************************");

		driver.manage().deleteCookieNamed("Siddhesh");//6

		ck = driver.manage().getCookies();
		System.out.println(ck.size());
		for (Cookie cookie : ck) 
			System.out.println(cookie.getName());//7

	}

}
