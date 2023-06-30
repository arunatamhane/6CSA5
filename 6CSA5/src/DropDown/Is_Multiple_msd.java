package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Is_Multiple_msd {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("C:\\Users\\ADMIN\\Desktop\\htmlcodes\\select.html");
		WebElement Find = driver.findElement(By.id("B"));
		Select sl=new Select(Find);
		System.out.println(sl.isMultiple());
		driver.close();
	}

}
