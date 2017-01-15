package basics;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class implicitWait {

	public static void main(String[] args) {
	WebDriver driver=chrome.chDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/?gws_rd=ssl#q=ghghh");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	JavascriptExecutor jExecutor=(JavascriptExecutor)driver;
	jExecutor.executeScript("scrollBy(0,1200);");
	}

}
