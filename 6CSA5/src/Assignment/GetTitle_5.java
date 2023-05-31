package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_5 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458755421&hvpos=&hvnetw=g&hvrand=7689487373223018091&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9303628&hvtargid=kwd-10573980&hydadcr=14453_2154373");
		System.out.println(driver.getTitle());
	}

}
