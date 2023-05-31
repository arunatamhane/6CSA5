package Assignment;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UserInput_3 {
	public static void main(String[] args) {
		WebDriver driver=null;
		System.out.println("enter browser name");
		Scanner sc= new Scanner(System.in);
		String ss=sc.nextLine();
		System.out.println("enter url");
		String s = sc.nextLine();
		if(ss.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if(ss.equalsIgnoreCase("edge"))
			driver= new EdgeDriver();
		driver.get(s);
		driver.manage().window().maximize();



	}

}
