package WebElementMethod_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\ADMIN\\Downloads\\form.html");
		WebElement web=driver.findElement(By.xpath("//input[@value='B']"));
		web.clear();
		
	}

}
