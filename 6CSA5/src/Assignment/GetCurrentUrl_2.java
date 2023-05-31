package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl_2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String a=driver.getCurrentUrl();
		String d=driver.getTitle();
		String g="Facebook – log in or sign up";
		String e="https://www.facebook.com/";
		if(d.equals(g))
			System.out.println("Title Verified");
		else
			System.out.println("fail to verified title");
		if(a.equals(e))
			System.out.println("url vrified");
		else
			System.out.println("fail to verified");
	}


}
