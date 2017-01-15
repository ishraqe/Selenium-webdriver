package basics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class scrollBypixel {

	public static void main(String[] args) {
	WebDriver driver=	chrome.chDriver();
	driver.manage().window().maximize();
	driver.get("https://shejulhussen.wordpress.com/2013/11/08/%E0%A6%B8%E0%A7%8D%E0%A6%AE%E0%A7%83%E0%A6%A4%E0%A6%BF%E0%A6%AE%E0%A7%87%E0%A6%98-%E0%A6%B8%E0%A7%8D%E0%A6%AC%E0%A6%AA%E0%A7%8D%E0%A6%A8%E0%A6%9C%E0%A6%B2%E0%A6%B0%E0%A7%87%E0%A6%96%E0%A6%BE-3/");

	JavascriptExecutor jExecutor= (JavascriptExecutor)driver;
	jExecutor.executeScript("window.scrollBy(0,650)");
	
//	or
	//jExecutor.executeScript("scroll(0,250);");
	
	}

}
