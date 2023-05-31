package Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UserInput_2 {
	public static void main(String[] args) {
//		System.out.println("Hey user please enter the browser name that you want to open");
//		Scanner sc=new Scanner(System.in);
//		String a=sc.nextLine();
//		if(a.equals("abc"))
//		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://terna.qualcampus.com/Account/LogOn");
//			Point D=new Point(500,30);
//			driver.manage().window().setPosition(D);
			Dimension d1=new Dimension(800,3000);
			driver.manage().window().setSize(d1);
			
		    WebDriver driver1=new EdgeDriver();
			driver1.get("https://www.facebook.com/");
			Dimension k=new Dimension(650,2000);
			driver1.manage().window().setSize(k);
			Point p=new Point(900, 10);
			driver1.manage().window().setPosition(p);
//		}

		
	}

}
