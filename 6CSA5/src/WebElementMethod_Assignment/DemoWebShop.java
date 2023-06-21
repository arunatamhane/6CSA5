package WebElementMethod_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement gender=driver.findElement(By.id("gender-female"));
		gender.click();
		Thread.sleep(2000);
		WebElement FirstName=driver.findElement(By.id("FirstName"));
		FirstName.sendKeys("Aruna");
		Thread.sleep(2000);
		WebElement LastName=driver.findElement(By.id("LastName"));
		LastName.sendKeys("Tamhane");
		Thread.sleep(2000);
        WebElement Email=driver.findElement(By.id("Email"));
        Email.sendKeys("art2023@gmail.com");
        Thread.sleep(2000);
        WebElement Password=driver.findElement(By.name("Password"));
        Password.sendKeys("123456");
        WebElement CPassword=driver.findElement(By.id("ConfirmPassword"));
        CPassword.sendKeys("123456");
        Thread.sleep(3000);
        WebElement Register=driver.findElement(By.id("register-button"));
        Register.click();
		
		
		
	}

}
