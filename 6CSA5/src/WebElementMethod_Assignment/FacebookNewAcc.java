package WebElementMethod_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookNewAcc {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fb.com");
		WebElement newAcc=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		newAcc.click();
		Thread.sleep(3000);
		WebElement FN=driver.findElement(By.name("firstname"));
		FN.click();
		FN.sendKeys("Aruna");
		WebElement LN=driver.findElement(By.name("lastname"));
		LN.click();
		Thread.sleep(3000);
		LN.sendKeys("Tamhane");
		WebElement Email=driver.findElement(By.name("reg_email__"));
		Email.sendKeys("aruna2023@gmail.com");
		
		WebElement gender=driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
		gender.click();
	}

}
