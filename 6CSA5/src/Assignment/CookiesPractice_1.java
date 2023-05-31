package Assignment;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesPractice_1 {
	public static void main(String[] args) {		
		//open the browser
		WebDriver driver=new ChromeDriver();
		
		//open the application
		driver.get("https://fb.com");
		
		//print all cookies
		Set<Cookie> cooky=driver.manage().getCookies();
		System.out.println(cooky.size());
		for(Cookie single:cooky)
			System.out.println(single.getName());
		System.out.println("--------------------------------------------------------------------");
		
		//create 3 cookies AND ADD
		Cookie ck1=new Cookie("A","1");
		Cookie ck2=new Cookie("B","2");
		Cookie ck3=new Cookie("C","3");
		driver.manage().addCookie(ck1);
		driver.manage().addCookie(ck2);
		driver.manage().addCookie(ck3);
		
		//print cookies
	    cooky=driver.manage().getCookies();
		System.out.println(cooky.size());
		for(Cookie single:cooky)
			System.out.println(single.getName());
		System.out.println("--------------------------------------------------------------------");

		
		//delete cookie name 
		driver.manage().deleteCookieNamed("A");
		
		//print all cookies
		cooky=driver.manage().getCookies();
		System.out.println(cooky.size());
		for(Cookie single:cooky)
			System.out.println(single.getName());
		System.out.println("--------------------------------------------------------------------");

		
		//delete cookie by cookie variable
		driver.manage().deleteCookie(ck3);
		
		//print all cookies
		cooky=driver.manage().getCookies();
		System.out.println(cooky.size());
		for(Cookie single:cooky)
			System.out.println(single.getName());
		System.out.println("--------------------------------------------------------------------");

		
		//delete all cookies
		
		driver.manage().deleteAllCookies();
		
		//print all cookies
		cooky=driver.manage().getCookies();
		System.out.println(cooky.size());
		for(Cookie single:cooky)
			System.out.println(single.getName());
		
		
		
	}

}
