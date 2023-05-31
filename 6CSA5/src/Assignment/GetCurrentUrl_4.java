package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl_4 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://terna.qualcampus.com/Account/LogOn");
		String d=driver.getTitle();
		String g="Log";
		String a=driver.getCurrentUrl();
		String e="https://terna.qualcampus.com/Account/LogOn";
		if(d.equals(g))
			System.out.println("title verified");
		else
			System.out.println("(title)fail to verified");
		
		if(a.equals(e))
			System.out.println("url verified");
		else
			System.out.println("(url)fail to verified");
	}

}
