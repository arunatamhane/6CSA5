package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl_5 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spotify.com/");
		String d=driver.getTitle();
		String a=driver.getCurrentUrl();
		String e="https://open.spotify.com/?";
		String g="";
		if(a.equals(e))
			System.out.println("pass");
		else
			System.out.println("fail");
	}

}
