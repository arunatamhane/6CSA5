package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://colab.research.google.com/?utm_source=scs-index");
		System.out.println(driver.getTitle());
	}

}
