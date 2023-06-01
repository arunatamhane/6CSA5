package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://terna.qualcampus.com/Account/LogOn");
		driver.findElement(By.tagName("head"));
		System.out.println("Element Identified");
		System.out.println("1");
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.tagName("title"));
		System.out.println("Element Identified");
		System.out.println("2");
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.tagName("link"));
		System.out.println("Element Identified");
		System.out.println("3");
		
		
		driver.get("https://github.com/");
		driver.findElement(By.tagName("main"));
		System.out.println("Element Identified");
		System.out.println("4");
		
		
		driver.get("https://www.linkedin.com/login");
		driver.findElement(By.tagName("code"));
		System.out.println("Element Identified");
		System.out.println("5");
		
		
		driver.get("https://trainings.internshala.com/?utm_source=Google-Search&utm_campaign=CT-Search-Brand-Oct22&utm_adgroup=Brand&utm_locationinterest=&utm_searchkeyword=internshala&utm_keywordid=kwd-296575527534&gclid=Cj0KCQjw4NujBhC5ARIsAF4Iv6crfdhH9-RuIag4OZ6Ss4S-iFA7geJ7O18xBf1eouunH6LUsmYqbLcaAi2LEALw_wcB");
		driver.findElement(By.tagName("section"));
		System.out.println("Element Identified");
		System.out.println("6");
		
		driver.get("https://www.coursera.org/?utm_source=gg&utm_medium=sem&utm_campaign=B2C_INDIA__branded_FTCOF__arte&utm_content=B2C&campaignid=18216928764&adgroupid=141296025832&device=c&keyword=coursera%20login&matchtype=b&network=g&devicemodel=&adpostion=&creativeid=619458216887&hide_mobile_promo&gclid=Cj0KCQjw4NujBhC5ARIsAF4Iv6etIWG1pmHOTeyTXWoZKJ4MuNKARSWJp00NAlQ2lxjtJMJrwUrRaH0aAj-IEALw_wcB");
		driver.findElement(By.tagName("script"));
		System.out.println("Element Identified");
		System.out.println("7");
		
		
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.tagName("div"));
		System.out.println("Element Identified");
		System.out.println("8");
		
		
		driver.get("https://www.zomato.com/india");
		driver.findElement(By.tagName("footer"));
		System.out.println("Element Identified");
		System.out.println("9");
		
		
		driver.get("https://www.foodpanda.com/");
		driver.findElement(By.tagName("html"));
		System.out.println("Element Identified");
		System.out.println("10");
		
		driver.get("https://gaana.com/playlist/priyankathomas5-onlinegaana");
		driver.findElement(By.tagName("body"));
		System.out.println("Element Identified");
		System.out.println("11");
	}

}
