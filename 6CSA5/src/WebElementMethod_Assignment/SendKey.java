package WebElementMethod_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKey {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement web=driver.findElement(By.xpath("//input[@name='username']"));
		web.sendKeys("admin");
		web=driver.findElement(By.xpath("//input[@name='pwd']"));
		web.sendKeys("manager");
		web=driver.findElement(By.id("loginButton"));
		web.click();
	}

}
