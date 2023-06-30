package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectCombine {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("C:\\Users\\ADMIN\\Desktop\\htmlcodes\\select.html");
		WebElement WeE = driver.findElement(By.id("d"));
		Select sl=new Select(WeE);
		sl.selectByIndex(0);
		sl.selectByValue("2");
		sl.selectByVisibleText("N");
		
	}

}
