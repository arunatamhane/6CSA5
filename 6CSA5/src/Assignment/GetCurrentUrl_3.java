package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl_3 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String d=driver.getTitle();
		String g="Instagram";
		String a=driver.getCurrentUrl();
		String e="https://www.instagram.com/";
		if(d.equals(g))
			System.out.println("Title Verified");
		else
			System.out.println("fail to verified title");
		
		if(a.equals(e))
			System.out.println("url vrified");
		else
			System.out.println("fail");
	}

}
