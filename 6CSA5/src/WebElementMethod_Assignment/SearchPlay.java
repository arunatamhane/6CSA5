package WebElementMethod_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchPlay {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Arijit singh songs");
		driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
		driver.findElement(By.xpath("//div[@id='dismissible']")).click();
	}

}
