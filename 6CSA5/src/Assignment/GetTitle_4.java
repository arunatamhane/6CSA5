package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_4 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.fb.com/");
		System.out.println(driver.getTitle());
	}

}
