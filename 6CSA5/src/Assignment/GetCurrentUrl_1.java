package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl_1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.whatsapp.com/");
		String d=driver.getTitle();
		String a=driver.getCurrentUrl();
		String e="https://www.whatsapp.com/";
		String g="WhatsApp";
		if(d.equals(g))
			System.out.println("Title Verified");
		else
			System.out.println("Fail To Verified title");
		if(a.equals(e))
			System.out.println("Url Verified");
		else
			System.out.println("fail To Verified URL");
	}

}
