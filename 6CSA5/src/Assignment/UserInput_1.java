package Assignment;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UserInput_1 {
	public static void main(String[] args) {
		System.out.println("Hey user please enter the browser name that you want to open");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		WebDriver driver = null;
		if(a.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
//			driver.get("https://terna.qualcampus.com/Account/LogOn");
		}
		else if(a.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
//			driver.get("https://www.flipkart.com/");
		}
		else
		{
			System.out.println("No Browser");
		}
		
		driver.get("https://www.flipkart.com/");

		
	}

}
