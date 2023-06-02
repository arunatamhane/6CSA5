package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialTextLink {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.lenskart.com/");
		driver.findElement(By.partialLinkText("Engineer"));
		System.out.println(" 1 found");
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.partialLinkText("Ter"));
		System.out.println(" 2 found");
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.partialLinkText("Forgott"));
		System.out.println(" 3 found");
		
		driver.get("https://github.com/");
		driver.findElement(By.partialLinkText("Conta"));
		System.out.println(" 4 found");
		
		driver.get("https://www.linkedin.com/login");
		driver.findElement(By.partialLinkText("J"));
		System.out.println(" 5 found");
		
		driver.get("https://trainings.internshala.com/?utm_source=Google-Search&utm_campaign=CT-Search-Brand-Oct22&utm_adgroup=Brand&utm_locationinterest=&utm_searchkeyword=internshala&utm_keywordid=kwd-296575527534&gclid=Cj0KCQjw4NujBhC5ARIsAF4Iv6crfdhH9-RuIag4OZ6Ss4S-iFA7geJ7O18xBf1eouunH6LUsmYqbLcaAi2LEALw_wcB");
		driver.findElement(By.partialLinkText("Clou"));
		System.out.println(" 6 found");
		
		driver.get("https://www.coursera.org/?utm_source=gg&utm_medium=sem&utm_campaign=B2C_INDIA__branded_FTCOF__arte&utm_content=B2C&campaignid=18216928764&adgroupid=141296025832&device=c&keyword=coursera%20login&matchtype=b&network=g&devicemodel=&adpostion=&creativeid=619458216887&hide_mobile_promo&gclid=Cj0KCQjw4NujBhC5ARIsAF4Iv6etIWG1pmHOTeyTXWoZKJ4MuNKARSWJp00NAlQ2lxjtJMJrwUrRaH0aAj-IEALw_wcB");
		driver.findElement(By.partialLinkText("Become"));
		System.out.println(" 7 found");
		
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.partialLinkText("Kolkata"));
		System.out.println(" 8 found");
		
		driver.get("https://www.shaadi.com/join-now?ptnr=sricrbrn001m&aff_url_param=g&gclid=CjwKCAjwg-GjBhBnEiwAMUvNW7PgLbM3SADi-6Dulj9SDu4aVsIvtbTUR1vjBbj47QuEEK10lfslahoCIaMQAvD_BwE");
		driver.findElement(By.partialLinkText("U"));
		System.out.println(" 9 found");
		
		driver.get("https://www.foodpanda.com/");
		driver.findElement(By.partialLinkText("Priva"));
		System.out.println(" 10 found");
		
		
		driver.quit();
	}


}
